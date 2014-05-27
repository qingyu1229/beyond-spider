package com.beyond.entity;

/**
 * 2014/5/27
 * @author liangqingyu
 *
 */
public class CrawlReg {

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
