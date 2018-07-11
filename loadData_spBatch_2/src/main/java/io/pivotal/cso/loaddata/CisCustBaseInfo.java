package io.pivotal.cso.loaddata;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.geode.pdx.PdxReader;
import org.apache.geode.pdx.PdxSerializable;
import org.apache.geode.pdx.PdxWriter;


public class CisCustBaseInfo implements Comparable<CisCustBaseInfo>,PdxSerializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1869459240993616744L;
	private String cust_id;
	private String zone_cd;
	private String org_id;
	private String iden_type_cd;
	private String iden_num;
	private String cust_name;
	private String gender_cd;
	//date
	private String birthday;
	private String age;
	private String age_lvl_id;
	private String life_lvl_id;
	private String marry_cd;
	private String education_cd;
	private String industry_cd;
	private String comp_industry_class_cd;
	private double income;
	private String income_lvl_id;
	private double ccd_limit;
	private String ccd_limit_lvl_id;
	//date
	private String open_dt;
	//date
	private String expire_dt;
	//date
	private String cust_last_fin_txn_dt;
	private String pty_type_cd;
	private String cust_status_cd;
	private String combank_org_id;
	private String employee_id;
	private String employee_name;
	private String open_teller_id;
	private String open_org_id;
	
	@Override
	public int compareTo(CisCustBaseInfo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getZone_cd() {
		return zone_cd;
	}

	public void setZone_cd(String zone_cd) {
		this.zone_cd = zone_cd;
	}

	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public String getIden_type_cd() {
		return iden_type_cd;
	}

	public void setIden_type_cd(String iden_type_cd) {
		this.iden_type_cd = iden_type_cd;
	}

	public String getIden_num() {
		return iden_num;
	}

	public void setIden_num(String iden_num) {
		this.iden_num = iden_num;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getGender_cd() {
		return gender_cd;
	}

	public void setGender_cd(String gender_cd) {
		this.gender_cd = gender_cd;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge_lvl_id() {
		return age_lvl_id;
	}

	public void setAge_lvl_id(String age_lvl_id) {
		this.age_lvl_id = age_lvl_id;
	}

	public String getLife_lvl_id() {
		return life_lvl_id;
	}

	public void setLife_lvl_id(String life_lvl_id) {
		this.life_lvl_id = life_lvl_id;
	}

	public String getMarry_cd() {
		return marry_cd;
	}

	public void setMarry_cd(String marry_cd) {
		this.marry_cd = marry_cd;
	}

	public String getEducation_cd() {
		return education_cd;
	}

	public void setEducation_cd(String education_cd) {
		this.education_cd = education_cd;
	}

	public String getIndustry_cd() {
		return industry_cd;
	}

	public void setIndustry_cd(String industry_cd) {
		this.industry_cd = industry_cd;
	}

	public String getComp_industry_class_cd() {
		return comp_industry_class_cd;
	}

	public void setComp_industry_class_cd(String comp_industry_class_cd) {
		this.comp_industry_class_cd = comp_industry_class_cd;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getIncome_lvl_id() {
		return income_lvl_id;
	}

	public void setIncome_lvl_id(String income_lvl_id) {
		this.income_lvl_id = income_lvl_id;
	}

	public double getCcd_limit() {
		return ccd_limit;
	}

	public void setCcd_limit(double ccd_limit) {
		this.ccd_limit = ccd_limit;
	}

	public String getCcd_limit_lvl_id() {
		return ccd_limit_lvl_id;
	}

	public void setCcd_limit_lvl_id(String ccd_limit_lvl_id) {
		this.ccd_limit_lvl_id = ccd_limit_lvl_id;
	}

	public String getOpen_dt() {
		return open_dt;
	}

	public void setOpen_dt(String open_dt) {
		this.open_dt = open_dt;
	}

	public String getExpire_dt() {
		return expire_dt;
	}

	public void setExpire_dt(String expire_dt) {
		this.expire_dt = expire_dt;
	}

	public String getCust_last_fin_txn_dt() {
		return cust_last_fin_txn_dt;
	}

	public void setCust_last_fin_txn_dt(String cust_last_fin_txn_dt) {
		this.cust_last_fin_txn_dt = cust_last_fin_txn_dt;
	}

	public String getPty_type_cd() {
		return pty_type_cd;
	}

	public void setPty_type_cd(String pty_type_cd) {
		this.pty_type_cd = pty_type_cd;
	}

	public String getCust_status_cd() {
		return cust_status_cd;
	}

	public void setCust_status_cd(String cust_status_cd) {
		this.cust_status_cd = cust_status_cd;
	}

	public String getCombank_org_id() {
		return combank_org_id;
	}

	public void setCombank_org_id(String combank_org_id) {
		this.combank_org_id = combank_org_id;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getOpen_teller_id() {
		return open_teller_id;
	}

	public void setOpen_teller_id(String open_teller_id) {
		this.open_teller_id = open_teller_id;
	}

	public String getOpen_org_id() {
		return open_org_id;
	}

	public void setOpen_org_id(String open_org_id) {
		this.open_org_id = open_org_id;
	}

	@Override
	public void toData(PdxWriter writer) {
		// TODO Auto-generated method stub
		writer.writeString("cust_id",cust_id);
		writer.writeString("zone_cd",zone_cd);
		writer.writeString("org_id",org_id);
		writer.writeString("iden_type_cd",iden_type_cd);
		writer.writeString("iden_num",iden_num);
		writer.writeString("cust_name",cust_name);
		writer.writeString("gender_cd",gender_cd);
		writer.writeString("birthday",birthday);
		writer.writeString("age",age);
		writer.writeString("age_lvl_id",age_lvl_id);
		writer.writeString("life_lvl_id",life_lvl_id);
		writer.writeString("marry_cd",marry_cd);
		writer.writeString("education_cd",education_cd);
		writer.writeString("industry_cd",industry_cd);
		writer.writeString("comp_industry_class_cd",comp_industry_class_cd);
		writer.writeDouble("income",income);
		writer.writeString("income_lvl_id",income_lvl_id);
		writer.writeDouble("ccd_limit",ccd_limit);
		writer.writeString("ccd_limit_lvl_id",ccd_limit_lvl_id);
		writer.writeString("open_dt",open_dt);
		writer.writeString("expire_dt",expire_dt);
		writer.writeString("cust_last_fin_txn_dt",cust_last_fin_txn_dt);
		writer.writeString("pty_type_cd",pty_type_cd);
		writer.writeString("cust_status_cd",cust_status_cd);
		writer.writeString("combank_org_id",combank_org_id);
		writer.writeString("employee_id",employee_id);
		writer.writeString("employee_name",employee_name);
		writer.writeString("open_teller_id",open_teller_id);
		writer.writeString("open_org_id",open_org_id);

		
	}

	@Override
	public void fromData(PdxReader reader) {
		// TODO Auto-generated method stub
		cust_id=reader.readString("cust_id");
		zone_cd=reader.readString("zone_cd");
		org_id=reader.readString("org_id");
		iden_type_cd=reader.readString("iden_type_cd");
		iden_num=reader.readString("iden_num");
		cust_name=reader.readString("cust_name");
		gender_cd=reader.readString("gender_cd");
		birthday=reader.readString("birthday");
		age=reader.readString("age");
		age_lvl_id=reader.readString("age_lvl_id");
		life_lvl_id=reader.readString("life_lvl_id");
		marry_cd=reader.readString("marry_cd");
		education_cd=reader.readString("education_cd");
		industry_cd=reader.readString("industry_cd");
		comp_industry_class_cd=reader.readString("comp_industry_class_cd");
		income=reader.readDouble("income");
		income_lvl_id=reader.readString("income_lvl_id");
		ccd_limit=reader.readDouble("ccd_limit");
		ccd_limit_lvl_id=reader.readString("ccd_limit_lvl_id");
		open_dt=reader.readString("open_dt");
		expire_dt=reader.readString("expire_dt");
		cust_last_fin_txn_dt=reader.readString("cust_last_fin_txn_dt");
		pty_type_cd=reader.readString("pty_type_cd");
		cust_status_cd=reader.readString("cust_status_cd");
		combank_org_id=reader.readString("combank_org_id");
		employee_id=reader.readString("employee_id");
		employee_name=reader.readString("employee_name");
		open_teller_id=reader.readString("open_teller_id");
		open_org_id=reader.readString("open_org_id");
	}

//	@Override
//	public String toString() {
//		return ReflectionToStringBuilder.toString(this);
//	}
	
	
}
