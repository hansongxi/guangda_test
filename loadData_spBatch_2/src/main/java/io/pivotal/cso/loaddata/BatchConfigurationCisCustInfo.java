package io.pivotal.cso.loaddata;

import java.util.UUID;

import org.apache.geode.cache.CacheFactory;
import org.apache.geode.cache.Region;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ExecutionContext;
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
public class BatchConfigurationCisCustInfo {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;


    @Value("${file.input.csvName.cis_cust_info}")
    private String inputFileName;

    @Value("${attributes.list.cis_cust_info}")
    private String[] attributesList;
    
    @Value("${itemGenerator.limit.cis_cust_info}")
    private Long itemGeneratorLimit;

    @Value("${spring.batch.chunk.control}")
    private Integer chunkControl;

    // tag::readerwriterprocessor[]

    //to get obj from file
    @Bean
    public FlatFileItemReader<CisCustInfo> readerCisCustInfo() {
        FlatFileItemReader<CisCustInfo> reader = new FlatFileItemReader<CisCustInfo>();

        reader.setResource(new ClassPathResource(inputFileName));
        // skip csv header
        reader.setLinesToSkip(1);
        reader.setLineMapper(new DefaultLineMapper<CisCustInfo>() {
            {
                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames(attributesList);
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<CisCustInfo>() {
                    {
                        setTargetType(CisCustInfo.class);
                    }
                });
            }
        });
        return reader;
    }


    @Bean
    public GemfireTemplate cisCustInfoGemFireTemplate() {
        Region historyRegion = CacheFactory.getAnyInstance().getRegion("cis_cust_info");
        GemfireTemplate historyGemFireTemplate = new GemfireTemplate();
        historyGemFireTemplate.setRegion(historyRegion);
        return historyGemFireTemplate;
    }


    @Bean
    public GemfireItemWriter<String, CisCustInfo> writerCisCustInfo() {
        GemfireItemWriter<String, CisCustInfo> writer = new GemfireItemWriter<String, CisCustInfo>();
        writer.setTemplate(this.cisCustInfoGemFireTemplate());
        writer.setItemKeyMapper(new Converter<CisCustInfo, String>() {
            public String convert(CisCustInfo cisCustInfo) {
                return cisCustInfo.getCust_id();
            }
        });
        return writer;
    }


    @Bean
    public Step stepImportCisCustInfo() {
        return stepBuilderFactory.get("stepImportCisCustInfo").<CisCustInfo, CisCustInfo>chunk(chunkControl).reader(readerCisCustInfo())
                .writer(writerCisCustInfo()).build();

    }
    
    @Bean
    public Step stepMoreCisCustInfo() throws Exception {
    	FlatFileItemReader<CisCustInfo> fileReader = readerCisCustInfo();
    	fileReader.open(new ExecutionContext());
    	CisCustInfo template = fileReader.read();
		ItemGenerator<CisCustInfo> gen = new ItemGenerator<CisCustInfo>();
		gen.setLimit(itemGeneratorLimit);
		gen.setTemplate(template);
		
		return stepBuilderFactory.get("stepMoreCisCustInfo")
				.<CisCustInfo, CisCustInfo>chunk(chunkControl)
				.reader(gen)
                .writer(writerCisCustInfo()).build();
    }
    // end::jobstep[]
}
