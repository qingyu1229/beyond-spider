package com.beyond.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.beyond.dao.CompanyDao;
import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.WebsiteReg;
import com.beyond.factory.MybatisConnectionFactory;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public boolean addCompany(Company company) {
		SqlSession session= MybatisConnectionFactory.getSession();
		int c= session.insert("addCompany", company);
		session.commit();
		session.close();
		return c>0;
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

	@Override
	public boolean saveOrUpdateCompany(Company company) {
		SqlSession session= MybatisConnectionFactory.getSession();
		Company cp= session.selectOne("hasCompany", company);
		if(cp!=null){
			updateCompany( cp.consummateSelf(company));
		}else{
			addCompany(company);
		}
		session.commit();
		session.close();
		return false;
	}

}
