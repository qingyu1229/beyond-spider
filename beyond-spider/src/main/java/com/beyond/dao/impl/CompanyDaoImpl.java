package com.beyond.dao.impl;

import com.beyond.dao.CompanyDao;
import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.WebsiteReg;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public boolean addCompany(Company company) {
		
		
		
		
		return false;
	}

	@Override
	public Long getIdByDomainAndParentWeb(String domain, String website_outerid) {
		return null;
	}

	@Override
	public boolean updateCompany(Company company) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CompanyReg getCompanyReg(int reg_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCompanyReg(CompanyReg companyReg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateCompanyReg(CompanyReg companyReg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WebsiteReg getCrawlReg(int crawlreg_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCrawlReg(WebsiteReg crawlReg) {
		// TODO Auto-generated method stub
		return 0;
	}

}
