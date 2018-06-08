package io.pivotal.cso.loaddata;

import java.io.Serializable;


public class CisCustInfo 
	implements Comparable<CisCustInfo>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5744937703768140199L;
	private String cust_id;
	private String statistics_dt;
	private String open_subbank_id;
	private int open_mon;
	private String cust_act_ind;
	private double profit;
	private double dept_profit;
	private double loan_profit;
	private double ibiz_profit;
	private double cd_profit;
	private double profit_rate;
	private int dept_acct_qty;
	private double dept_bal_amt;
	private double dept_month_avg_bal;
	private double dept_quarter_avg_bal;
	private double dept_year_avg_bal;
	private int fixed_dept_acct_qty;
	private double fixed_dept_bal_amt;
	private double fixed_dept_month_avg_bal;
	private double fixed_dept_quarter_avg_bal;
	private double fixed_dept_year_avg_bal;
	private int saving_dept_acct_qty;
	private double saving_dept_bal_amt;
	private double saving_dept_month_avg_bal;
	private double saving_dept_quarter_avg_bal;
	private double saving_dept_year_avg_bal;
	private int l_dept_acct_qty;
	private double l_dept_bal_amt;
	private double l_dept_month_avg_bal;
	private double l_dept_quarter_avg_bal;
	private double l_dept_year_avg_bal;
	private int f_dept_acct_qty;
	private double f_dept_bal_amt;
	private double f_dept_month_avg_bal;
	private double f_dept_quarter_avg_bal;
	private double f_dept_year_avg_bal;
	private int fin_type_qty;
	private int fin_acct_qty;
	private double fin_bal_amt;
	private double fin_month_avg_bal;
	private double fin_quarter_avg_bal;
	private double fin_year_avg_bal;
	private int l_fin_type_qty;
	private int l_fin_acct_qty;
	private double l_fin_bal_amt;
	private double l_fin_month_avg_bal;
	private double l_fin_quarter_avg_bal;
	private double l_fin_year_avg_bal;
	private int f_fin_type_qty;
	private int f_fin_acct_qty;
	private double f_fin_bal_amt;
	private double f_fin_month_avg_bal;
	private double f_fin_quarter_avg_bal;
	private double f_fin_year_avg_bal;
	private int fin_dept_acct_qty;
	private double fin_dept_bal_amt;
	private double fin_dept_month_avg_bal;
	private double fin_dept_quarter_avg_bal;
	private double fin_dept_year_avg_bal;
	private int l_fin_dept_acct_qty;
	private double l_fin_dept_bal_amt;
	private double l_fin_dept_month_avg_bal;
	private double l_fin_dept_quarter_avg_bal;
	private double l_fin_dept_year_avg_bal;
	private int f_fin_dept_acct_qty;
	private double f_fin_dept_bal_amt;
	private double f_fin_dept_month_avg_bal;
	private double f_fin_dept_quarter_avg_bal;
	private double f_fin_dept_year_avg_bal;
	private int l_fin_fund_acct_qty;
	private double l_fin_fund_bal_amt;
	private double l_fin_fund_month_avg_bal;
	private double l_fin_fund_quarter_avg_bal;
	private double l_fin_fund_year_avg_bal;
	private int f_fin_fund_acct_qty;
	private double f_fin_fund_bal_amt;
	private double f_fin_fund_month_avg_bal;
	private double f_fin_fund_quarter_avg_bal;
	private double f_fin_fund_year_avg_bal;
	private int debt_acct_qty;
	private double debt_bal_amt;
	private double debt_month_avg_bal;
	private double debt_quarter_avg_bal;
	private double debt_year_avg_bal;
	private int fund_acct_qty;
	private double fund_bal_amt;
	private double fund_month_avg_bal;
	private double fund_quarter_avg_bal;
	private double fund_year_avg_bal;
	private int gold_acct_qty;
	private double gold_bal;
	private double mon_avg_gold_bal;
	private double qtr_avg_gold_bal;
	private double year_avg_gold_bal;
	private int ins_acct_qty;
	private double ins_bal;
	private double mon_avg_ins_bal;
	private double qtr_avg_ins_bal;
	private double year_avg_ins_bal;
	private int sjob_acct_qty;
	private double sjob_bal;
	private double mon_avg_sjob_bal;
	private double qtr_avg_sjob_bal;
	private double year_avg_sjob_bal;
	private int accd_acct_qty;
	private double accd_bal;
	private double mon_avg_accd_bal;
	private double qtr_avg_accd_bal;
	private double year_avg_accd_bal;
	private int ta_fin_acct_qty;
	private double ta_fin_bal_amt;
	private double ta_fin_month_avg_bal;
	private double ta_fin_quarter_avg_bal;
	private double ta_fin_year_avg_bal;
	private int dept_trs_acct_qty;
	private double dept_trs_bal_amt;
	private double dept_trs_month_avg_bal;
	private double dept_trs_quarter_avg_bal;
	private double dept_trs_year_avg_bal;
	private int l_dept_trs_acct_qty;
	private double l_dept_trs_bal_amt;
	private double l_dept_trs_month_avg_bal;
	private double l_dept_trs_quarter_avg_bal;
	private double l_dept_trs_year_avg_bal;
	private int loan_acct_qty;
	private double loan_issue_amt;
	private double loan_bal_amt;
	private double nloan_amt;
	private double loan_month_avg_bal;
	private double loan_quarter_avg_bal;
	private double loan_year_avg_bal;
	private int micro_acct_qty;
	private double micro_issue_amt;
	private double micro_bal_amt;
	private double micro_month_avg_bal;
	private double micro_quarter_avg_bal;
	private double micro_year_avg_bal;
	private int sc_acct_qty;
	private double sc_bal_amt;
	private double sc_bal_month_avg_bal;
	private double sc_bal_quarter_avg_bal;
	private double sc_bal_year_avg_bal;
	private int ccard_acct_qty;
	private int ccard_card_qty;
	private double ccard_limit_amt;
	private double ccard_usable_amt;
	private double ccard_month_amt;
	private double ccard_year_amt;
	private double ccard_year_avg_amt;
	private double ccard_total_purchases_amt;
	private double ast2_bal_amt;
	private double ast2_month_avg_bal;
	private double ast2_quarter_avg_bal;
	private double ast2_year_avg_bal;
	private double ast4_bal_amt;
	private double ast4_month_avg_bal;
	private double ast4_quarter_avg_bal;
	private double ast4_year_avg_bal;
	private double assert9_bal;
	private double mon_avg_assert9_bal;
	private double qtr_avg_assert9_bal;
	private double year_avg_assert9_bal;
	private int hold_dept_ind;
	private int hold_fin_ind;
	private int hold_debt_ind;
	private int hold_fund_ind;
	private int hold_loan_ind;
	private int hold_sc_ind;
	private int hold_ccard_ind;
	private int hold_gold_ind;
	private int hold_ins_ind;
	private int hold_sjob_ind;
	private int hold_accd_ind;
	private int hold_prod_type_num;
	private int hold_prod_num;
	private int sc_sign_ind;
	private String sc_sign_dt;
	private int nb_sign_ind;
	private String nb_sign_dt;
	private int mb_sign_ind;
	private String mb_sign_dt;
	private int sms_sign_ind;
	private String sms_sign_dt;
	private int saly_sign_ind;
	private String zone_cd;
	private String org_id;
	private String iden_type_cd;
	private String iden_num;
	private String cust_name;
	private String gender_cd;
	private String birthday;
	private int age;
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
	private String open_dt;
	private String expire_dt;
	private String cust_last_fin_txn_dt;
	private String pty_type_cd;
	private String cust_status_cd;
	private String combank_org_id;
	private String employee_id;
	private String employee_name;
	private String open_teller_id;
	private String open_org_id;
	private int prod_num;
	private String prod_sav;
	private String prod_fin;
	private String prod_fin_nav;
	private String prod_fin_fixed_income;
	private String prod_fin_indiv;
	private String prod_fun;
	private String prod_bon;
	private String prod_sec;
	private String prod_gld;
	private String prod_tru;
	private String prod_pot;
	private String prod_idr;
	private String prod_lod;
	private String prod_lod_house;
	private String prod_lod_compre_cre;
	private String prod_lod_compre_oth;
	private String prod_lod_ple;
	private String prod_lod_entru;
	private String prod_crd;
	private String prod_mic;
	private String prod_mic_coml_mortg;
	private String prod_mic_housing;
	private String prod_mic_oth_aid;
	private String prod_mic_chan;
	private String prod_mic_cons;
	private String prod_pay;
	private String prod_btch_cr;
	private String prod_btch_dr;
	private String prod_fxa;
	private String prod_fxa_settle;
	private String prod_fxa_dept;
	private String prod_fbp;
	private String prod_elc;
	private String prod_ela;
	private String prod_clt;
	private String prod_p2p;
	private String prod_mcm;
	private String hold_res1;
	private String hold_res2;
	private String hold_res3;
	private String group_deposit;
	private String group_fincing;
	private String group_na_fincing;
	private String group_fincing_agent;
	private String group_fincing_agent_fud;
	private String group_fincing_agent_ins;
	private String group_fincing_agent_tru;
	private String group_fincing_agent_bon;
	private String group_fincing_sc;
	private String group_microbiz;
	private String group_mic_loan;
	private String group_mic_loan_com;
	private String group_mic_loan_hous;
	private String group_mic_loan_oth;
	private String group_mic_loan_chan;
	private String group_mic_loan_cons;
	private String group_mic_rela;
	private String group_loan;
	private String group_loan_house;
	private String group_loan_compre;
	private String group_loan_compre_cre;
	private String group_loan_compre_oth;
	private String group_loan_ple;
	private String group_loan_ent;
	private String group_creditcard;
	private String group_batch_cr;
	private String group_batch_salary;
	private String group_batch_inter;
	private String group_batch_spec;
	private String group_batch_oth;
	private String group_finaboard;
	private String group_finaboard_settle;
	private String group_finaboard_dept;
	private String group_finaboard_sun;
	private String group_pwm;
	private String group_res1;
	private String group_res2;
	private String group_res3;
	private int cust_flag;
	private String asset_debit_lvl_id;
	private String asset_debit_lvl_cid;
	private String fin_asset_debit_lvl_id;
	private String fin_asset_debit_lvl_cid;
	private String fin_mon1;
	private String fin_mon2;
	private String fin_mon3;
	private String ccd_asset_debit_lvl_id;
	private String ln_asset_debit_lvl_id;
	private String ln_asset_debit_lvl_cid;
	private String ln_mon1;
	private String ln_mon2;
	private String ln_mon3;
	private String ln_mon4;
	private String ln_mon5;
	private String ln_mon6;
	private int asset_debit_lvl_times;
	private int fin_asset_debit_lvl_times;
	private int ln_asset_debit_lvl_times;
	private int ccd_asset_debit_lvl_times;
	private String cust_flg;
	private int cust_lost_flg;
	private String assets_debt_lvl_cd;
	private String fin_assets_debt_lvl_cd;
	private String ln_assets_debt_lvl_cd;
	private String ccd_assets_debt_lvl_cd;
	private String assets_lvl_cd;
	private String profit_lvl_cd;
	private double day_profit;
	private double profit_mon_base;
	private String rgstr_sign_use_lvl_id;
	private String retl_rgstr_sign_use_lvl_id;
	private String ccd_rgstr_sign_use_lvl_id;
	private String echl_rgstr_sign_use_lvl_id;
	private String buy_freq_lvl_id;
	private String activ_lvl_id;
	private String retl_activ_lvl_id;
	private String ccd_activ_lvl_id;
	private String echl_activ_lvl_id;
	private String cust_lylty;
	private String lylty_lvl_id;
	private String fin_manager;
	private String ln_manager;
	private String ccd_manager;
	private String invst_risk_lvl_id;
	private String cust_grade_result_cd;
	private double lately_assets_num3;
	private double lately_ln_num3;
	private double lately_ccd_num3;
	private double lately_acct_overdue_num6;
	private double day_assets_bal;
	private double day_ln_bal;
	private double day_cd_bal;
	private double mon_ccd_amt;
	private double lately_buy_num12;
	private int retl_rgstr_sign_use_lvl_times;
	private int ccd_rgstr_sign_use_lvl_times;
	private int echl_rgstr_sign_use_lvl_times;
	private int vip_type;
	private int vip_ind;
	private String home_address;
	private String home_postcode;
	private String home_phone;
	private String corp_address;
	private String corp_postcode;
	private String corp_phone;
	private String contact_adress;
	private String contact_postcode;
	private String contact_phone;
	private String mobile_phone;
	private String email;
	private String cd_statement_addr;
	private String cd_statement_post_code;
	private String cd_tel_num;
	private String cd_mobile_num;
	private String cd_housing_addr;
	private String cd_housing_post_code;
	private String cd_comp_address;
	private String cd_comp_post_code;
	private String cd_comp_tel_num;
	private String cd_email_addr;
	private String cust_sort_name;
	private String reg_city_cd;
	private String live_state_cd;
	private String country_cd;
	private String nation_cd;
	private String employee_flag;
	private String unit;
	private String dept;
	private String duty;
	private String speciality;
	private String school;
	private String grad_date;
	private double year_income;
	private String begin_bank_cust_time;
	private String mail_num;
	private String province_cd;
	private String city_cd;
	private String addr_bank;
	private String addr_memo;
	private String tel_num;
	private String fax_phone;
	private String bill_address;
	private String bill_postcode;
	private String corp_name;
	private String en_first_name;
	private String en_last_name;
	private String iden_due_dt;
	private String issue_org_country;
	private String title_cd;
	private String corp_property_cd;
	private String month_income;
	private String family_year_income;
	private String other_month_income;
	private String child_stat_cd;
	private String support_num_cd;
	private String domestic_resident_ind;
	private String month_income_lvl_id;
	private String cust_risk_prefer_cd;
	private String blacklist_flag;
	private String ceb_vip_ind;
	private String agt_sal_comp_industry_class_cd;
	private String cust_risk_valid_end_dt;
	private String currency_cd;
	private String prod_cd;
	private String int_start_dt;
	private String due_dt;
	private String close_dt;
	private String fin_int_org_id;
	private String biz_int_org_id;
	private String subject_num;
	private String biz_cd;
	private String deposit_period;
	private String issue_year;
	private String national_debt_period_num;
	private String national_debt_term;
	private String deposit_type_cd;
	private String cash_exchange_type_cd;
	private String agmt_type_cd;
	private String agmt_stat_cd;
	private String national_debt_type_cd;
	private String latest_finance_txn_dt;
	private double execute_int_rate;
	private double freeze_amt;
	private double acct_bal_amt;
	private double year_avg_bal;
	private double quarter_avg_bal;
	private double month_avg_bal;
	private String prod_cd1;
	private String prod_cd_type;
	private double day_bal;
	private double rmb_day_bal;
	private double income_amt;
	private double crm_income_amt;
	private double mon_base_bal;
	private double mon_bal_avg_m3;
	private double mon_bal_avg_m6;
	private double mon_bal_avg_m12;
	private double bal_base_qtr;
	private double bal_base_year;
	private double mon_base_rmb_bal1;
	private double mon_base_rmb_bal2;
	private double mon3_base_rmb_bal1;
	private double mon3_base_rmb_bal2;
	private double mon6_base_rmb_bal1;
	private double mon6_base_rmb_bal2;
	private double mon12_base_rmb_bal1;
	private double mon12_base_rmb_bal2;
	private double qtr_base_rmb_bal1;
	private double qtr_base_rmb_bal2;
	private double year_base_rmb_bal1;
	private double year_base_rmb_bal2;
	private double mon_base_for_bal1;
	private double mon_base_for_bal2;
	private double mon3_base_for_bal1;
	private double mon3_base_for_bal2;
	private double mon6_base_for_bal1;
	private double mon6_base_for_bal2;
	private double mon12_base_for_bal1;
	private double mon12_base_for_bal2;
	private double qtr_base_for_bal1;
	private double qtr_base_for_bal2;
	private double year_base_for_bal1;
	private double year_base_for_bal2;
	private double mon_base_profit;
	private double rmb_day_profit;
	private double crm_day_profit;
	private String crm_prod_cd;

	
	
	
	public String getCust_id() {
		return cust_id;
	}




	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}




	public String getStatistics_dt() {
		return statistics_dt;
	}




	public void setStatistics_dt(String statistics_dt) {
		this.statistics_dt = statistics_dt;
	}




	public String getOpen_subbank_id() {
		return open_subbank_id;
	}




	public void setOpen_subbank_id(String open_subbank_id) {
		this.open_subbank_id = open_subbank_id;
	}




	public int getOpen_mon() {
		return open_mon;
	}




	public void setOpen_mon(int open_mon) {
		this.open_mon = open_mon;
	}




	public String getCust_act_ind() {
		return cust_act_ind;
	}




	public void setCust_act_ind(String cust_act_ind) {
		this.cust_act_ind = cust_act_ind;
	}




	public double getProfit() {
		return profit;
	}




	public void setProfit(double profit) {
		this.profit = profit;
	}




	public double getDept_profit() {
		return dept_profit;
	}




	public void setDept_profit(double dept_profit) {
		this.dept_profit = dept_profit;
	}




	public double getLoan_profit() {
		return loan_profit;
	}




	public void setLoan_profit(double loan_profit) {
		this.loan_profit = loan_profit;
	}




	public double getIbiz_profit() {
		return ibiz_profit;
	}




	public void setIbiz_profit(double ibiz_profit) {
		this.ibiz_profit = ibiz_profit;
	}




	public double getCd_profit() {
		return cd_profit;
	}




	public void setCd_profit(double cd_profit) {
		this.cd_profit = cd_profit;
	}




	public double getProfit_rate() {
		return profit_rate;
	}




	public void setProfit_rate(double profit_rate) {
		this.profit_rate = profit_rate;
	}




	public int getDept_acct_qty() {
		return dept_acct_qty;
	}




	public void setDept_acct_qty(int dept_acct_qty) {
		this.dept_acct_qty = dept_acct_qty;
	}




	public double getDept_bal_amt() {
		return dept_bal_amt;
	}




	public void setDept_bal_amt(double dept_bal_amt) {
		this.dept_bal_amt = dept_bal_amt;
	}




	public double getDept_month_avg_bal() {
		return dept_month_avg_bal;
	}




	public void setDept_month_avg_bal(double dept_month_avg_bal) {
		this.dept_month_avg_bal = dept_month_avg_bal;
	}




	public double getDept_quarter_avg_bal() {
		return dept_quarter_avg_bal;
	}




	public void setDept_quarter_avg_bal(double dept_quarter_avg_bal) {
		this.dept_quarter_avg_bal = dept_quarter_avg_bal;
	}




	public double getDept_year_avg_bal() {
		return dept_year_avg_bal;
	}




	public void setDept_year_avg_bal(double dept_year_avg_bal) {
		this.dept_year_avg_bal = dept_year_avg_bal;
	}




	public int getFixed_dept_acct_qty() {
		return fixed_dept_acct_qty;
	}




	public void setFixed_dept_acct_qty(int fixed_dept_acct_qty) {
		this.fixed_dept_acct_qty = fixed_dept_acct_qty;
	}




	public double getFixed_dept_bal_amt() {
		return fixed_dept_bal_amt;
	}




	public void setFixed_dept_bal_amt(double fixed_dept_bal_amt) {
		this.fixed_dept_bal_amt = fixed_dept_bal_amt;
	}




	public double getFixed_dept_month_avg_bal() {
		return fixed_dept_month_avg_bal;
	}




	public void setFixed_dept_month_avg_bal(double fixed_dept_month_avg_bal) {
		this.fixed_dept_month_avg_bal = fixed_dept_month_avg_bal;
	}




	public double getFixed_dept_quarter_avg_bal() {
		return fixed_dept_quarter_avg_bal;
	}




	public void setFixed_dept_quarter_avg_bal(double fixed_dept_quarter_avg_bal) {
		this.fixed_dept_quarter_avg_bal = fixed_dept_quarter_avg_bal;
	}




	public double getFixed_dept_year_avg_bal() {
		return fixed_dept_year_avg_bal;
	}




	public void setFixed_dept_year_avg_bal(double fixed_dept_year_avg_bal) {
		this.fixed_dept_year_avg_bal = fixed_dept_year_avg_bal;
	}




	public int getSaving_dept_acct_qty() {
		return saving_dept_acct_qty;
	}




	public void setSaving_dept_acct_qty(int saving_dept_acct_qty) {
		this.saving_dept_acct_qty = saving_dept_acct_qty;
	}




	public double getSaving_dept_bal_amt() {
		return saving_dept_bal_amt;
	}




	public void setSaving_dept_bal_amt(double saving_dept_bal_amt) {
		this.saving_dept_bal_amt = saving_dept_bal_amt;
	}




	public double getSaving_dept_month_avg_bal() {
		return saving_dept_month_avg_bal;
	}




	public void setSaving_dept_month_avg_bal(double saving_dept_month_avg_bal) {
		this.saving_dept_month_avg_bal = saving_dept_month_avg_bal;
	}




	public double getSaving_dept_quarter_avg_bal() {
		return saving_dept_quarter_avg_bal;
	}




	public void setSaving_dept_quarter_avg_bal(double saving_dept_quarter_avg_bal) {
		this.saving_dept_quarter_avg_bal = saving_dept_quarter_avg_bal;
	}




	public double getSaving_dept_year_avg_bal() {
		return saving_dept_year_avg_bal;
	}




	public void setSaving_dept_year_avg_bal(double saving_dept_year_avg_bal) {
		this.saving_dept_year_avg_bal = saving_dept_year_avg_bal;
	}




	public int getL_dept_acct_qty() {
		return l_dept_acct_qty;
	}




	public void setL_dept_acct_qty(int l_dept_acct_qty) {
		this.l_dept_acct_qty = l_dept_acct_qty;
	}




	public double getL_dept_bal_amt() {
		return l_dept_bal_amt;
	}




	public void setL_dept_bal_amt(double l_dept_bal_amt) {
		this.l_dept_bal_amt = l_dept_bal_amt;
	}




	public double getL_dept_month_avg_bal() {
		return l_dept_month_avg_bal;
	}




	public void setL_dept_month_avg_bal(double l_dept_month_avg_bal) {
		this.l_dept_month_avg_bal = l_dept_month_avg_bal;
	}




	public double getL_dept_quarter_avg_bal() {
		return l_dept_quarter_avg_bal;
	}




	public void setL_dept_quarter_avg_bal(double l_dept_quarter_avg_bal) {
		this.l_dept_quarter_avg_bal = l_dept_quarter_avg_bal;
	}




	public double getL_dept_year_avg_bal() {
		return l_dept_year_avg_bal;
	}




	public void setL_dept_year_avg_bal(double l_dept_year_avg_bal) {
		this.l_dept_year_avg_bal = l_dept_year_avg_bal;
	}




	public int getF_dept_acct_qty() {
		return f_dept_acct_qty;
	}




	public void setF_dept_acct_qty(int f_dept_acct_qty) {
		this.f_dept_acct_qty = f_dept_acct_qty;
	}




	public double getF_dept_bal_amt() {
		return f_dept_bal_amt;
	}




	public void setF_dept_bal_amt(double f_dept_bal_amt) {
		this.f_dept_bal_amt = f_dept_bal_amt;
	}




	public double getF_dept_month_avg_bal() {
		return f_dept_month_avg_bal;
	}




	public void setF_dept_month_avg_bal(double f_dept_month_avg_bal) {
		this.f_dept_month_avg_bal = f_dept_month_avg_bal;
	}




	public double getF_dept_quarter_avg_bal() {
		return f_dept_quarter_avg_bal;
	}




	public void setF_dept_quarter_avg_bal(double f_dept_quarter_avg_bal) {
		this.f_dept_quarter_avg_bal = f_dept_quarter_avg_bal;
	}




	public double getF_dept_year_avg_bal() {
		return f_dept_year_avg_bal;
	}




	public void setF_dept_year_avg_bal(double f_dept_year_avg_bal) {
		this.f_dept_year_avg_bal = f_dept_year_avg_bal;
	}




	public int getFin_type_qty() {
		return fin_type_qty;
	}




	public void setFin_type_qty(int fin_type_qty) {
		this.fin_type_qty = fin_type_qty;
	}




	public int getFin_acct_qty() {
		return fin_acct_qty;
	}




	public void setFin_acct_qty(int fin_acct_qty) {
		this.fin_acct_qty = fin_acct_qty;
	}




	public double getFin_bal_amt() {
		return fin_bal_amt;
	}




	public void setFin_bal_amt(double fin_bal_amt) {
		this.fin_bal_amt = fin_bal_amt;
	}




	public double getFin_month_avg_bal() {
		return fin_month_avg_bal;
	}




	public void setFin_month_avg_bal(double fin_month_avg_bal) {
		this.fin_month_avg_bal = fin_month_avg_bal;
	}




	public double getFin_quarter_avg_bal() {
		return fin_quarter_avg_bal;
	}




	public void setFin_quarter_avg_bal(double fin_quarter_avg_bal) {
		this.fin_quarter_avg_bal = fin_quarter_avg_bal;
	}




	public double getFin_year_avg_bal() {
		return fin_year_avg_bal;
	}




	public void setFin_year_avg_bal(double fin_year_avg_bal) {
		this.fin_year_avg_bal = fin_year_avg_bal;
	}




	public int getL_fin_type_qty() {
		return l_fin_type_qty;
	}




	public void setL_fin_type_qty(int l_fin_type_qty) {
		this.l_fin_type_qty = l_fin_type_qty;
	}




	public int getL_fin_acct_qty() {
		return l_fin_acct_qty;
	}




	public void setL_fin_acct_qty(int l_fin_acct_qty) {
		this.l_fin_acct_qty = l_fin_acct_qty;
	}




	public double getL_fin_bal_amt() {
		return l_fin_bal_amt;
	}




	public void setL_fin_bal_amt(double l_fin_bal_amt) {
		this.l_fin_bal_amt = l_fin_bal_amt;
	}




	public double getL_fin_month_avg_bal() {
		return l_fin_month_avg_bal;
	}




	public void setL_fin_month_avg_bal(double l_fin_month_avg_bal) {
		this.l_fin_month_avg_bal = l_fin_month_avg_bal;
	}




	public double getL_fin_quarter_avg_bal() {
		return l_fin_quarter_avg_bal;
	}




	public void setL_fin_quarter_avg_bal(double l_fin_quarter_avg_bal) {
		this.l_fin_quarter_avg_bal = l_fin_quarter_avg_bal;
	}




	public double getL_fin_year_avg_bal() {
		return l_fin_year_avg_bal;
	}




	public void setL_fin_year_avg_bal(double l_fin_year_avg_bal) {
		this.l_fin_year_avg_bal = l_fin_year_avg_bal;
	}




	public int getF_fin_type_qty() {
		return f_fin_type_qty;
	}




	public void setF_fin_type_qty(int f_fin_type_qty) {
		this.f_fin_type_qty = f_fin_type_qty;
	}




	public int getF_fin_acct_qty() {
		return f_fin_acct_qty;
	}




	public void setF_fin_acct_qty(int f_fin_acct_qty) {
		this.f_fin_acct_qty = f_fin_acct_qty;
	}




	public double getF_fin_bal_amt() {
		return f_fin_bal_amt;
	}




	public void setF_fin_bal_amt(double f_fin_bal_amt) {
		this.f_fin_bal_amt = f_fin_bal_amt;
	}




	public double getF_fin_month_avg_bal() {
		return f_fin_month_avg_bal;
	}




	public void setF_fin_month_avg_bal(double f_fin_month_avg_bal) {
		this.f_fin_month_avg_bal = f_fin_month_avg_bal;
	}




	public double getF_fin_quarter_avg_bal() {
		return f_fin_quarter_avg_bal;
	}




	public void setF_fin_quarter_avg_bal(double f_fin_quarter_avg_bal) {
		this.f_fin_quarter_avg_bal = f_fin_quarter_avg_bal;
	}




	public double getF_fin_year_avg_bal() {
		return f_fin_year_avg_bal;
	}




	public void setF_fin_year_avg_bal(double f_fin_year_avg_bal) {
		this.f_fin_year_avg_bal = f_fin_year_avg_bal;
	}




	public int getFin_dept_acct_qty() {
		return fin_dept_acct_qty;
	}




	public void setFin_dept_acct_qty(int fin_dept_acct_qty) {
		this.fin_dept_acct_qty = fin_dept_acct_qty;
	}




	public double getFin_dept_bal_amt() {
		return fin_dept_bal_amt;
	}




	public void setFin_dept_bal_amt(double fin_dept_bal_amt) {
		this.fin_dept_bal_amt = fin_dept_bal_amt;
	}




	public double getFin_dept_month_avg_bal() {
		return fin_dept_month_avg_bal;
	}




	public void setFin_dept_month_avg_bal(double fin_dept_month_avg_bal) {
		this.fin_dept_month_avg_bal = fin_dept_month_avg_bal;
	}




	public double getFin_dept_quarter_avg_bal() {
		return fin_dept_quarter_avg_bal;
	}




	public void setFin_dept_quarter_avg_bal(double fin_dept_quarter_avg_bal) {
		this.fin_dept_quarter_avg_bal = fin_dept_quarter_avg_bal;
	}




	public double getFin_dept_year_avg_bal() {
		return fin_dept_year_avg_bal;
	}




	public void setFin_dept_year_avg_bal(double fin_dept_year_avg_bal) {
		this.fin_dept_year_avg_bal = fin_dept_year_avg_bal;
	}




	public int getL_fin_dept_acct_qty() {
		return l_fin_dept_acct_qty;
	}




	public void setL_fin_dept_acct_qty(int l_fin_dept_acct_qty) {
		this.l_fin_dept_acct_qty = l_fin_dept_acct_qty;
	}




	public double getL_fin_dept_bal_amt() {
		return l_fin_dept_bal_amt;
	}




	public void setL_fin_dept_bal_amt(double l_fin_dept_bal_amt) {
		this.l_fin_dept_bal_amt = l_fin_dept_bal_amt;
	}




	public double getL_fin_dept_month_avg_bal() {
		return l_fin_dept_month_avg_bal;
	}




	public void setL_fin_dept_month_avg_bal(double l_fin_dept_month_avg_bal) {
		this.l_fin_dept_month_avg_bal = l_fin_dept_month_avg_bal;
	}




	public double getL_fin_dept_quarter_avg_bal() {
		return l_fin_dept_quarter_avg_bal;
	}




	public void setL_fin_dept_quarter_avg_bal(double l_fin_dept_quarter_avg_bal) {
		this.l_fin_dept_quarter_avg_bal = l_fin_dept_quarter_avg_bal;
	}




	public double getL_fin_dept_year_avg_bal() {
		return l_fin_dept_year_avg_bal;
	}




	public void setL_fin_dept_year_avg_bal(double l_fin_dept_year_avg_bal) {
		this.l_fin_dept_year_avg_bal = l_fin_dept_year_avg_bal;
	}




	public int getF_fin_dept_acct_qty() {
		return f_fin_dept_acct_qty;
	}




	public void setF_fin_dept_acct_qty(int f_fin_dept_acct_qty) {
		this.f_fin_dept_acct_qty = f_fin_dept_acct_qty;
	}




	public double getF_fin_dept_bal_amt() {
		return f_fin_dept_bal_amt;
	}




	public void setF_fin_dept_bal_amt(double f_fin_dept_bal_amt) {
		this.f_fin_dept_bal_amt = f_fin_dept_bal_amt;
	}




	public double getF_fin_dept_month_avg_bal() {
		return f_fin_dept_month_avg_bal;
	}




	public void setF_fin_dept_month_avg_bal(double f_fin_dept_month_avg_bal) {
		this.f_fin_dept_month_avg_bal = f_fin_dept_month_avg_bal;
	}




	public double getF_fin_dept_quarter_avg_bal() {
		return f_fin_dept_quarter_avg_bal;
	}




	public void setF_fin_dept_quarter_avg_bal(double f_fin_dept_quarter_avg_bal) {
		this.f_fin_dept_quarter_avg_bal = f_fin_dept_quarter_avg_bal;
	}




	public double getF_fin_dept_year_avg_bal() {
		return f_fin_dept_year_avg_bal;
	}




	public void setF_fin_dept_year_avg_bal(double f_fin_dept_year_avg_bal) {
		this.f_fin_dept_year_avg_bal = f_fin_dept_year_avg_bal;
	}




	public int getL_fin_fund_acct_qty() {
		return l_fin_fund_acct_qty;
	}




	public void setL_fin_fund_acct_qty(int l_fin_fund_acct_qty) {
		this.l_fin_fund_acct_qty = l_fin_fund_acct_qty;
	}




	public double getL_fin_fund_bal_amt() {
		return l_fin_fund_bal_amt;
	}




	public void setL_fin_fund_bal_amt(double l_fin_fund_bal_amt) {
		this.l_fin_fund_bal_amt = l_fin_fund_bal_amt;
	}




	public double getL_fin_fund_month_avg_bal() {
		return l_fin_fund_month_avg_bal;
	}




	public void setL_fin_fund_month_avg_bal(double l_fin_fund_month_avg_bal) {
		this.l_fin_fund_month_avg_bal = l_fin_fund_month_avg_bal;
	}




	public double getL_fin_fund_quarter_avg_bal() {
		return l_fin_fund_quarter_avg_bal;
	}




	public void setL_fin_fund_quarter_avg_bal(double l_fin_fund_quarter_avg_bal) {
		this.l_fin_fund_quarter_avg_bal = l_fin_fund_quarter_avg_bal;
	}




	public double getL_fin_fund_year_avg_bal() {
		return l_fin_fund_year_avg_bal;
	}




	public void setL_fin_fund_year_avg_bal(double l_fin_fund_year_avg_bal) {
		this.l_fin_fund_year_avg_bal = l_fin_fund_year_avg_bal;
	}




	public int getF_fin_fund_acct_qty() {
		return f_fin_fund_acct_qty;
	}




	public void setF_fin_fund_acct_qty(int f_fin_fund_acct_qty) {
		this.f_fin_fund_acct_qty = f_fin_fund_acct_qty;
	}




	public double getF_fin_fund_bal_amt() {
		return f_fin_fund_bal_amt;
	}




	public void setF_fin_fund_bal_amt(double f_fin_fund_bal_amt) {
		this.f_fin_fund_bal_amt = f_fin_fund_bal_amt;
	}




	public double getF_fin_fund_month_avg_bal() {
		return f_fin_fund_month_avg_bal;
	}




	public void setF_fin_fund_month_avg_bal(double f_fin_fund_month_avg_bal) {
		this.f_fin_fund_month_avg_bal = f_fin_fund_month_avg_bal;
	}




	public double getF_fin_fund_quarter_avg_bal() {
		return f_fin_fund_quarter_avg_bal;
	}




	public void setF_fin_fund_quarter_avg_bal(double f_fin_fund_quarter_avg_bal) {
		this.f_fin_fund_quarter_avg_bal = f_fin_fund_quarter_avg_bal;
	}




	public double getF_fin_fund_year_avg_bal() {
		return f_fin_fund_year_avg_bal;
	}




	public void setF_fin_fund_year_avg_bal(double f_fin_fund_year_avg_bal) {
		this.f_fin_fund_year_avg_bal = f_fin_fund_year_avg_bal;
	}




	public int getDebt_acct_qty() {
		return debt_acct_qty;
	}




	public void setDebt_acct_qty(int debt_acct_qty) {
		this.debt_acct_qty = debt_acct_qty;
	}




	public double getDebt_bal_amt() {
		return debt_bal_amt;
	}




	public void setDebt_bal_amt(double debt_bal_amt) {
		this.debt_bal_amt = debt_bal_amt;
	}




	public double getDebt_month_avg_bal() {
		return debt_month_avg_bal;
	}




	public void setDebt_month_avg_bal(double debt_month_avg_bal) {
		this.debt_month_avg_bal = debt_month_avg_bal;
	}




	public double getDebt_quarter_avg_bal() {
		return debt_quarter_avg_bal;
	}




	public void setDebt_quarter_avg_bal(double debt_quarter_avg_bal) {
		this.debt_quarter_avg_bal = debt_quarter_avg_bal;
	}




	public double getDebt_year_avg_bal() {
		return debt_year_avg_bal;
	}




	public void setDebt_year_avg_bal(double debt_year_avg_bal) {
		this.debt_year_avg_bal = debt_year_avg_bal;
	}




	public int getFund_acct_qty() {
		return fund_acct_qty;
	}




	public void setFund_acct_qty(int fund_acct_qty) {
		this.fund_acct_qty = fund_acct_qty;
	}




	public double getFund_bal_amt() {
		return fund_bal_amt;
	}




	public void setFund_bal_amt(double fund_bal_amt) {
		this.fund_bal_amt = fund_bal_amt;
	}




	public double getFund_month_avg_bal() {
		return fund_month_avg_bal;
	}




	public void setFund_month_avg_bal(double fund_month_avg_bal) {
		this.fund_month_avg_bal = fund_month_avg_bal;
	}




	public double getFund_quarter_avg_bal() {
		return fund_quarter_avg_bal;
	}




	public void setFund_quarter_avg_bal(double fund_quarter_avg_bal) {
		this.fund_quarter_avg_bal = fund_quarter_avg_bal;
	}




	public double getFund_year_avg_bal() {
		return fund_year_avg_bal;
	}




	public void setFund_year_avg_bal(double fund_year_avg_bal) {
		this.fund_year_avg_bal = fund_year_avg_bal;
	}




	public int getGold_acct_qty() {
		return gold_acct_qty;
	}




	public void setGold_acct_qty(int gold_acct_qty) {
		this.gold_acct_qty = gold_acct_qty;
	}




	public double getGold_bal() {
		return gold_bal;
	}




	public void setGold_bal(double gold_bal) {
		this.gold_bal = gold_bal;
	}




	public double getMon_avg_gold_bal() {
		return mon_avg_gold_bal;
	}




	public void setMon_avg_gold_bal(double mon_avg_gold_bal) {
		this.mon_avg_gold_bal = mon_avg_gold_bal;
	}




	public double getQtr_avg_gold_bal() {
		return qtr_avg_gold_bal;
	}




	public void setQtr_avg_gold_bal(double qtr_avg_gold_bal) {
		this.qtr_avg_gold_bal = qtr_avg_gold_bal;
	}




	public double getYear_avg_gold_bal() {
		return year_avg_gold_bal;
	}




	public void setYear_avg_gold_bal(double year_avg_gold_bal) {
		this.year_avg_gold_bal = year_avg_gold_bal;
	}




	public int getIns_acct_qty() {
		return ins_acct_qty;
	}




	public void setIns_acct_qty(int ins_acct_qty) {
		this.ins_acct_qty = ins_acct_qty;
	}




	public double getIns_bal() {
		return ins_bal;
	}




	public void setIns_bal(double ins_bal) {
		this.ins_bal = ins_bal;
	}




	public double getMon_avg_ins_bal() {
		return mon_avg_ins_bal;
	}




	public void setMon_avg_ins_bal(double mon_avg_ins_bal) {
		this.mon_avg_ins_bal = mon_avg_ins_bal;
	}




	public double getQtr_avg_ins_bal() {
		return qtr_avg_ins_bal;
	}




	public void setQtr_avg_ins_bal(double qtr_avg_ins_bal) {
		this.qtr_avg_ins_bal = qtr_avg_ins_bal;
	}




	public double getYear_avg_ins_bal() {
		return year_avg_ins_bal;
	}




	public void setYear_avg_ins_bal(double year_avg_ins_bal) {
		this.year_avg_ins_bal = year_avg_ins_bal;
	}




	public int getSjob_acct_qty() {
		return sjob_acct_qty;
	}




	public void setSjob_acct_qty(int sjob_acct_qty) {
		this.sjob_acct_qty = sjob_acct_qty;
	}




	public double getSjob_bal() {
		return sjob_bal;
	}




	public void setSjob_bal(double sjob_bal) {
		this.sjob_bal = sjob_bal;
	}




	public double getMon_avg_sjob_bal() {
		return mon_avg_sjob_bal;
	}




	public void setMon_avg_sjob_bal(double mon_avg_sjob_bal) {
		this.mon_avg_sjob_bal = mon_avg_sjob_bal;
	}




	public double getQtr_avg_sjob_bal() {
		return qtr_avg_sjob_bal;
	}




	public void setQtr_avg_sjob_bal(double qtr_avg_sjob_bal) {
		this.qtr_avg_sjob_bal = qtr_avg_sjob_bal;
	}




	public double getYear_avg_sjob_bal() {
		return year_avg_sjob_bal;
	}




	public void setYear_avg_sjob_bal(double year_avg_sjob_bal) {
		this.year_avg_sjob_bal = year_avg_sjob_bal;
	}




	public int getAccd_acct_qty() {
		return accd_acct_qty;
	}




	public void setAccd_acct_qty(int accd_acct_qty) {
		this.accd_acct_qty = accd_acct_qty;
	}




	public double getAccd_bal() {
		return accd_bal;
	}




	public void setAccd_bal(double accd_bal) {
		this.accd_bal = accd_bal;
	}




	public double getMon_avg_accd_bal() {
		return mon_avg_accd_bal;
	}




	public void setMon_avg_accd_bal(double mon_avg_accd_bal) {
		this.mon_avg_accd_bal = mon_avg_accd_bal;
	}




	public double getQtr_avg_accd_bal() {
		return qtr_avg_accd_bal;
	}




	public void setQtr_avg_accd_bal(double qtr_avg_accd_bal) {
		this.qtr_avg_accd_bal = qtr_avg_accd_bal;
	}




	public double getYear_avg_accd_bal() {
		return year_avg_accd_bal;
	}




	public void setYear_avg_accd_bal(double year_avg_accd_bal) {
		this.year_avg_accd_bal = year_avg_accd_bal;
	}




	public int getTa_fin_acct_qty() {
		return ta_fin_acct_qty;
	}




	public void setTa_fin_acct_qty(int ta_fin_acct_qty) {
		this.ta_fin_acct_qty = ta_fin_acct_qty;
	}




	public double getTa_fin_bal_amt() {
		return ta_fin_bal_amt;
	}




	public void setTa_fin_bal_amt(double ta_fin_bal_amt) {
		this.ta_fin_bal_amt = ta_fin_bal_amt;
	}




	public double getTa_fin_month_avg_bal() {
		return ta_fin_month_avg_bal;
	}




	public void setTa_fin_month_avg_bal(double ta_fin_month_avg_bal) {
		this.ta_fin_month_avg_bal = ta_fin_month_avg_bal;
	}




	public double getTa_fin_quarter_avg_bal() {
		return ta_fin_quarter_avg_bal;
	}




	public void setTa_fin_quarter_avg_bal(double ta_fin_quarter_avg_bal) {
		this.ta_fin_quarter_avg_bal = ta_fin_quarter_avg_bal;
	}




	public double getTa_fin_year_avg_bal() {
		return ta_fin_year_avg_bal;
	}




	public void setTa_fin_year_avg_bal(double ta_fin_year_avg_bal) {
		this.ta_fin_year_avg_bal = ta_fin_year_avg_bal;
	}




	public int getDept_trs_acct_qty() {
		return dept_trs_acct_qty;
	}




	public void setDept_trs_acct_qty(int dept_trs_acct_qty) {
		this.dept_trs_acct_qty = dept_trs_acct_qty;
	}




	public double getDept_trs_bal_amt() {
		return dept_trs_bal_amt;
	}




	public void setDept_trs_bal_amt(double dept_trs_bal_amt) {
		this.dept_trs_bal_amt = dept_trs_bal_amt;
	}




	public double getDept_trs_month_avg_bal() {
		return dept_trs_month_avg_bal;
	}




	public void setDept_trs_month_avg_bal(double dept_trs_month_avg_bal) {
		this.dept_trs_month_avg_bal = dept_trs_month_avg_bal;
	}




	public double getDept_trs_quarter_avg_bal() {
		return dept_trs_quarter_avg_bal;
	}




	public void setDept_trs_quarter_avg_bal(double dept_trs_quarter_avg_bal) {
		this.dept_trs_quarter_avg_bal = dept_trs_quarter_avg_bal;
	}




	public double getDept_trs_year_avg_bal() {
		return dept_trs_year_avg_bal;
	}




	public void setDept_trs_year_avg_bal(double dept_trs_year_avg_bal) {
		this.dept_trs_year_avg_bal = dept_trs_year_avg_bal;
	}




	public int getL_dept_trs_acct_qty() {
		return l_dept_trs_acct_qty;
	}




	public void setL_dept_trs_acct_qty(int l_dept_trs_acct_qty) {
		this.l_dept_trs_acct_qty = l_dept_trs_acct_qty;
	}




	public double getL_dept_trs_bal_amt() {
		return l_dept_trs_bal_amt;
	}




	public void setL_dept_trs_bal_amt(double l_dept_trs_bal_amt) {
		this.l_dept_trs_bal_amt = l_dept_trs_bal_amt;
	}




	public double getL_dept_trs_month_avg_bal() {
		return l_dept_trs_month_avg_bal;
	}




	public void setL_dept_trs_month_avg_bal(double l_dept_trs_month_avg_bal) {
		this.l_dept_trs_month_avg_bal = l_dept_trs_month_avg_bal;
	}




	public double getL_dept_trs_quarter_avg_bal() {
		return l_dept_trs_quarter_avg_bal;
	}




	public void setL_dept_trs_quarter_avg_bal(double l_dept_trs_quarter_avg_bal) {
		this.l_dept_trs_quarter_avg_bal = l_dept_trs_quarter_avg_bal;
	}




	public double getL_dept_trs_year_avg_bal() {
		return l_dept_trs_year_avg_bal;
	}




	public void setL_dept_trs_year_avg_bal(double l_dept_trs_year_avg_bal) {
		this.l_dept_trs_year_avg_bal = l_dept_trs_year_avg_bal;
	}




	public int getLoan_acct_qty() {
		return loan_acct_qty;
	}




	public void setLoan_acct_qty(int loan_acct_qty) {
		this.loan_acct_qty = loan_acct_qty;
	}




	public double getLoan_issue_amt() {
		return loan_issue_amt;
	}




	public void setLoan_issue_amt(double loan_issue_amt) {
		this.loan_issue_amt = loan_issue_amt;
	}




	public double getLoan_bal_amt() {
		return loan_bal_amt;
	}




	public void setLoan_bal_amt(double loan_bal_amt) {
		this.loan_bal_amt = loan_bal_amt;
	}




	public double getNloan_amt() {
		return nloan_amt;
	}




	public void setNloan_amt(double nloan_amt) {
		this.nloan_amt = nloan_amt;
	}




	public double getLoan_month_avg_bal() {
		return loan_month_avg_bal;
	}




	public void setLoan_month_avg_bal(double loan_month_avg_bal) {
		this.loan_month_avg_bal = loan_month_avg_bal;
	}




	public double getLoan_quarter_avg_bal() {
		return loan_quarter_avg_bal;
	}




	public void setLoan_quarter_avg_bal(double loan_quarter_avg_bal) {
		this.loan_quarter_avg_bal = loan_quarter_avg_bal;
	}




	public double getLoan_year_avg_bal() {
		return loan_year_avg_bal;
	}




	public void setLoan_year_avg_bal(double loan_year_avg_bal) {
		this.loan_year_avg_bal = loan_year_avg_bal;
	}




	public int getMicro_acct_qty() {
		return micro_acct_qty;
	}




	public void setMicro_acct_qty(int micro_acct_qty) {
		this.micro_acct_qty = micro_acct_qty;
	}




	public double getMicro_issue_amt() {
		return micro_issue_amt;
	}




	public void setMicro_issue_amt(double micro_issue_amt) {
		this.micro_issue_amt = micro_issue_amt;
	}




	public double getMicro_bal_amt() {
		return micro_bal_amt;
	}




	public void setMicro_bal_amt(double micro_bal_amt) {
		this.micro_bal_amt = micro_bal_amt;
	}




	public double getMicro_month_avg_bal() {
		return micro_month_avg_bal;
	}




	public void setMicro_month_avg_bal(double micro_month_avg_bal) {
		this.micro_month_avg_bal = micro_month_avg_bal;
	}




	public double getMicro_quarter_avg_bal() {
		return micro_quarter_avg_bal;
	}




	public void setMicro_quarter_avg_bal(double micro_quarter_avg_bal) {
		this.micro_quarter_avg_bal = micro_quarter_avg_bal;
	}




	public double getMicro_year_avg_bal() {
		return micro_year_avg_bal;
	}




	public void setMicro_year_avg_bal(double micro_year_avg_bal) {
		this.micro_year_avg_bal = micro_year_avg_bal;
	}




	public int getSc_acct_qty() {
		return sc_acct_qty;
	}




	public void setSc_acct_qty(int sc_acct_qty) {
		this.sc_acct_qty = sc_acct_qty;
	}




	public double getSc_bal_amt() {
		return sc_bal_amt;
	}




	public void setSc_bal_amt(double sc_bal_amt) {
		this.sc_bal_amt = sc_bal_amt;
	}




	public double getSc_bal_month_avg_bal() {
		return sc_bal_month_avg_bal;
	}




	public void setSc_bal_month_avg_bal(double sc_bal_month_avg_bal) {
		this.sc_bal_month_avg_bal = sc_bal_month_avg_bal;
	}




	public double getSc_bal_quarter_avg_bal() {
		return sc_bal_quarter_avg_bal;
	}




	public void setSc_bal_quarter_avg_bal(double sc_bal_quarter_avg_bal) {
		this.sc_bal_quarter_avg_bal = sc_bal_quarter_avg_bal;
	}




	public double getSc_bal_year_avg_bal() {
		return sc_bal_year_avg_bal;
	}




	public void setSc_bal_year_avg_bal(double sc_bal_year_avg_bal) {
		this.sc_bal_year_avg_bal = sc_bal_year_avg_bal;
	}




	public int getCcard_acct_qty() {
		return ccard_acct_qty;
	}




	public void setCcard_acct_qty(int ccard_acct_qty) {
		this.ccard_acct_qty = ccard_acct_qty;
	}




	public int getCcard_card_qty() {
		return ccard_card_qty;
	}




	public void setCcard_card_qty(int ccard_card_qty) {
		this.ccard_card_qty = ccard_card_qty;
	}




	public double getCcard_limit_amt() {
		return ccard_limit_amt;
	}




	public void setCcard_limit_amt(double ccard_limit_amt) {
		this.ccard_limit_amt = ccard_limit_amt;
	}




	public double getCcard_usable_amt() {
		return ccard_usable_amt;
	}




	public void setCcard_usable_amt(double ccard_usable_amt) {
		this.ccard_usable_amt = ccard_usable_amt;
	}




	public double getCcard_month_amt() {
		return ccard_month_amt;
	}




	public void setCcard_month_amt(double ccard_month_amt) {
		this.ccard_month_amt = ccard_month_amt;
	}




	public double getCcard_year_amt() {
		return ccard_year_amt;
	}




	public void setCcard_year_amt(double ccard_year_amt) {
		this.ccard_year_amt = ccard_year_amt;
	}




	public double getCcard_year_avg_amt() {
		return ccard_year_avg_amt;
	}




	public void setCcard_year_avg_amt(double ccard_year_avg_amt) {
		this.ccard_year_avg_amt = ccard_year_avg_amt;
	}




	public double getCcard_total_purchases_amt() {
		return ccard_total_purchases_amt;
	}




	public void setCcard_total_purchases_amt(double ccard_total_purchases_amt) {
		this.ccard_total_purchases_amt = ccard_total_purchases_amt;
	}




	public double getAst2_bal_amt() {
		return ast2_bal_amt;
	}




	public void setAst2_bal_amt(double ast2_bal_amt) {
		this.ast2_bal_amt = ast2_bal_amt;
	}




	public double getAst2_month_avg_bal() {
		return ast2_month_avg_bal;
	}




	public void setAst2_month_avg_bal(double ast2_month_avg_bal) {
		this.ast2_month_avg_bal = ast2_month_avg_bal;
	}




	public double getAst2_quarter_avg_bal() {
		return ast2_quarter_avg_bal;
	}




	public void setAst2_quarter_avg_bal(double ast2_quarter_avg_bal) {
		this.ast2_quarter_avg_bal = ast2_quarter_avg_bal;
	}




	public double getAst2_year_avg_bal() {
		return ast2_year_avg_bal;
	}




	public void setAst2_year_avg_bal(double ast2_year_avg_bal) {
		this.ast2_year_avg_bal = ast2_year_avg_bal;
	}




	public double getAst4_bal_amt() {
		return ast4_bal_amt;
	}




	public void setAst4_bal_amt(double ast4_bal_amt) {
		this.ast4_bal_amt = ast4_bal_amt;
	}




	public double getAst4_month_avg_bal() {
		return ast4_month_avg_bal;
	}




	public void setAst4_month_avg_bal(double ast4_month_avg_bal) {
		this.ast4_month_avg_bal = ast4_month_avg_bal;
	}




	public double getAst4_quarter_avg_bal() {
		return ast4_quarter_avg_bal;
	}




	public void setAst4_quarter_avg_bal(double ast4_quarter_avg_bal) {
		this.ast4_quarter_avg_bal = ast4_quarter_avg_bal;
	}




	public double getAst4_year_avg_bal() {
		return ast4_year_avg_bal;
	}




	public void setAst4_year_avg_bal(double ast4_year_avg_bal) {
		this.ast4_year_avg_bal = ast4_year_avg_bal;
	}




	public double getAssert9_bal() {
		return assert9_bal;
	}




	public void setAssert9_bal(double assert9_bal) {
		this.assert9_bal = assert9_bal;
	}




	public double getMon_avg_assert9_bal() {
		return mon_avg_assert9_bal;
	}




	public void setMon_avg_assert9_bal(double mon_avg_assert9_bal) {
		this.mon_avg_assert9_bal = mon_avg_assert9_bal;
	}




	public double getQtr_avg_assert9_bal() {
		return qtr_avg_assert9_bal;
	}




	public void setQtr_avg_assert9_bal(double qtr_avg_assert9_bal) {
		this.qtr_avg_assert9_bal = qtr_avg_assert9_bal;
	}




	public double getYear_avg_assert9_bal() {
		return year_avg_assert9_bal;
	}




	public void setYear_avg_assert9_bal(double year_avg_assert9_bal) {
		this.year_avg_assert9_bal = year_avg_assert9_bal;
	}




	public int getHold_dept_ind() {
		return hold_dept_ind;
	}




	public void setHold_dept_ind(int hold_dept_ind) {
		this.hold_dept_ind = hold_dept_ind;
	}




	public int getHold_fin_ind() {
		return hold_fin_ind;
	}




	public void setHold_fin_ind(int hold_fin_ind) {
		this.hold_fin_ind = hold_fin_ind;
	}




	public int getHold_debt_ind() {
		return hold_debt_ind;
	}




	public void setHold_debt_ind(int hold_debt_ind) {
		this.hold_debt_ind = hold_debt_ind;
	}




	public int getHold_fund_ind() {
		return hold_fund_ind;
	}




	public void setHold_fund_ind(int hold_fund_ind) {
		this.hold_fund_ind = hold_fund_ind;
	}




	public int getHold_loan_ind() {
		return hold_loan_ind;
	}




	public void setHold_loan_ind(int hold_loan_ind) {
		this.hold_loan_ind = hold_loan_ind;
	}




	public int getHold_sc_ind() {
		return hold_sc_ind;
	}




	public void setHold_sc_ind(int hold_sc_ind) {
		this.hold_sc_ind = hold_sc_ind;
	}




	public int getHold_ccard_ind() {
		return hold_ccard_ind;
	}




	public void setHold_ccard_ind(int hold_ccard_ind) {
		this.hold_ccard_ind = hold_ccard_ind;
	}




	public int getHold_gold_ind() {
		return hold_gold_ind;
	}




	public void setHold_gold_ind(int hold_gold_ind) {
		this.hold_gold_ind = hold_gold_ind;
	}




	public int getHold_ins_ind() {
		return hold_ins_ind;
	}




	public void setHold_ins_ind(int hold_ins_ind) {
		this.hold_ins_ind = hold_ins_ind;
	}




	public int getHold_sjob_ind() {
		return hold_sjob_ind;
	}




	public void setHold_sjob_ind(int hold_sjob_ind) {
		this.hold_sjob_ind = hold_sjob_ind;
	}




	public int getHold_accd_ind() {
		return hold_accd_ind;
	}




	public void setHold_accd_ind(int hold_accd_ind) {
		this.hold_accd_ind = hold_accd_ind;
	}




	public int getHold_prod_type_num() {
		return hold_prod_type_num;
	}




	public void setHold_prod_type_num(int hold_prod_type_num) {
		this.hold_prod_type_num = hold_prod_type_num;
	}




	public int getHold_prod_num() {
		return hold_prod_num;
	}




	public void setHold_prod_num(int hold_prod_num) {
		this.hold_prod_num = hold_prod_num;
	}




	public int getSc_sign_ind() {
		return sc_sign_ind;
	}




	public void setSc_sign_ind(int sc_sign_ind) {
		this.sc_sign_ind = sc_sign_ind;
	}




	public String getSc_sign_dt() {
		return sc_sign_dt;
	}




	public void setSc_sign_dt(String sc_sign_dt) {
		this.sc_sign_dt = sc_sign_dt;
	}




	public int getNb_sign_ind() {
		return nb_sign_ind;
	}




	public void setNb_sign_ind(int nb_sign_ind) {
		this.nb_sign_ind = nb_sign_ind;
	}




	public String getNb_sign_dt() {
		return nb_sign_dt;
	}




	public void setNb_sign_dt(String nb_sign_dt) {
		this.nb_sign_dt = nb_sign_dt;
	}




	public int getMb_sign_ind() {
		return mb_sign_ind;
	}




	public void setMb_sign_ind(int mb_sign_ind) {
		this.mb_sign_ind = mb_sign_ind;
	}




	public String getMb_sign_dt() {
		return mb_sign_dt;
	}




	public void setMb_sign_dt(String mb_sign_dt) {
		this.mb_sign_dt = mb_sign_dt;
	}




	public int getSms_sign_ind() {
		return sms_sign_ind;
	}




	public void setSms_sign_ind(int sms_sign_ind) {
		this.sms_sign_ind = sms_sign_ind;
	}




	public String getSms_sign_dt() {
		return sms_sign_dt;
	}




	public void setSms_sign_dt(String sms_sign_dt) {
		this.sms_sign_dt = sms_sign_dt;
	}




	public int getSaly_sign_ind() {
		return saly_sign_ind;
	}




	public void setSaly_sign_ind(int saly_sign_ind) {
		this.saly_sign_ind = saly_sign_ind;
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




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
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




	public int getProd_num() {
		return prod_num;
	}




	public void setProd_num(int prod_num) {
		this.prod_num = prod_num;
	}




	public String getProd_sav() {
		return prod_sav;
	}




	public void setProd_sav(String prod_sav) {
		this.prod_sav = prod_sav;
	}




	public String getProd_fin() {
		return prod_fin;
	}




	public void setProd_fin(String prod_fin) {
		this.prod_fin = prod_fin;
	}




	public String getProd_fin_nav() {
		return prod_fin_nav;
	}




	public void setProd_fin_nav(String prod_fin_nav) {
		this.prod_fin_nav = prod_fin_nav;
	}




	public String getProd_fin_fixed_income() {
		return prod_fin_fixed_income;
	}




	public void setProd_fin_fixed_income(String prod_fin_fixed_income) {
		this.prod_fin_fixed_income = prod_fin_fixed_income;
	}




	public String getProd_fin_indiv() {
		return prod_fin_indiv;
	}




	public void setProd_fin_indiv(String prod_fin_indiv) {
		this.prod_fin_indiv = prod_fin_indiv;
	}




	public String getProd_fun() {
		return prod_fun;
	}




	public void setProd_fun(String prod_fun) {
		this.prod_fun = prod_fun;
	}




	public String getProd_bon() {
		return prod_bon;
	}




	public void setProd_bon(String prod_bon) {
		this.prod_bon = prod_bon;
	}




	public String getProd_sec() {
		return prod_sec;
	}




	public void setProd_sec(String prod_sec) {
		this.prod_sec = prod_sec;
	}




	public String getProd_gld() {
		return prod_gld;
	}




	public void setProd_gld(String prod_gld) {
		this.prod_gld = prod_gld;
	}




	public String getProd_tru() {
		return prod_tru;
	}




	public void setProd_tru(String prod_tru) {
		this.prod_tru = prod_tru;
	}




	public String getProd_pot() {
		return prod_pot;
	}




	public void setProd_pot(String prod_pot) {
		this.prod_pot = prod_pot;
	}




	public String getProd_idr() {
		return prod_idr;
	}




	public void setProd_idr(String prod_idr) {
		this.prod_idr = prod_idr;
	}




	public String getProd_lod() {
		return prod_lod;
	}




	public void setProd_lod(String prod_lod) {
		this.prod_lod = prod_lod;
	}




	public String getProd_lod_house() {
		return prod_lod_house;
	}




	public void setProd_lod_house(String prod_lod_house) {
		this.prod_lod_house = prod_lod_house;
	}




	public String getProd_lod_compre_cre() {
		return prod_lod_compre_cre;
	}




	public void setProd_lod_compre_cre(String prod_lod_compre_cre) {
		this.prod_lod_compre_cre = prod_lod_compre_cre;
	}




	public String getProd_lod_compre_oth() {
		return prod_lod_compre_oth;
	}




	public void setProd_lod_compre_oth(String prod_lod_compre_oth) {
		this.prod_lod_compre_oth = prod_lod_compre_oth;
	}




	public String getProd_lod_ple() {
		return prod_lod_ple;
	}




	public void setProd_lod_ple(String prod_lod_ple) {
		this.prod_lod_ple = prod_lod_ple;
	}




	public String getProd_lod_entru() {
		return prod_lod_entru;
	}




	public void setProd_lod_entru(String prod_lod_entru) {
		this.prod_lod_entru = prod_lod_entru;
	}




	public String getProd_crd() {
		return prod_crd;
	}




	public void setProd_crd(String prod_crd) {
		this.prod_crd = prod_crd;
	}




	public String getProd_mic() {
		return prod_mic;
	}




	public void setProd_mic(String prod_mic) {
		this.prod_mic = prod_mic;
	}




	public String getProd_mic_coml_mortg() {
		return prod_mic_coml_mortg;
	}




	public void setProd_mic_coml_mortg(String prod_mic_coml_mortg) {
		this.prod_mic_coml_mortg = prod_mic_coml_mortg;
	}




	public String getProd_mic_housing() {
		return prod_mic_housing;
	}




	public void setProd_mic_housing(String prod_mic_housing) {
		this.prod_mic_housing = prod_mic_housing;
	}




	public String getProd_mic_oth_aid() {
		return prod_mic_oth_aid;
	}




	public void setProd_mic_oth_aid(String prod_mic_oth_aid) {
		this.prod_mic_oth_aid = prod_mic_oth_aid;
	}




	public String getProd_mic_chan() {
		return prod_mic_chan;
	}




	public void setProd_mic_chan(String prod_mic_chan) {
		this.prod_mic_chan = prod_mic_chan;
	}




	public String getProd_mic_cons() {
		return prod_mic_cons;
	}




	public void setProd_mic_cons(String prod_mic_cons) {
		this.prod_mic_cons = prod_mic_cons;
	}




	public String getProd_pay() {
		return prod_pay;
	}




	public void setProd_pay(String prod_pay) {
		this.prod_pay = prod_pay;
	}




	public String getProd_btch_cr() {
		return prod_btch_cr;
	}




	public void setProd_btch_cr(String prod_btch_cr) {
		this.prod_btch_cr = prod_btch_cr;
	}




	public String getProd_btch_dr() {
		return prod_btch_dr;
	}




	public void setProd_btch_dr(String prod_btch_dr) {
		this.prod_btch_dr = prod_btch_dr;
	}




	public String getProd_fxa() {
		return prod_fxa;
	}




	public void setProd_fxa(String prod_fxa) {
		this.prod_fxa = prod_fxa;
	}




	public String getProd_fxa_settle() {
		return prod_fxa_settle;
	}




	public void setProd_fxa_settle(String prod_fxa_settle) {
		this.prod_fxa_settle = prod_fxa_settle;
	}




	public String getProd_fxa_dept() {
		return prod_fxa_dept;
	}




	public void setProd_fxa_dept(String prod_fxa_dept) {
		this.prod_fxa_dept = prod_fxa_dept;
	}




	public String getProd_fbp() {
		return prod_fbp;
	}




	public void setProd_fbp(String prod_fbp) {
		this.prod_fbp = prod_fbp;
	}




	public String getProd_elc() {
		return prod_elc;
	}




	public void setProd_elc(String prod_elc) {
		this.prod_elc = prod_elc;
	}




	public String getProd_ela() {
		return prod_ela;
	}




	public void setProd_ela(String prod_ela) {
		this.prod_ela = prod_ela;
	}




	public String getProd_clt() {
		return prod_clt;
	}




	public void setProd_clt(String prod_clt) {
		this.prod_clt = prod_clt;
	}




	public String getProd_p2p() {
		return prod_p2p;
	}




	public void setProd_p2p(String prod_p2p) {
		this.prod_p2p = prod_p2p;
	}




	public String getProd_mcm() {
		return prod_mcm;
	}




	public void setProd_mcm(String prod_mcm) {
		this.prod_mcm = prod_mcm;
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




	public String getGroup_deposit() {
		return group_deposit;
	}




	public void setGroup_deposit(String group_deposit) {
		this.group_deposit = group_deposit;
	}




	public String getGroup_fincing() {
		return group_fincing;
	}




	public void setGroup_fincing(String group_fincing) {
		this.group_fincing = group_fincing;
	}




	public String getGroup_na_fincing() {
		return group_na_fincing;
	}




	public void setGroup_na_fincing(String group_na_fincing) {
		this.group_na_fincing = group_na_fincing;
	}




	public String getGroup_fincing_agent() {
		return group_fincing_agent;
	}




	public void setGroup_fincing_agent(String group_fincing_agent) {
		this.group_fincing_agent = group_fincing_agent;
	}




	public String getGroup_fincing_agent_fud() {
		return group_fincing_agent_fud;
	}




	public void setGroup_fincing_agent_fud(String group_fincing_agent_fud) {
		this.group_fincing_agent_fud = group_fincing_agent_fud;
	}




	public String getGroup_fincing_agent_ins() {
		return group_fincing_agent_ins;
	}




	public void setGroup_fincing_agent_ins(String group_fincing_agent_ins) {
		this.group_fincing_agent_ins = group_fincing_agent_ins;
	}




	public String getGroup_fincing_agent_tru() {
		return group_fincing_agent_tru;
	}




	public void setGroup_fincing_agent_tru(String group_fincing_agent_tru) {
		this.group_fincing_agent_tru = group_fincing_agent_tru;
	}




	public String getGroup_fincing_agent_bon() {
		return group_fincing_agent_bon;
	}




	public void setGroup_fincing_agent_bon(String group_fincing_agent_bon) {
		this.group_fincing_agent_bon = group_fincing_agent_bon;
	}




	public String getGroup_fincing_sc() {
		return group_fincing_sc;
	}




	public void setGroup_fincing_sc(String group_fincing_sc) {
		this.group_fincing_sc = group_fincing_sc;
	}




	public String getGroup_microbiz() {
		return group_microbiz;
	}




	public void setGroup_microbiz(String group_microbiz) {
		this.group_microbiz = group_microbiz;
	}




	public String getGroup_mic_loan() {
		return group_mic_loan;
	}




	public void setGroup_mic_loan(String group_mic_loan) {
		this.group_mic_loan = group_mic_loan;
	}




	public String getGroup_mic_loan_com() {
		return group_mic_loan_com;
	}




	public void setGroup_mic_loan_com(String group_mic_loan_com) {
		this.group_mic_loan_com = group_mic_loan_com;
	}




	public String getGroup_mic_loan_hous() {
		return group_mic_loan_hous;
	}




	public void setGroup_mic_loan_hous(String group_mic_loan_hous) {
		this.group_mic_loan_hous = group_mic_loan_hous;
	}




	public String getGroup_mic_loan_oth() {
		return group_mic_loan_oth;
	}




	public void setGroup_mic_loan_oth(String group_mic_loan_oth) {
		this.group_mic_loan_oth = group_mic_loan_oth;
	}




	public String getGroup_mic_loan_chan() {
		return group_mic_loan_chan;
	}




	public void setGroup_mic_loan_chan(String group_mic_loan_chan) {
		this.group_mic_loan_chan = group_mic_loan_chan;
	}




	public String getGroup_mic_loan_cons() {
		return group_mic_loan_cons;
	}




	public void setGroup_mic_loan_cons(String group_mic_loan_cons) {
		this.group_mic_loan_cons = group_mic_loan_cons;
	}




	public String getGroup_mic_rela() {
		return group_mic_rela;
	}




	public void setGroup_mic_rela(String group_mic_rela) {
		this.group_mic_rela = group_mic_rela;
	}




	public String getGroup_loan() {
		return group_loan;
	}




	public void setGroup_loan(String group_loan) {
		this.group_loan = group_loan;
	}




	public String getGroup_loan_house() {
		return group_loan_house;
	}




	public void setGroup_loan_house(String group_loan_house) {
		this.group_loan_house = group_loan_house;
	}




	public String getGroup_loan_compre() {
		return group_loan_compre;
	}




	public void setGroup_loan_compre(String group_loan_compre) {
		this.group_loan_compre = group_loan_compre;
	}




	public String getGroup_loan_compre_cre() {
		return group_loan_compre_cre;
	}




	public void setGroup_loan_compre_cre(String group_loan_compre_cre) {
		this.group_loan_compre_cre = group_loan_compre_cre;
	}




	public String getGroup_loan_compre_oth() {
		return group_loan_compre_oth;
	}




	public void setGroup_loan_compre_oth(String group_loan_compre_oth) {
		this.group_loan_compre_oth = group_loan_compre_oth;
	}




	public String getGroup_loan_ple() {
		return group_loan_ple;
	}




	public void setGroup_loan_ple(String group_loan_ple) {
		this.group_loan_ple = group_loan_ple;
	}




	public String getGroup_loan_ent() {
		return group_loan_ent;
	}




	public void setGroup_loan_ent(String group_loan_ent) {
		this.group_loan_ent = group_loan_ent;
	}




	public String getGroup_creditcard() {
		return group_creditcard;
	}




	public void setGroup_creditcard(String group_creditcard) {
		this.group_creditcard = group_creditcard;
	}




	public String getGroup_batch_cr() {
		return group_batch_cr;
	}




	public void setGroup_batch_cr(String group_batch_cr) {
		this.group_batch_cr = group_batch_cr;
	}




	public String getGroup_batch_salary() {
		return group_batch_salary;
	}




	public void setGroup_batch_salary(String group_batch_salary) {
		this.group_batch_salary = group_batch_salary;
	}




	public String getGroup_batch_inter() {
		return group_batch_inter;
	}




	public void setGroup_batch_inter(String group_batch_inter) {
		this.group_batch_inter = group_batch_inter;
	}




	public String getGroup_batch_spec() {
		return group_batch_spec;
	}




	public void setGroup_batch_spec(String group_batch_spec) {
		this.group_batch_spec = group_batch_spec;
	}




	public String getGroup_batch_oth() {
		return group_batch_oth;
	}




	public void setGroup_batch_oth(String group_batch_oth) {
		this.group_batch_oth = group_batch_oth;
	}




	public String getGroup_finaboard() {
		return group_finaboard;
	}




	public void setGroup_finaboard(String group_finaboard) {
		this.group_finaboard = group_finaboard;
	}




	public String getGroup_finaboard_settle() {
		return group_finaboard_settle;
	}




	public void setGroup_finaboard_settle(String group_finaboard_settle) {
		this.group_finaboard_settle = group_finaboard_settle;
	}




	public String getGroup_finaboard_dept() {
		return group_finaboard_dept;
	}




	public void setGroup_finaboard_dept(String group_finaboard_dept) {
		this.group_finaboard_dept = group_finaboard_dept;
	}




	public String getGroup_finaboard_sun() {
		return group_finaboard_sun;
	}




	public void setGroup_finaboard_sun(String group_finaboard_sun) {
		this.group_finaboard_sun = group_finaboard_sun;
	}




	public String getGroup_pwm() {
		return group_pwm;
	}




	public void setGroup_pwm(String group_pwm) {
		this.group_pwm = group_pwm;
	}




	public String getGroup_res1() {
		return group_res1;
	}




	public void setGroup_res1(String group_res1) {
		this.group_res1 = group_res1;
	}




	public String getGroup_res2() {
		return group_res2;
	}




	public void setGroup_res2(String group_res2) {
		this.group_res2 = group_res2;
	}




	public String getGroup_res3() {
		return group_res3;
	}




	public void setGroup_res3(String group_res3) {
		this.group_res3 = group_res3;
	}




	public int getCust_flag() {
		return cust_flag;
	}




	public void setCust_flag(int cust_flag) {
		this.cust_flag = cust_flag;
	}




	public String getAsset_debit_lvl_id() {
		return asset_debit_lvl_id;
	}




	public void setAsset_debit_lvl_id(String asset_debit_lvl_id) {
		this.asset_debit_lvl_id = asset_debit_lvl_id;
	}




	public String getAsset_debit_lvl_cid() {
		return asset_debit_lvl_cid;
	}




	public void setAsset_debit_lvl_cid(String asset_debit_lvl_cid) {
		this.asset_debit_lvl_cid = asset_debit_lvl_cid;
	}




	public String getFin_asset_debit_lvl_id() {
		return fin_asset_debit_lvl_id;
	}




	public void setFin_asset_debit_lvl_id(String fin_asset_debit_lvl_id) {
		this.fin_asset_debit_lvl_id = fin_asset_debit_lvl_id;
	}




	public String getFin_asset_debit_lvl_cid() {
		return fin_asset_debit_lvl_cid;
	}




	public void setFin_asset_debit_lvl_cid(String fin_asset_debit_lvl_cid) {
		this.fin_asset_debit_lvl_cid = fin_asset_debit_lvl_cid;
	}




	public String getFin_mon1() {
		return fin_mon1;
	}




	public void setFin_mon1(String fin_mon1) {
		this.fin_mon1 = fin_mon1;
	}




	public String getFin_mon2() {
		return fin_mon2;
	}




	public void setFin_mon2(String fin_mon2) {
		this.fin_mon2 = fin_mon2;
	}




	public String getFin_mon3() {
		return fin_mon3;
	}




	public void setFin_mon3(String fin_mon3) {
		this.fin_mon3 = fin_mon3;
	}




	public String getCcd_asset_debit_lvl_id() {
		return ccd_asset_debit_lvl_id;
	}




	public void setCcd_asset_debit_lvl_id(String ccd_asset_debit_lvl_id) {
		this.ccd_asset_debit_lvl_id = ccd_asset_debit_lvl_id;
	}




	public String getLn_asset_debit_lvl_id() {
		return ln_asset_debit_lvl_id;
	}




	public void setLn_asset_debit_lvl_id(String ln_asset_debit_lvl_id) {
		this.ln_asset_debit_lvl_id = ln_asset_debit_lvl_id;
	}




	public String getLn_asset_debit_lvl_cid() {
		return ln_asset_debit_lvl_cid;
	}




	public void setLn_asset_debit_lvl_cid(String ln_asset_debit_lvl_cid) {
		this.ln_asset_debit_lvl_cid = ln_asset_debit_lvl_cid;
	}




	public String getLn_mon1() {
		return ln_mon1;
	}




	public void setLn_mon1(String ln_mon1) {
		this.ln_mon1 = ln_mon1;
	}




	public String getLn_mon2() {
		return ln_mon2;
	}




	public void setLn_mon2(String ln_mon2) {
		this.ln_mon2 = ln_mon2;
	}




	public String getLn_mon3() {
		return ln_mon3;
	}




	public void setLn_mon3(String ln_mon3) {
		this.ln_mon3 = ln_mon3;
	}




	public String getLn_mon4() {
		return ln_mon4;
	}




	public void setLn_mon4(String ln_mon4) {
		this.ln_mon4 = ln_mon4;
	}




	public String getLn_mon5() {
		return ln_mon5;
	}




	public void setLn_mon5(String ln_mon5) {
		this.ln_mon5 = ln_mon5;
	}




	public String getLn_mon6() {
		return ln_mon6;
	}




	public void setLn_mon6(String ln_mon6) {
		this.ln_mon6 = ln_mon6;
	}




	public int getAsset_debit_lvl_times() {
		return asset_debit_lvl_times;
	}




	public void setAsset_debit_lvl_times(int asset_debit_lvl_times) {
		this.asset_debit_lvl_times = asset_debit_lvl_times;
	}




	public int getFin_asset_debit_lvl_times() {
		return fin_asset_debit_lvl_times;
	}




	public void setFin_asset_debit_lvl_times(int fin_asset_debit_lvl_times) {
		this.fin_asset_debit_lvl_times = fin_asset_debit_lvl_times;
	}




	public int getLn_asset_debit_lvl_times() {
		return ln_asset_debit_lvl_times;
	}




	public void setLn_asset_debit_lvl_times(int ln_asset_debit_lvl_times) {
		this.ln_asset_debit_lvl_times = ln_asset_debit_lvl_times;
	}




	public int getCcd_asset_debit_lvl_times() {
		return ccd_asset_debit_lvl_times;
	}




	public void setCcd_asset_debit_lvl_times(int ccd_asset_debit_lvl_times) {
		this.ccd_asset_debit_lvl_times = ccd_asset_debit_lvl_times;
	}




	public String getCust_flg() {
		return cust_flg;
	}




	public void setCust_flg(String cust_flg) {
		this.cust_flg = cust_flg;
	}




	public int getCust_lost_flg() {
		return cust_lost_flg;
	}




	public void setCust_lost_flg(int cust_lost_flg) {
		this.cust_lost_flg = cust_lost_flg;
	}




	public String getAssets_debt_lvl_cd() {
		return assets_debt_lvl_cd;
	}




	public void setAssets_debt_lvl_cd(String assets_debt_lvl_cd) {
		this.assets_debt_lvl_cd = assets_debt_lvl_cd;
	}




	public String getFin_assets_debt_lvl_cd() {
		return fin_assets_debt_lvl_cd;
	}




	public void setFin_assets_debt_lvl_cd(String fin_assets_debt_lvl_cd) {
		this.fin_assets_debt_lvl_cd = fin_assets_debt_lvl_cd;
	}




	public String getLn_assets_debt_lvl_cd() {
		return ln_assets_debt_lvl_cd;
	}




	public void setLn_assets_debt_lvl_cd(String ln_assets_debt_lvl_cd) {
		this.ln_assets_debt_lvl_cd = ln_assets_debt_lvl_cd;
	}




	public String getCcd_assets_debt_lvl_cd() {
		return ccd_assets_debt_lvl_cd;
	}




	public void setCcd_assets_debt_lvl_cd(String ccd_assets_debt_lvl_cd) {
		this.ccd_assets_debt_lvl_cd = ccd_assets_debt_lvl_cd;
	}




	public String getAssets_lvl_cd() {
		return assets_lvl_cd;
	}




	public void setAssets_lvl_cd(String assets_lvl_cd) {
		this.assets_lvl_cd = assets_lvl_cd;
	}




	public String getProfit_lvl_cd() {
		return profit_lvl_cd;
	}




	public void setProfit_lvl_cd(String profit_lvl_cd) {
		this.profit_lvl_cd = profit_lvl_cd;
	}




	public double getDay_profit() {
		return day_profit;
	}




	public void setDay_profit(double day_profit) {
		this.day_profit = day_profit;
	}




	public double getProfit_mon_base() {
		return profit_mon_base;
	}




	public void setProfit_mon_base(double profit_mon_base) {
		this.profit_mon_base = profit_mon_base;
	}




	public String getRgstr_sign_use_lvl_id() {
		return rgstr_sign_use_lvl_id;
	}




	public void setRgstr_sign_use_lvl_id(String rgstr_sign_use_lvl_id) {
		this.rgstr_sign_use_lvl_id = rgstr_sign_use_lvl_id;
	}




	public String getRetl_rgstr_sign_use_lvl_id() {
		return retl_rgstr_sign_use_lvl_id;
	}




	public void setRetl_rgstr_sign_use_lvl_id(String retl_rgstr_sign_use_lvl_id) {
		this.retl_rgstr_sign_use_lvl_id = retl_rgstr_sign_use_lvl_id;
	}




	public String getCcd_rgstr_sign_use_lvl_id() {
		return ccd_rgstr_sign_use_lvl_id;
	}




	public void setCcd_rgstr_sign_use_lvl_id(String ccd_rgstr_sign_use_lvl_id) {
		this.ccd_rgstr_sign_use_lvl_id = ccd_rgstr_sign_use_lvl_id;
	}




	public String getEchl_rgstr_sign_use_lvl_id() {
		return echl_rgstr_sign_use_lvl_id;
	}




	public void setEchl_rgstr_sign_use_lvl_id(String echl_rgstr_sign_use_lvl_id) {
		this.echl_rgstr_sign_use_lvl_id = echl_rgstr_sign_use_lvl_id;
	}




	public String getBuy_freq_lvl_id() {
		return buy_freq_lvl_id;
	}




	public void setBuy_freq_lvl_id(String buy_freq_lvl_id) {
		this.buy_freq_lvl_id = buy_freq_lvl_id;
	}




	public String getActiv_lvl_id() {
		return activ_lvl_id;
	}




	public void setActiv_lvl_id(String activ_lvl_id) {
		this.activ_lvl_id = activ_lvl_id;
	}




	public String getRetl_activ_lvl_id() {
		return retl_activ_lvl_id;
	}




	public void setRetl_activ_lvl_id(String retl_activ_lvl_id) {
		this.retl_activ_lvl_id = retl_activ_lvl_id;
	}




	public String getCcd_activ_lvl_id() {
		return ccd_activ_lvl_id;
	}




	public void setCcd_activ_lvl_id(String ccd_activ_lvl_id) {
		this.ccd_activ_lvl_id = ccd_activ_lvl_id;
	}




	public String getEchl_activ_lvl_id() {
		return echl_activ_lvl_id;
	}




	public void setEchl_activ_lvl_id(String echl_activ_lvl_id) {
		this.echl_activ_lvl_id = echl_activ_lvl_id;
	}




	public String getCust_lylty() {
		return cust_lylty;
	}




	public void setCust_lylty(String cust_lylty) {
		this.cust_lylty = cust_lylty;
	}




	public String getLylty_lvl_id() {
		return lylty_lvl_id;
	}




	public void setLylty_lvl_id(String lylty_lvl_id) {
		this.lylty_lvl_id = lylty_lvl_id;
	}




	public String getFin_manager() {
		return fin_manager;
	}




	public void setFin_manager(String fin_manager) {
		this.fin_manager = fin_manager;
	}




	public String getLn_manager() {
		return ln_manager;
	}




	public void setLn_manager(String ln_manager) {
		this.ln_manager = ln_manager;
	}




	public String getCcd_manager() {
		return ccd_manager;
	}




	public void setCcd_manager(String ccd_manager) {
		this.ccd_manager = ccd_manager;
	}




	public String getInvst_risk_lvl_id() {
		return invst_risk_lvl_id;
	}




	public void setInvst_risk_lvl_id(String invst_risk_lvl_id) {
		this.invst_risk_lvl_id = invst_risk_lvl_id;
	}




	public String getCust_grade_result_cd() {
		return cust_grade_result_cd;
	}




	public void setCust_grade_result_cd(String cust_grade_result_cd) {
		this.cust_grade_result_cd = cust_grade_result_cd;
	}




	public double getLately_assets_num3() {
		return lately_assets_num3;
	}




	public void setLately_assets_num3(double lately_assets_num3) {
		this.lately_assets_num3 = lately_assets_num3;
	}




	public double getLately_ln_num3() {
		return lately_ln_num3;
	}




	public void setLately_ln_num3(double lately_ln_num3) {
		this.lately_ln_num3 = lately_ln_num3;
	}




	public double getLately_ccd_num3() {
		return lately_ccd_num3;
	}




	public void setLately_ccd_num3(double lately_ccd_num3) {
		this.lately_ccd_num3 = lately_ccd_num3;
	}




	public double getLately_acct_overdue_num6() {
		return lately_acct_overdue_num6;
	}




	public void setLately_acct_overdue_num6(double lately_acct_overdue_num6) {
		this.lately_acct_overdue_num6 = lately_acct_overdue_num6;
	}




	public double getDay_assets_bal() {
		return day_assets_bal;
	}




	public void setDay_assets_bal(double day_assets_bal) {
		this.day_assets_bal = day_assets_bal;
	}




	public double getDay_ln_bal() {
		return day_ln_bal;
	}




	public void setDay_ln_bal(double day_ln_bal) {
		this.day_ln_bal = day_ln_bal;
	}




	public double getDay_cd_bal() {
		return day_cd_bal;
	}




	public void setDay_cd_bal(double day_cd_bal) {
		this.day_cd_bal = day_cd_bal;
	}




	public double getMon_ccd_amt() {
		return mon_ccd_amt;
	}




	public void setMon_ccd_amt(double mon_ccd_amt) {
		this.mon_ccd_amt = mon_ccd_amt;
	}




	public double getLately_buy_num12() {
		return lately_buy_num12;
	}




	public void setLately_buy_num12(double lately_buy_num12) {
		this.lately_buy_num12 = lately_buy_num12;
	}




	public int getRetl_rgstr_sign_use_lvl_times() {
		return retl_rgstr_sign_use_lvl_times;
	}




	public void setRetl_rgstr_sign_use_lvl_times(int retl_rgstr_sign_use_lvl_times) {
		this.retl_rgstr_sign_use_lvl_times = retl_rgstr_sign_use_lvl_times;
	}




	public int getCcd_rgstr_sign_use_lvl_times() {
		return ccd_rgstr_sign_use_lvl_times;
	}




	public void setCcd_rgstr_sign_use_lvl_times(int ccd_rgstr_sign_use_lvl_times) {
		this.ccd_rgstr_sign_use_lvl_times = ccd_rgstr_sign_use_lvl_times;
	}




	public int getEchl_rgstr_sign_use_lvl_times() {
		return echl_rgstr_sign_use_lvl_times;
	}




	public void setEchl_rgstr_sign_use_lvl_times(int echl_rgstr_sign_use_lvl_times) {
		this.echl_rgstr_sign_use_lvl_times = echl_rgstr_sign_use_lvl_times;
	}




	public int getVip_type() {
		return vip_type;
	}




	public void setVip_type(int vip_type) {
		this.vip_type = vip_type;
	}




	public int getVip_ind() {
		return vip_ind;
	}




	public void setVip_ind(int vip_ind) {
		this.vip_ind = vip_ind;
	}




	public String getHome_address() {
		return home_address;
	}




	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}




	public String getHome_postcode() {
		return home_postcode;
	}




	public void setHome_postcode(String home_postcode) {
		this.home_postcode = home_postcode;
	}




	public String getHome_phone() {
		return home_phone;
	}




	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}




	public String getCorp_address() {
		return corp_address;
	}




	public void setCorp_address(String corp_address) {
		this.corp_address = corp_address;
	}




	public String getCorp_postcode() {
		return corp_postcode;
	}




	public void setCorp_postcode(String corp_postcode) {
		this.corp_postcode = corp_postcode;
	}




	public String getCorp_phone() {
		return corp_phone;
	}




	public void setCorp_phone(String corp_phone) {
		this.corp_phone = corp_phone;
	}




	public String getContact_adress() {
		return contact_adress;
	}




	public void setContact_adress(String contact_adress) {
		this.contact_adress = contact_adress;
	}




	public String getContact_postcode() {
		return contact_postcode;
	}




	public void setContact_postcode(String contact_postcode) {
		this.contact_postcode = contact_postcode;
	}




	public String getContact_phone() {
		return contact_phone;
	}




	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}




	public String getMobile_phone() {
		return mobile_phone;
	}




	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCd_statement_addr() {
		return cd_statement_addr;
	}




	public void setCd_statement_addr(String cd_statement_addr) {
		this.cd_statement_addr = cd_statement_addr;
	}




	public String getCd_statement_post_code() {
		return cd_statement_post_code;
	}




	public void setCd_statement_post_code(String cd_statement_post_code) {
		this.cd_statement_post_code = cd_statement_post_code;
	}




	public String getCd_tel_num() {
		return cd_tel_num;
	}




	public void setCd_tel_num(String cd_tel_num) {
		this.cd_tel_num = cd_tel_num;
	}




	public String getCd_mobile_num() {
		return cd_mobile_num;
	}




	public void setCd_mobile_num(String cd_mobile_num) {
		this.cd_mobile_num = cd_mobile_num;
	}




	public String getCd_housing_addr() {
		return cd_housing_addr;
	}




	public void setCd_housing_addr(String cd_housing_addr) {
		this.cd_housing_addr = cd_housing_addr;
	}




	public String getCd_housing_post_code() {
		return cd_housing_post_code;
	}




	public void setCd_housing_post_code(String cd_housing_post_code) {
		this.cd_housing_post_code = cd_housing_post_code;
	}




	public String getCd_comp_address() {
		return cd_comp_address;
	}




	public void setCd_comp_address(String cd_comp_address) {
		this.cd_comp_address = cd_comp_address;
	}




	public String getCd_comp_post_code() {
		return cd_comp_post_code;
	}




	public void setCd_comp_post_code(String cd_comp_post_code) {
		this.cd_comp_post_code = cd_comp_post_code;
	}




	public String getCd_comp_tel_num() {
		return cd_comp_tel_num;
	}




	public void setCd_comp_tel_num(String cd_comp_tel_num) {
		this.cd_comp_tel_num = cd_comp_tel_num;
	}




	public String getCd_email_addr() {
		return cd_email_addr;
	}




	public void setCd_email_addr(String cd_email_addr) {
		this.cd_email_addr = cd_email_addr;
	}




	public String getCust_sort_name() {
		return cust_sort_name;
	}




	public void setCust_sort_name(String cust_sort_name) {
		this.cust_sort_name = cust_sort_name;
	}




	public String getReg_city_cd() {
		return reg_city_cd;
	}




	public void setReg_city_cd(String reg_city_cd) {
		this.reg_city_cd = reg_city_cd;
	}




	public String getLive_state_cd() {
		return live_state_cd;
	}




	public void setLive_state_cd(String live_state_cd) {
		this.live_state_cd = live_state_cd;
	}




	public String getCountry_cd() {
		return country_cd;
	}




	public void setCountry_cd(String country_cd) {
		this.country_cd = country_cd;
	}




	public String getNation_cd() {
		return nation_cd;
	}




	public void setNation_cd(String nation_cd) {
		this.nation_cd = nation_cd;
	}




	public String getEmployee_flag() {
		return employee_flag;
	}




	public void setEmployee_flag(String employee_flag) {
		this.employee_flag = employee_flag;
	}




	public String getUnit() {
		return unit;
	}




	public void setUnit(String unit) {
		this.unit = unit;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public String getDuty() {
		return duty;
	}




	public void setDuty(String duty) {
		this.duty = duty;
	}




	public String getSpeciality() {
		return speciality;
	}




	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}




	public String getSchool() {
		return school;
	}




	public void setSchool(String school) {
		this.school = school;
	}




	public String getGrad_date() {
		return grad_date;
	}




	public void setGrad_date(String grad_date) {
		this.grad_date = grad_date;
	}




	public double getYear_income() {
		return year_income;
	}




	public void setYear_income(double year_income) {
		this.year_income = year_income;
	}




	public String getBegin_bank_cust_time() {
		return begin_bank_cust_time;
	}




	public void setBegin_bank_cust_time(String begin_bank_cust_time) {
		this.begin_bank_cust_time = begin_bank_cust_time;
	}




	public String getMail_num() {
		return mail_num;
	}




	public void setMail_num(String mail_num) {
		this.mail_num = mail_num;
	}




	public String getProvince_cd() {
		return province_cd;
	}




	public void setProvince_cd(String province_cd) {
		this.province_cd = province_cd;
	}




	public String getCity_cd() {
		return city_cd;
	}




	public void setCity_cd(String city_cd) {
		this.city_cd = city_cd;
	}




	public String getAddr_bank() {
		return addr_bank;
	}




	public void setAddr_bank(String addr_bank) {
		this.addr_bank = addr_bank;
	}




	public String getAddr_memo() {
		return addr_memo;
	}




	public void setAddr_memo(String addr_memo) {
		this.addr_memo = addr_memo;
	}




	public String getTel_num() {
		return tel_num;
	}




	public void setTel_num(String tel_num) {
		this.tel_num = tel_num;
	}




	public String getFax_phone() {
		return fax_phone;
	}




	public void setFax_phone(String fax_phone) {
		this.fax_phone = fax_phone;
	}




	public String getBill_address() {
		return bill_address;
	}




	public void setBill_address(String bill_address) {
		this.bill_address = bill_address;
	}




	public String getBill_postcode() {
		return bill_postcode;
	}




	public void setBill_postcode(String bill_postcode) {
		this.bill_postcode = bill_postcode;
	}




	public String getCorp_name() {
		return corp_name;
	}




	public void setCorp_name(String corp_name) {
		this.corp_name = corp_name;
	}




	public String getEn_first_name() {
		return en_first_name;
	}




	public void setEn_first_name(String en_first_name) {
		this.en_first_name = en_first_name;
	}




	public String getEn_last_name() {
		return en_last_name;
	}




	public void setEn_last_name(String en_last_name) {
		this.en_last_name = en_last_name;
	}




	public String getIden_due_dt() {
		return iden_due_dt;
	}




	public void setIden_due_dt(String iden_due_dt) {
		this.iden_due_dt = iden_due_dt;
	}




	public String getIssue_org_country() {
		return issue_org_country;
	}




	public void setIssue_org_country(String issue_org_country) {
		this.issue_org_country = issue_org_country;
	}




	public String getTitle_cd() {
		return title_cd;
	}




	public void setTitle_cd(String title_cd) {
		this.title_cd = title_cd;
	}




	public String getCorp_property_cd() {
		return corp_property_cd;
	}




	public void setCorp_property_cd(String corp_property_cd) {
		this.corp_property_cd = corp_property_cd;
	}




	public String getMonth_income() {
		return month_income;
	}




	public void setMonth_income(String month_income) {
		this.month_income = month_income;
	}




	public String getFamily_year_income() {
		return family_year_income;
	}




	public void setFamily_year_income(String family_year_income) {
		this.family_year_income = family_year_income;
	}




	public String getOther_month_income() {
		return other_month_income;
	}




	public void setOther_month_income(String other_month_income) {
		this.other_month_income = other_month_income;
	}




	public String getChild_stat_cd() {
		return child_stat_cd;
	}




	public void setChild_stat_cd(String child_stat_cd) {
		this.child_stat_cd = child_stat_cd;
	}




	public String getSupport_num_cd() {
		return support_num_cd;
	}




	public void setSupport_num_cd(String support_num_cd) {
		this.support_num_cd = support_num_cd;
	}




	public String getDomestic_resident_ind() {
		return domestic_resident_ind;
	}




	public void setDomestic_resident_ind(String domestic_resident_ind) {
		this.domestic_resident_ind = domestic_resident_ind;
	}




	public String getMonth_income_lvl_id() {
		return month_income_lvl_id;
	}




	public void setMonth_income_lvl_id(String month_income_lvl_id) {
		this.month_income_lvl_id = month_income_lvl_id;
	}




	public String getCust_risk_prefer_cd() {
		return cust_risk_prefer_cd;
	}




	public void setCust_risk_prefer_cd(String cust_risk_prefer_cd) {
		this.cust_risk_prefer_cd = cust_risk_prefer_cd;
	}




	public String getBlacklist_flag() {
		return blacklist_flag;
	}




	public void setBlacklist_flag(String blacklist_flag) {
		this.blacklist_flag = blacklist_flag;
	}




	public String getCeb_vip_ind() {
		return ceb_vip_ind;
	}




	public void setCeb_vip_ind(String ceb_vip_ind) {
		this.ceb_vip_ind = ceb_vip_ind;
	}




	public String getAgt_sal_comp_industry_class_cd() {
		return agt_sal_comp_industry_class_cd;
	}




	public void setAgt_sal_comp_industry_class_cd(String agt_sal_comp_industry_class_cd) {
		this.agt_sal_comp_industry_class_cd = agt_sal_comp_industry_class_cd;
	}




	public String getCust_risk_valid_end_dt() {
		return cust_risk_valid_end_dt;
	}




	public void setCust_risk_valid_end_dt(String cust_risk_valid_end_dt) {
		this.cust_risk_valid_end_dt = cust_risk_valid_end_dt;
	}




	public String getCurrency_cd() {
		return currency_cd;
	}




	public void setCurrency_cd(String currency_cd) {
		this.currency_cd = currency_cd;
	}




	public String getProd_cd() {
		return prod_cd;
	}




	public void setProd_cd(String prod_cd) {
		this.prod_cd = prod_cd;
	}




	public String getInt_start_dt() {
		return int_start_dt;
	}




	public void setInt_start_dt(String int_start_dt) {
		this.int_start_dt = int_start_dt;
	}




	public String getDue_dt() {
		return due_dt;
	}




	public void setDue_dt(String due_dt) {
		this.due_dt = due_dt;
	}




	public String getClose_dt() {
		return close_dt;
	}




	public void setClose_dt(String close_dt) {
		this.close_dt = close_dt;
	}




	public String getFin_int_org_id() {
		return fin_int_org_id;
	}




	public void setFin_int_org_id(String fin_int_org_id) {
		this.fin_int_org_id = fin_int_org_id;
	}




	public String getBiz_int_org_id() {
		return biz_int_org_id;
	}




	public void setBiz_int_org_id(String biz_int_org_id) {
		this.biz_int_org_id = biz_int_org_id;
	}




	public String getSubject_num() {
		return subject_num;
	}




	public void setSubject_num(String subject_num) {
		this.subject_num = subject_num;
	}




	public String getBiz_cd() {
		return biz_cd;
	}




	public void setBiz_cd(String biz_cd) {
		this.biz_cd = biz_cd;
	}




	public String getDeposit_period() {
		return deposit_period;
	}




	public void setDeposit_period(String deposit_period) {
		this.deposit_period = deposit_period;
	}




	public String getIssue_year() {
		return issue_year;
	}




	public void setIssue_year(String issue_year) {
		this.issue_year = issue_year;
	}




	public String getNational_debt_period_num() {
		return national_debt_period_num;
	}




	public void setNational_debt_period_num(String national_debt_period_num) {
		this.national_debt_period_num = national_debt_period_num;
	}




	public String getNational_debt_term() {
		return national_debt_term;
	}




	public void setNational_debt_term(String national_debt_term) {
		this.national_debt_term = national_debt_term;
	}




	public String getDeposit_type_cd() {
		return deposit_type_cd;
	}




	public void setDeposit_type_cd(String deposit_type_cd) {
		this.deposit_type_cd = deposit_type_cd;
	}




	public String getCash_exchange_type_cd() {
		return cash_exchange_type_cd;
	}




	public void setCash_exchange_type_cd(String cash_exchange_type_cd) {
		this.cash_exchange_type_cd = cash_exchange_type_cd;
	}




	public String getAgmt_type_cd() {
		return agmt_type_cd;
	}




	public void setAgmt_type_cd(String agmt_type_cd) {
		this.agmt_type_cd = agmt_type_cd;
	}




	public String getAgmt_stat_cd() {
		return agmt_stat_cd;
	}




	public void setAgmt_stat_cd(String agmt_stat_cd) {
		this.agmt_stat_cd = agmt_stat_cd;
	}




	public String getNational_debt_type_cd() {
		return national_debt_type_cd;
	}




	public void setNational_debt_type_cd(String national_debt_type_cd) {
		this.national_debt_type_cd = national_debt_type_cd;
	}




	public String getLatest_finance_txn_dt() {
		return latest_finance_txn_dt;
	}




	public void setLatest_finance_txn_dt(String latest_finance_txn_dt) {
		this.latest_finance_txn_dt = latest_finance_txn_dt;
	}




	public double getExecute_int_rate() {
		return execute_int_rate;
	}




	public void setExecute_int_rate(double execute_int_rate) {
		this.execute_int_rate = execute_int_rate;
	}




	public double getFreeze_amt() {
		return freeze_amt;
	}




	public void setFreeze_amt(double freeze_amt) {
		this.freeze_amt = freeze_amt;
	}




	public double getAcct_bal_amt() {
		return acct_bal_amt;
	}




	public void setAcct_bal_amt(double acct_bal_amt) {
		this.acct_bal_amt = acct_bal_amt;
	}




	public double getYear_avg_bal() {
		return year_avg_bal;
	}




	public void setYear_avg_bal(double year_avg_bal) {
		this.year_avg_bal = year_avg_bal;
	}




	public double getQuarter_avg_bal() {
		return quarter_avg_bal;
	}




	public void setQuarter_avg_bal(double quarter_avg_bal) {
		this.quarter_avg_bal = quarter_avg_bal;
	}




	public double getMonth_avg_bal() {
		return month_avg_bal;
	}




	public void setMonth_avg_bal(double month_avg_bal) {
		this.month_avg_bal = month_avg_bal;
	}




	public String getProd_cd1() {
		return prod_cd1;
	}




	public void setProd_cd1(String prod_cd1) {
		this.prod_cd1 = prod_cd1;
	}




	public String getProd_cd_type() {
		return prod_cd_type;
	}




	public void setProd_cd_type(String prod_cd_type) {
		this.prod_cd_type = prod_cd_type;
	}




	public double getDay_bal() {
		return day_bal;
	}




	public void setDay_bal(double day_bal) {
		this.day_bal = day_bal;
	}




	public double getRmb_day_bal() {
		return rmb_day_bal;
	}




	public void setRmb_day_bal(double rmb_day_bal) {
		this.rmb_day_bal = rmb_day_bal;
	}




	public double getIncome_amt() {
		return income_amt;
	}




	public void setIncome_amt(double income_amt) {
		this.income_amt = income_amt;
	}




	public double getCrm_income_amt() {
		return crm_income_amt;
	}




	public void setCrm_income_amt(double crm_income_amt) {
		this.crm_income_amt = crm_income_amt;
	}




	public double getMon_base_bal() {
		return mon_base_bal;
	}




	public void setMon_base_bal(double mon_base_bal) {
		this.mon_base_bal = mon_base_bal;
	}




	public double getMon_bal_avg_m3() {
		return mon_bal_avg_m3;
	}




	public void setMon_bal_avg_m3(double mon_bal_avg_m3) {
		this.mon_bal_avg_m3 = mon_bal_avg_m3;
	}




	public double getMon_bal_avg_m6() {
		return mon_bal_avg_m6;
	}




	public void setMon_bal_avg_m6(double mon_bal_avg_m6) {
		this.mon_bal_avg_m6 = mon_bal_avg_m6;
	}




	public double getMon_bal_avg_m12() {
		return mon_bal_avg_m12;
	}




	public void setMon_bal_avg_m12(double mon_bal_avg_m12) {
		this.mon_bal_avg_m12 = mon_bal_avg_m12;
	}




	public double getBal_base_qtr() {
		return bal_base_qtr;
	}




	public void setBal_base_qtr(double bal_base_qtr) {
		this.bal_base_qtr = bal_base_qtr;
	}




	public double getBal_base_year() {
		return bal_base_year;
	}




	public void setBal_base_year(double bal_base_year) {
		this.bal_base_year = bal_base_year;
	}




	public double getMon_base_rmb_bal1() {
		return mon_base_rmb_bal1;
	}




	public void setMon_base_rmb_bal1(double mon_base_rmb_bal1) {
		this.mon_base_rmb_bal1 = mon_base_rmb_bal1;
	}




	public double getMon_base_rmb_bal2() {
		return mon_base_rmb_bal2;
	}




	public void setMon_base_rmb_bal2(double mon_base_rmb_bal2) {
		this.mon_base_rmb_bal2 = mon_base_rmb_bal2;
	}




	public double getMon3_base_rmb_bal1() {
		return mon3_base_rmb_bal1;
	}




	public void setMon3_base_rmb_bal1(double mon3_base_rmb_bal1) {
		this.mon3_base_rmb_bal1 = mon3_base_rmb_bal1;
	}




	public double getMon3_base_rmb_bal2() {
		return mon3_base_rmb_bal2;
	}




	public void setMon3_base_rmb_bal2(double mon3_base_rmb_bal2) {
		this.mon3_base_rmb_bal2 = mon3_base_rmb_bal2;
	}




	public double getMon6_base_rmb_bal1() {
		return mon6_base_rmb_bal1;
	}




	public void setMon6_base_rmb_bal1(double mon6_base_rmb_bal1) {
		this.mon6_base_rmb_bal1 = mon6_base_rmb_bal1;
	}




	public double getMon6_base_rmb_bal2() {
		return mon6_base_rmb_bal2;
	}




	public void setMon6_base_rmb_bal2(double mon6_base_rmb_bal2) {
		this.mon6_base_rmb_bal2 = mon6_base_rmb_bal2;
	}




	public double getMon12_base_rmb_bal1() {
		return mon12_base_rmb_bal1;
	}




	public void setMon12_base_rmb_bal1(double mon12_base_rmb_bal1) {
		this.mon12_base_rmb_bal1 = mon12_base_rmb_bal1;
	}




	public double getMon12_base_rmb_bal2() {
		return mon12_base_rmb_bal2;
	}




	public void setMon12_base_rmb_bal2(double mon12_base_rmb_bal2) {
		this.mon12_base_rmb_bal2 = mon12_base_rmb_bal2;
	}




	public double getQtr_base_rmb_bal1() {
		return qtr_base_rmb_bal1;
	}




	public void setQtr_base_rmb_bal1(double qtr_base_rmb_bal1) {
		this.qtr_base_rmb_bal1 = qtr_base_rmb_bal1;
	}




	public double getQtr_base_rmb_bal2() {
		return qtr_base_rmb_bal2;
	}




	public void setQtr_base_rmb_bal2(double qtr_base_rmb_bal2) {
		this.qtr_base_rmb_bal2 = qtr_base_rmb_bal2;
	}




	public double getYear_base_rmb_bal1() {
		return year_base_rmb_bal1;
	}




	public void setYear_base_rmb_bal1(double year_base_rmb_bal1) {
		this.year_base_rmb_bal1 = year_base_rmb_bal1;
	}




	public double getYear_base_rmb_bal2() {
		return year_base_rmb_bal2;
	}




	public void setYear_base_rmb_bal2(double year_base_rmb_bal2) {
		this.year_base_rmb_bal2 = year_base_rmb_bal2;
	}




	public double getMon_base_for_bal1() {
		return mon_base_for_bal1;
	}




	public void setMon_base_for_bal1(double mon_base_for_bal1) {
		this.mon_base_for_bal1 = mon_base_for_bal1;
	}




	public double getMon_base_for_bal2() {
		return mon_base_for_bal2;
	}




	public void setMon_base_for_bal2(double mon_base_for_bal2) {
		this.mon_base_for_bal2 = mon_base_for_bal2;
	}




	public double getMon3_base_for_bal1() {
		return mon3_base_for_bal1;
	}




	public void setMon3_base_for_bal1(double mon3_base_for_bal1) {
		this.mon3_base_for_bal1 = mon3_base_for_bal1;
	}




	public double getMon3_base_for_bal2() {
		return mon3_base_for_bal2;
	}




	public void setMon3_base_for_bal2(double mon3_base_for_bal2) {
		this.mon3_base_for_bal2 = mon3_base_for_bal2;
	}




	public double getMon6_base_for_bal1() {
		return mon6_base_for_bal1;
	}




	public void setMon6_base_for_bal1(double mon6_base_for_bal1) {
		this.mon6_base_for_bal1 = mon6_base_for_bal1;
	}




	public double getMon6_base_for_bal2() {
		return mon6_base_for_bal2;
	}




	public void setMon6_base_for_bal2(double mon6_base_for_bal2) {
		this.mon6_base_for_bal2 = mon6_base_for_bal2;
	}




	public double getMon12_base_for_bal1() {
		return mon12_base_for_bal1;
	}




	public void setMon12_base_for_bal1(double mon12_base_for_bal1) {
		this.mon12_base_for_bal1 = mon12_base_for_bal1;
	}




	public double getMon12_base_for_bal2() {
		return mon12_base_for_bal2;
	}




	public void setMon12_base_for_bal2(double mon12_base_for_bal2) {
		this.mon12_base_for_bal2 = mon12_base_for_bal2;
	}




	public double getQtr_base_for_bal1() {
		return qtr_base_for_bal1;
	}




	public void setQtr_base_for_bal1(double qtr_base_for_bal1) {
		this.qtr_base_for_bal1 = qtr_base_for_bal1;
	}




	public double getQtr_base_for_bal2() {
		return qtr_base_for_bal2;
	}




	public void setQtr_base_for_bal2(double qtr_base_for_bal2) {
		this.qtr_base_for_bal2 = qtr_base_for_bal2;
	}




	public double getYear_base_for_bal1() {
		return year_base_for_bal1;
	}




	public void setYear_base_for_bal1(double year_base_for_bal1) {
		this.year_base_for_bal1 = year_base_for_bal1;
	}




	public double getYear_base_for_bal2() {
		return year_base_for_bal2;
	}




	public void setYear_base_for_bal2(double year_base_for_bal2) {
		this.year_base_for_bal2 = year_base_for_bal2;
	}




	public double getMon_base_profit() {
		return mon_base_profit;
	}




	public void setMon_base_profit(double mon_base_profit) {
		this.mon_base_profit = mon_base_profit;
	}




	public double getRmb_day_profit() {
		return rmb_day_profit;
	}




	public void setRmb_day_profit(double rmb_day_profit) {
		this.rmb_day_profit = rmb_day_profit;
	}




	public double getCrm_day_profit() {
		return crm_day_profit;
	}




	public void setCrm_day_profit(double crm_day_profit) {
		this.crm_day_profit = crm_day_profit;
	}




	public String getCrm_prod_cd() {
		return crm_prod_cd;
	}




	public void setCrm_prod_cd(String crm_prod_cd) {
		this.crm_prod_cd = crm_prod_cd;
	}




	



	@Override
	public int compareTo(CisCustInfo o) {
		// TODO Auto-generated method stub
		return 0;
	}




}

