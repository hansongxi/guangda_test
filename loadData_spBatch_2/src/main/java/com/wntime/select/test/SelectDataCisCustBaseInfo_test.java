package com.wntime.select.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.query.FunctionDomainException;
import org.apache.geode.cache.query.NameResolutionException;
import org.apache.geode.cache.query.Query;
import org.apache.geode.cache.query.QueryInvocationTargetException;
import org.apache.geode.cache.query.QueryService;
import org.apache.geode.cache.query.SelectResults;
import org.apache.geode.cache.query.TypeMismatchException;

import io.pivotal.cso.loaddata.CisCustBaseInfo;

public class SelectDataCisCustBaseInfo_test {

	public static void main(String[] args) throws FunctionDomainException, TypeMismatchException,
			NameResolutionException, QueryInvocationTargetException {
		// 创建一个client，可以访问其他的服务端的机器
		ClientCacheFactory factory = new ClientCacheFactory();
		factory.addPoolLocator("192.168.56.1", 10334);
		factory.setPoolSubscriptionEnabled(true);
		factory.setPoolSubscriptionRedundancy(1);

		ClientCache client = factory.create();

		/**
		 * 用oql来进行查询
		 */
		String queryString = "SELECT * FROM /cis_cust_base_info";
		String queryString1= "SELECT cust_id,open_subbank_id FROM /cis_cust_info";
		// Get QueryService from Cache.
		QueryService queryService = client.getQueryService();
		// Create the Query Object.
		Query query = queryService.newQuery(queryString1);
		// Execute Query locally. Returns results set.
		SelectResults<CisCustBaseInfo> result = (SelectResults<CisCustBaseInfo>) query.execute();
		int size = result.size();
		System.out.println("region里面的记录数是："+size);
		Iterator<CisCustBaseInfo> iterator = result.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		/*SelectResults<CisCustBaseInfo> results = (SelectResults<CisCustBaseInfo>) query.execute();
		// Find the Size of the ResultSet.
		int size = results.size();
		// Iterate through your ResultSet.
		// CisCustBaseInfo p = (CisCustBaseInfo)results.iterator().next();
		ArrayList<CisCustBaseInfo> list = new ArrayList<CisCustBaseInfo>(size);
		for (CisCustBaseInfo p : results) {
			list.add(p);
		}
		System.out.println("Result:");
		for (CisCustBaseInfo p : list) {
			System.out.println(p.getCust_id());
		}
		 Region containing Portfolio object. 
	}*/
}
