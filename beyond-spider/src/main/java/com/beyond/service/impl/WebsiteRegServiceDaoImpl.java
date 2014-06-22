package com.beyond.service.impl;

import java.util.List;

import com.beyond.dao.WebsiteRegDao;
import com.beyond.dao.impl.WebsiteRegDaoImpl;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.WebsiteReg;
import com.beyond.service.WebsiteRegServiceDao;

public class WebsiteRegServiceDaoImpl implements WebsiteRegServiceDao {

	private WebsiteRegDao websiteRegDao=new WebsiteRegDaoImpl();
	
	@Override
	public List<CompanyReg> getWebsiteReg(int begin, int count) {
		return websiteRegDao.getWebsiteReg(begin, count);
	}

}
