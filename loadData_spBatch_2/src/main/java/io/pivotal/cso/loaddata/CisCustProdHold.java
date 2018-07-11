package io.pivotal.cso.loaddata;

import java.io.Serializable;

import org.apache.geode.pdx.PdxReader;
import org.apache.geode.pdx.PdxSerializable;
import org.apache.geode.pdx.PdxWriter;


public class CisCustProdHold 
	implements Comparable<CisCustProdHold>,PdxSerializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8759642395028493569L;
	private String statistics_dt;	
	private String cust_id;
	private String mng_int_org_id;	
	private String prod_cdh;	
	private String hold_cd;
	private String earliest_dt;	
	private String hold_res1;
	private String hold_res2;	
	private String hold_res3;
	public String getStatistics_dt() {
		return statistics_dt;
	}
	public void setStatistics_dt(String statistics_dt) {
		this.statistics_dt = statistics_dt;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getMng_int_org_id() {
		return mng_int_org_id;
	}
	public void setMng_int_org_id(String mng_int_org_id) {
		this.mng_int_org_id = mng_int_org_id;
	}
	public String getProd_cdh() {
		return prod_cdh;
	}
	public void setProd_cdh(String prod_cdh) {
		this.prod_cdh = prod_cdh;
	}
	public String getHold_cd() {
		return hold_cd;
	}
	public void setHold_cd(String hold_cd) {
		this.hold_cd = hold_cd;
	}
	public String getEarliest_dt() {
		return earliest_dt;
	}
	public void setEarliest_dt(String earliest_dt) {
		this.earliest_dt = earliest_dt;
	}
	public String getHold_res1() {
		return hold_res1;
	}
	public void setHold_res1(String hold_res1) {
		this.hold_res1 = hold_res1;
	}
	public String getHold_res2() {
		return hold_res2;
	}
	public void setHold_res2(String hold_res2) {
		this.hold_res2 = hold_res2;
	}
	public String getHold_res3() {
		return hold_res3;
	}
	public void setHold_res3(String hold_res3) {
		this.hold_res3 = hold_res3;
	}
	
	@Override
	public int compareTo(CisCustProdHold o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void toData(PdxWriter writer) {
		// TODO Auto-generated method stub
		writer.writeString("statistics_dt", statistics_dt);
		writer.writeString("cust_id", cust_id);
		writer.writeString("mng_int_org_id", mng_int_org_id);
		writer.writeString("prod_cdh", prod_cdh);
		writer.writeString("hold_cd", hold_cd);
		writer.writeString("earliest_dt", earliest_dt);
		writer.writeString("hold_res1", hold_res1);
		writer.writeString("hold_res2", hold_res2);
		writer.writeString("hold_res3", hold_res3);
	}
	@Override
	public void fromData(PdxReader reader) {
		// TODO Auto-generated method stub
		statistics_dt=reader.readString("statistics_dt");
		cust_id=reader.readString("cust_id");
		mng_int_org_id=reader.readString("mng_int_org_id");
		prod_cdh=reader.readString("prod_cdh");
		hold_cd=reader.readString("hold_cd");
		earliest_dt=reader.readString("earliest_dt");
		hold_res1=reader.readString("hold_res1");
		hold_res2=reader.readString("hold_res2");
		hold_res3=reader.readString("hold_res3");
		
	}
	
	
}

