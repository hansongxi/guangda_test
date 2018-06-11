package com.wntime.select.test;

import java.util.ArrayList;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.query.FunctionDomainException;
import org.apache.geode.cache.query.NameResolutionException;
import org.apache.geode.cache.query.Query;
import org.apache.geode.cache.query.QueryInvocationTargetException;
import org.apache.geode.cache.query.QueryService;
import org.apache.geode.cache.query.SelectResults;
import org.apache.geode.cache.query.TypeMismatchException;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import io.pivotal.cso.loaddata.CisCustBaseInfo;



public class JMClient_get extends AbstractJavaSamplerClient {
	private String locator;
	private int port;
	private String region;
	private ClientCache cache;

	public void setupTest(JavaSamplerContext jsc) {
		this.locator = jsc.getParameter("locator", "");
		this.port = Integer.parseInt(jsc.getParameter("port", "10334"));
		this.region = jsc.getParameter("region", "cis_cust_base_info");

		System.out.println("init params---------------------------------------port=" + this.port + " locator="
				+ this.locator + " region=" + this.region);
		
		cache = new ClientCacheFactory().addPoolLocator(this.locator, this.port)
				.setPoolSubscriptionEnabled(true).setPoolSubscriptionRedundancy(1)
				.setPoolReadTimeout(100000).setPdxReadSerialized(true)
				.set("log-level", "info")
				.set("cache-xml-file", "cacheClient.xml")
				.create();
	}

	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		params.addArgument("port", "10334");
		params.addArgument("region", "cis_cust_base_info");
		params.addArgument("locator", "");
		return params;
	}

	public SampleResult runTest(JavaSamplerContext arg0) {
		SampleResult sp = new SampleResult();
		sp.sampleStart();
		
		
		try {
			
			 Region<String, CisCustBaseInfo> region = this.cache.getRegion(this.region);
		      CisCustBaseInfo cisCustBaseInfo = (CisCustBaseInfo)region.get("0001111111111138274");
		      
		      
		      sp.setDataEncoding("UTF-8");

			sp.sampleEnd();
			sp.setSuccessful(true);
			
		} catch (Exception e) {
			sp.sampleEnd();
			sp.setSuccessful(false);
			e.printStackTrace();
		} 
		return sp;
	}

	public void teardownTest(JavaSamplerContext arg0) {
		if(this.cache != null) {
			cache.close();
		}
	}
	
	public static void main(String[] args) {
		Arguments params = new Arguments();
		params.addArgument("locator", "192.168.56.1");
		params.addArgument("port", "10334");
		params.addArgument("region", "cis_cust_base_info");
		JavaSamplerContext arg0 = new JavaSamplerContext(params);
		JMClient_get test = new JMClient_get();
		test.setupTest(arg0);
		test.runTest(arg0);
		test.teardownTest(arg0);
	
	}
}
