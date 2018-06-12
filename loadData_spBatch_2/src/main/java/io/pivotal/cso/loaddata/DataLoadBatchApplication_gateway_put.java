package io.pivotal.cso.loaddata;

import java.util.Arrays;
import java.util.concurrent.Executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
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
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


//多线程试试






//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableAsync
public class DataLoadBatchApplication_gateway_put {

	private static final Log log = LogFactory.getLog(DataLoadBatchApplication_gateway_put.class);
	
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

//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(DataLoadBatchApplication.class);
//	}

	
	public static void main(String[] args) throws Exception {

		
		DataLoadBatchApplication_gateway_put data=new DataLoadBatchApplication_gateway_put();
		//data.insert_date();
		data.put_data();

	}
	public void insert_date() {
		long startTime = System.currentTimeMillis();
		ClientCache cache = new ClientCacheFactory().set("name", "ClientWorker")
				.set("cache-xml-file", "cacheClient.xml").create();
		SpringApplication.run(DataLoadBatchApplication_gateway_put.class);
		long endTime = System.currentTimeMillis();
		System.out.println("数据导入完成的时间" +endTime+ "ms");
		cache.close();
	} 
	public void put_data() {
		ClientCache cache = new ClientCacheFactory().set("name", "ClientWorker1")
				.set("cache-xml-file", "cacheClient2.xml").create();
		Region<String, CisCustInfo> region = cache.getRegion("cis_cust_info");
		
		
		int size = region.sizeOnServer();
		while (size<1009) {
			size=region.sizeOnServer();
			//System.out.println(size);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("数据查询完成的时间" +endTime+ "ms");
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
	

	   
	

	
	
	
	
	
	
	/*public static void main(String[] args) throws Exception {

	if (args.length < 1) {
		log.error("Command missing.");
		System.exit(1);
	}

	try {
		switch (args[0]) {
		case "insert":
			long startTime = System.currentTimeMillis();
			ClientCache cache = new ClientCacheFactory().set("name", "ClientWorker")
					.set("cache-xml-file", "cacheClient.xml").create();
			SpringApplication.run(DataLoadBatchApplication.class, args);
			long endTime = System.currentTimeMillis();
			System.out.println("数据导入的时间" + (endTime - startTime) + "ms");

			break;
		}
	} catch (Throwable e) {
		log.error("Error!", e);
		System.exit(1);

	}


}*/

}
