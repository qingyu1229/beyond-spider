package com.beyond.entity;

/**
 * 2014/5/27
 * @author liangqingyu
 *
 */
public class WebsiteReg {

	/**
	 * 网站主域名
	 */
	private String reg_domain;
	/**
	 * 需要被抓取的网址的规则
	 */
	private String reg_fetchurl;
	/**
	 * 网址评分
	 */
	private Long rate;
	/**
	 * 对应的内容抓取规则ID
	 */
	private int reg_id;
	
	/**
	 * 入口网址
	 */
	private String seed_url;
	
	public String getSeed_url() {
		return seed_url;
	}
	public void setSeed_url(String seed_url) {
		this.seed_url = seed_url;
	}
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_domain() {
		return reg_domain;
	}
	public void setReg_domain(String reg_domain) {
		this.reg_domain = reg_domain;
	}
	public String getReg_fetchurl() {
		return reg_fetchurl;
	}
	public void setReg_fetchurl(String reg_fetchurl) {
		this.reg_fetchurl = reg_fetchurl;
	}
	public Long getRate() {
		return rate;
	}
	public void setRate(Long rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "CrawlReg [reg_domain=" + reg_domain + ", reg_fetchurl="
				+ reg_fetchurl + ", rate=" + rate + "]";
	}
}
