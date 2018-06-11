package io.pivotal.cso.loaddata;

import java.util.UUID;

import org.apache.geode.cache.CacheFactory;
import org.apache.geode.cache.Region;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.data.GemfireItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.gemfire.GemfireTemplate;

@Configuration
@EnableBatchProcessing
public class BatchConfigurationCisCustBaseInfo {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;


    @Value("${file.input.csvName.cis_cust_base_info}")
    private String inputFileName;

    @Value("${attributes.list.cis_cust_base_info}")
    private String[] attributesList;
    
    @Value("${itemGenerator.limit.cis_cust_base_info}")
    private Long itemGeneratorLimit;

    @Value("${spring.batch.chunk.control}")
    private Integer chunkControl;

    // tag::readerwriterprocessor[]

    //to get obj from file
    @Bean
    public FlatFileItemReader<CisCustBaseInfo> readerCisCustBaseInfo() {
        FlatFileItemReader<CisCustBaseInfo> reader = new FlatFileItemReader<CisCustBaseInfo>();

        reader.setResource(new ClassPathResource(inputFileName));
        // skip csv header
        reader.setLinesToSkip(1);
        reader.setLineMapper(new DefaultLineMapper<CisCustBaseInfo>() {
            {
                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames(attributesList);
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<CisCustBaseInfo>() {
                    {
                        setTargetType(CisCustBaseInfo.class);
                    }
                });
            }
        });
        return reader;
    }


    @Bean
    public GemfireTemplate cisCustBaseInfoGemFireTemplate() {
        Region historyRegion = CacheFactory.getAnyInstance().getRegion("cis_cust_base_info");
        GemfireTemplate historyGemFireTemplate = new GemfireTemplate();
        historyGemFireTemplate.setRegion(historyRegion);
        return historyGemFireTemplate;
    }


    @Bean
    public GemfireItemWriter<String, CisCustBaseInfo> writerCisCustBaseInfo() {
        GemfireItemWriter<String, CisCustBaseInfo> writer = new GemfireItemWriter<String, CisCustBaseInfo>();
        writer.setTemplate(this.cisCustBaseInfoGemFireTemplate());
        writer.setItemKeyMapper(new Converter<CisCustBaseInfo, String>() {
            public String convert(CisCustBaseInfo cisCustBaseInfo) {
                return cisCustBaseInfo.getCust_id();
            }
        });
        return writer;
    }


    @Bean
    public Step stepImportCisCustBaseInfo() {
        return stepBuilderFactory.get("stepImportCisCustBaseInfo").<CisCustBaseInfo, CisCustBaseInfo>chunk(chunkControl).reader(readerCisCustBaseInfo())
                .writer(writerCisCustBaseInfo()).build();

    }
    
    @Bean
    public Step stepMoreCisCustBaseInfo() throws Exception {
    	FlatFileItemReader<CisCustBaseInfo> fileReader = readerCisCustBaseInfo();
    	fileReader.open(new ExecutionContext());
		CisCustBaseInfo template = fileReader.read();
		ItemGenerator<CisCustBaseInfo> gen = new ItemGenerator<CisCustBaseInfo>();
		gen.setLimit(itemGeneratorLimit);
		gen.setTemplate(template);
		
		return stepBuilderFactory.get("stepMoreCisCustBaseInfo")
				.<CisCustBaseInfo, CisCustBaseInfo>chunk(chunkControl)
				.reader(gen)
                .writer(writerCisCustBaseInfo()).build();
    }
    // end::jobstep[]
}
