package com.wntime.select.test;

import java.util.ArrayList;

import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.query.FunctionDomainException;
import org.apache.geode.cache.query.NameResolutionException;
import org.apache.geode.cache.query.Query;
import org.apache.geode.cache.query.QueryInvocationTargetException;
import org.apache.geode.cache.query.QueryService;
import org.apache.geode.cache.query.SelectResults;
import org.apache.geode.cache.query.TypeMismatchException;

import io.pivotal.cso.loaddata.CisCustInfo;


public class SelectDataCisCustnfo {

	public static void main(String[] args) throws FunctionDomainException, TypeMismatchException,
			NameResolutionException, QueryInvocationTargetException {
		// 创建一个client，可以访问其他的服务端的机器
		ClientCacheFactory factory = new ClientCacheFactory();
		factory.addPoolLocator("10.34.58.107", 10334);
		factory.setPoolSubscriptionEnabled(true);
		factory.setPoolSubscriptionRedundancy(1);

		ClientCache client = factory.create();

		/**
		 * 用oql来进行查询
		 */
		String queryString = "SELECT * FROM /cis_cust_info";
		// Get QueryService from Cache.
		QueryService queryService = client.getQueryService();
		// Create the Query Object.
		Query query = queryService.newQuery(queryString);
		// Execute Query locally. Returns results set.
		SelectResults<CisCustInfo> results = (SelectResults<CisCustInfo>) query.execute();
		// Find the Size of the ResultSet.
		int size = results.size();
		// Iterate through your ResultSet.
		// CisCustInfo p = (CisCustInfo)results.iterator().next();
		ArrayList<CisCustInfo> list = new ArrayList<CisCustInfo>(size);
		for (CisCustInfo p : results) {
			list.add(p);
		}
		System.out.println("Result:");
		for (CisCustInfo p : list) {
			System.out.println(p.getCust_id());
		}
		/* Region containing Portfolio object. */
	}

}
