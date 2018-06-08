package io.pivotal.cso.loaddata;

import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DataLoadBatchApplication {
	
	@Autowired
    public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	@Qualifier("stepImportCisCustProdHold")
	private Step stepImportCisCustProdHold;
	
	@Autowired
	@Qualifier("stepImportCisCustBaseInfo")
	private Step stepImportCisCustBaseInfo;
	
	@Autowired
	@Qualifier("stepImportCisCustInfo")
	private Step stepImportCisCustInfo;
	
	@Autowired
	@Qualifier("stepMoreCisCustBaseInfo")
	private Step stepMoreCisCustBaseInfo;
	
	@Autowired
	@Qualifier("stepMoreCisCustInfo")
	private Step stepMoreCisCustInfo;

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DataLoadBatchApplication.class);
	}

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		ClientCache cache = new ClientCacheFactory().set("name", "ClientWorker").set("cache-xml-file", "cacheClient.xml")
				.create();
		SpringApplication.run(DataLoadBatchApplication.class, args);

//		try {
//			System.exit(SpringApplication.exit(SpringApplication.run(DataLoadBatchApplication.class, args)));
//		} catch (Exception ex) {
//			System.out.println("ERROR");
//			System.exit(1);
//		}
		long endTime = System.currentTimeMillis();
		System.out.println("数据导入的时间"+(endTime-startTime)+"ms");
	}
	
	@Bean
    public Job jobImportAllData() {
		return jobBuilderFactory.get("jobImportCisCustProdHold").incrementer(new RunIdIncrementer())
                .flow(stepImportCisCustProdHold)
                .next(stepImportCisCustBaseInfo)
                .next(stepImportCisCustInfo)
                .next(stepMoreCisCustBaseInfo)
                .next(stepMoreCisCustInfo)
                .end().build();
	}

}
