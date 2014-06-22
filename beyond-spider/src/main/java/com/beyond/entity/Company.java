package com.beyond.entity;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * 2014/5/26
 * @author liangqingyu
 *
 */
public class Company {
	/**
	 * 公司id
	 */
	private int id;
	/**
	 * 公司名称
	 */
	private String name;
	/**
	 * 行业
	 */
	private String industry;
	/**
	 * 公司所属省份
	 */
	private String province;
	/**
	 * 公司所属城市
	 */
	private String city;
	/**
	 * 公司所属乡镇
	 */
	private String town;
	/**
	 * 公司联系人
	 */
	private String linkman;
	/**
	 * 公司法人代表
	 */
	private String legalPerson;
	/**
	 * 主营产品
	 */
	private String main_products;
	/**
	 * 注册时间
	 */
	private Date regDate;
	/**
	 * 注册资金
	 */
	private int regMoney;
	/**
	 * 联系手机
	 */
	private String mobilePhone;
	/**
	 * 联系电话
	 */
	private String telePhone;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 传真
	 */
	private String fax;
	/**
	 * 网址
	 */
	private String website;
	/**
	 * 简介
	 */
	private String pro;
	/**
	 * 此条记录保存时间
	 */
	private Date storeDate;
	/**
	 * 员工人数
	 */
	private int empCount;
	/**
	 * 营业额（每年）
	 */
	private int turnover;
	/**
	 * 网址在黄页上的唯一标识
	 */
	private String website_outerid;
	/**
	 * 所属黄页
	 */
	private String parent_web;
	
	private String parent_web_name;
	
	private int reg_id;
	
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	
	
	public String getLegalPerson() {
		return legalPerson;
	}
	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}
	public String getMain_products() {
		return main_products;
	}
	public void setMain_products(String main_products) {
		this.main_products = main_products;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getRegMoney() {
		return regMoney;
	}
	public void setRegMoney(int regMoney) {
		this.regMoney = regMoney;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getTelePhone() {
		return telePhone;
	}
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public Date getStoreDate() {
		return storeDate;
	}
	public void setStoreDate(Date storeDate) {
		this.storeDate = storeDate;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	
	public String getWebsite_outerid() {
		return website_outerid;
	}
	public void setWebsite_outerid(String website_outerid) {
		this.website_outerid = website_outerid;
	}
	public String getParent_web() {
		return parent_web;
	}
	public void setParent_web(String parent_web) {
		this.parent_web = parent_web;
	}
	public String getParent_web_name() {
		return parent_web_name;
	}
	public void setParent_web_name(String parent_web_name) {
		this.parent_web_name = parent_web_name;
	}
	
	public boolean isValidate(){
		if(!StringUtils.isBlank(name)&&!StringUtils.isBlank(linkman)){
			return true;
		}
		return false;
	}

	public Company consummateSelf(Company cp){
		if(this.city==null&&cp.getCity()!=null){
			this.city=cp.getCity();
		}
		if(this.address==null&&cp.getAddress()!=null){
			this.address=cp.getAddress();
		}
		if(this.empCount==0&&cp.getEmpCount()!=0){
			this.empCount=cp.getEmpCount();
		}
		if(this.fax==null&&cp.getFax()!=null){
			this.fax=cp.getFax();
		}
		if(this.industry==null&&cp.getIndustry()!=null){
			this.industry=cp.getIndustry();
		}
		if(this.legalPerson==null&&cp.getLegalPerson()!=null){
			this.legalPerson=cp.getLegalPerson();
		}
		if(this.main_products==null&&cp.getMain_products()!=null){
			this.main_products=cp.getMain_products();
		}
		if(this.mobilePhone==null&&cp.getMobilePhone()!=null){
			this.mobilePhone=cp.getMobilePhone();
		}
		if(this.pro==null&&cp.getPro()!=null){
			this.pro=cp.getPro();
		}
		if(this.province==null&&cp.getProvince()!=null){
			this.province=cp.getPro();
		}
		if(this.regDate==null&&cp.getRegDate()!=null){
			this.regDate=cp.getRegDate();
		}
		if(this.regMoney==0&&cp.getRegMoney()!=0){
			this.regMoney=cp.getRegMoney();
		}
		if(this.telePhone==null&&cp.getTelePhone()!=null){
			this.telePhone=cp.getTelePhone();
		}
		if(this.town==null&&cp.getTown()!=null){
			this.town=cp.getTown();
		}
		if(this.turnover==0&&cp.getTurnover()!=0){
			this.turnover=cp.getTurnover();
		}
		return this;
	}

	
}
