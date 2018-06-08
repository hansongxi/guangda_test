package io.pivotal.cso.loaddata;

import java.util.UUID;

import org.apache.geode.cache.CacheFactory;
import org.apache.geode.cache.Region;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
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
public class BatchConfigurationCisCustProdHold {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;


    @Value("${file.input.csvName.cis_cust_prod_hold}")
    private String inputFileName;

    @Value("${attributes.list.cis_cust_prod_hold}")
    private String[] attributesList;

    @Value("${spring.batch.chunk.control}")
    private Integer chunkControl;

    // tag::readerwriterprocessor[]

    //to get obj from file
    @Bean
    public FlatFileItemReader<CisCustProdHold> readerCisCustProdHold() {
        FlatFileItemReader<CisCustProdHold> reader = new FlatFileItemReader<CisCustProdHold>();

        reader.setResource(new ClassPathResource(inputFileName));
        // skip csv header
        reader.setLinesToSkip(1);
        reader.setLineMapper(new DefaultLineMapper<CisCustProdHold>() {
            {
                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames(attributesList);
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<CisCustProdHold>() {
                    {
                        setTargetType(CisCustProdHold.class);
                    }
                });
            }
        });
        return reader;
    }


    @Bean
    public GemfireTemplate cisCustProdHoldGemFireTemplate() {
        Region historyRegion = CacheFactory.getAnyInstance().getRegion("cis_cust_prod_hold");
        GemfireTemplate historyGemFireTemplate = new GemfireTemplate();
        historyGemFireTemplate.setRegion(historyRegion);
        return historyGemFireTemplate;
    }


    @Bean
    public GemfireItemWriter<String, CisCustProdHold> writerCisCustProdHold() {
        GemfireItemWriter<String, CisCustProdHold> writer = new GemfireItemWriter<String, CisCustProdHold>();
        writer.setTemplate(this.cisCustProdHoldGemFireTemplate());
        writer.setItemKeyMapper(new Converter<CisCustProdHold, String>() {
            public String convert(CisCustProdHold CisCustProdHold) {
                return "key" + UUID.randomUUID();
            }
        });
        return writer;
    }


    @Bean
    public Step stepImportCisCustProdHold() {
        return stepBuilderFactory.get("stepImportCisCustProdHold").<CisCustProdHold, CisCustProdHold>chunk(chunkControl).reader(readerCisCustProdHold())
                .writer(writerCisCustProdHold()).build();

    }
    // end::jobstep[]
}
