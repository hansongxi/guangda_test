package com.wntime.select.test;

import java.util.Iterator;
import java.util.Scanner;

import org.apache.geode.cache.Cache;
import org.apache.geode.cache.CacheTransactionManager;
import org.apache.geode.cache.CommitConflictException;
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

import io.pivotal.cso.loaddata.CisCustInfo;

public class TransactionDemo {
	public static Integer newBalance = 0;
	
	public static String regionName="cis_cust_info";

	public static void main(String[] args) throws FunctionDomainException, TypeMismatchException,
			NameResolutionException, QueryInvocationTargetException {

		// 创建cache
		ClientCache cache = new ClientCacheFactory().set("name", "ClientWorker")
				.set("cache-xml-file", "cacheClient.xml").create();
		// 创建region

		// 创建事务
		CacheTransactionManager txmgr = cache.getCacheTransactionManager();

		// 开始交易
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print(">");
				String input = scanner.nextLine();

				if ("quit".equals(input)) {
					System.out.println("Exit!");
					break;
				}else if ("init".equals(input)) {
					txmgr.begin(); 
				}else if ("insert".equals(input)) {
					insert(cache,regionName);
				} else if ("update".equals(input)) {
					update(cache,regionName);
				} else if ("commit".equals(input)) {
					txmgr.commit();
					System.out.println("Committed.");
				} else if ("rollback".equals(input)) {
					txmgr.rollback();
					System.out.println("Rollback!");
				} else if ("print".equals(input)) {
					printRegionData(cache,regionName);
				} else {
					if (input.length() > 0) {
						System.out.println("Unknown command.");
					}
				}
			}
		} catch (CommitConflictException ex) {
			ex.printStackTrace();
			txmgr.rollback();
		}

		cache.close();

	}

	public static void printRegionData(ClientCache cache, String regionName) throws FunctionDomainException,
			TypeMismatchException, NameResolutionException, QueryInvocationTargetException {
		String oql = "select cust_id,dept_bal_amt,mb_sign_ind,open_subbank_id from /" + regionName;
		QueryService qs = cache.getQueryService();
		Query query = qs.newQuery(oql);
		SelectResults<CisCustInfo> rs = (SelectResults<CisCustInfo>) query.execute();
		int size = rs.size();
		System.out.println("region的数量是"+size);
		if (size > 0) {
			System.out.println(regionName + ":");
			Iterator<CisCustInfo> iterator = rs.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} else {
			System.out.println(regionName + " is empty.");
		}
	}

	public static void update(ClientCache cache, String regionName) throws FunctionDomainException, TypeMismatchException,
			NameResolutionException, QueryInvocationTargetException {

		Region<String, CisCustInfo> region = cache.getRegion(regionName);
		CisCustInfo cisCustInfo = region.get("0001111111114700586");
		cisCustInfo.setOpen_subbank_id("8888");
		region.put("0001111111114700586", cisCustInfo);
	}

	public static void insert(ClientCache cache, String regionName) throws FunctionDomainException, TypeMismatchException,
			NameResolutionException, QueryInvocationTargetException {

		Region<String, CisCustInfo> region = cache.getRegion(regionName);
		CisCustInfo cisCustInfo = region.get("0001111111114700586");
		cisCustInfo.setCust_id("0001111111114700587");
		region.put("0001111111114700587", cisCustInfo);
	}

}
