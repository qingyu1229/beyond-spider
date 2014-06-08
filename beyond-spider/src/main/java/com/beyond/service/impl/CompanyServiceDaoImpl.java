package com.beyond.service.impl;

import com.beyond.dao.CompanyDao;
import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.WebsiteReg;
import com.beyond.service.CompanyServiceDao;

public class CompanyServiceDaoImpl implements CompanyServiceDao {

	private CompanyDao companyDao;
	
	@Override
	public boolean addCompany(Company company) {
		return companyDao.addCompany(company);
	}

	@Override
	public Long getIdByDomainAndParentWeb(String domain, String website_outerid) {
		return companyDao.getIdByDomainAndParentWeb(domain, website_outerid);
	}

	@Override
	public boolean updateCompany(Company company) {
		return companyDao.updateCompany(company);
	}

	@Override
	public CompanyReg getCompanyReg(int reg_id) {
		return companyDao.getCompanyReg(reg_id);
	}

	@Override
	public int insertCompanyReg(CompanyReg companyReg) {
		return companyDao.insertCompanyReg(companyReg);
	}

	@Override
	public boolean updateCompanyReg(CompanyReg companyReg) {
		return companyDao.updateCompanyReg(companyReg);
	}

	@Override
	public WebsiteReg getCrawlReg(int crawlreg_id) {
		return companyDao.getCrawlReg(crawlreg_id);
	}

	@Override
	public int insertCrawlReg(WebsiteReg crawlReg) {
		return companyDao.insertCrawlReg(crawlReg);
	}

}
