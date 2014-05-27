package com.beyond.service;

import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.CrawlReg;

public interface CompanyServiceDao {

	/**
	 * 向数据库插入一条记录
	 * @param company
	 * @return 是否插入成功
	 */
	public boolean addCompany(Company company);
	
	/**
	 * 查询数据库中是否已经存在此条记录
	 * @param domain  主域名
	 * @return ID
	 */
	public Long getIdByDomainAndParentWeb(String domain,String website_outerid);
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	public boolean updateCompany(Company company);
	
	/**
	 * 获取匹配规则
	 * @param reg_id
	 * @return
	 */
	public CompanyReg getCompanyReg(int reg_id);
	
	/**
	 * 插入匹配规则
	 * @param companyReg
	 * @return
	 */
	public int insertCompanyReg(CompanyReg companyReg);
	
	/**
	 * 修改匹配规则
	 * @param companyReg
	 * @return
	 */
	public boolean updateCompanyReg(CompanyReg companyReg);
	
	/**
	 * 获取抓取匹配规则
	 * @return
	 */
	public CrawlReg getCrawlReg(int crawlreg_id);
	
	/**
	 * 插入抓取匹配规则
	 * @param crawlReg
	 * @return
	 */
	public int insertCrawlReg(CrawlReg crawlReg);
	
}
