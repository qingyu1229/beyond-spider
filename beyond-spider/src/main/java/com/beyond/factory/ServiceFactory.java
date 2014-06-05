package com.beyond.factory;

import com.beyond.service.CompanyServiceDao;
import com.beyond.service.impl.CompanyServiceDaoImpl;

public class ServiceFactory {
	private static CompanyServiceDao companyServiceDao;
	
	public static CompanyServiceDao getCompanyService(){
		if(companyServiceDao==null){
			companyServiceDao=new CompanyServiceDaoImpl();
		}
		return companyServiceDao;
	}
}
