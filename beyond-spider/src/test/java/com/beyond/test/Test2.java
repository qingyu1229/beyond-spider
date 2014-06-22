package com.beyond.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.beyond.dao.impl.CompanyDaoImpl;
import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.WebsiteReg;
import com.beyond.service.WebsiteRegServiceDao;
import com.beyond.service.impl.WebsiteRegServiceDaoImpl;

public class Test2 {
	Logger logger=Logger.getLogger(Test2.class);
	
	@Test
	public void test(){
		CompanyDaoImpl cd=new CompanyDaoImpl();
		Company company=new Company();
		company.setName("name");
		company.setAddress("address");
		company.setCity("sz");
		company.setLinkman("linkmane");
		company.setTelePhone("11111");
		boolean bl= cd.addCompany(company);
		System.out.println(bl);
	}
	
	@Test
	public void test2(){
		WebsiteRegServiceDao wrd=new WebsiteRegServiceDaoImpl();
		List<CompanyReg> list=wrd.getWebsiteReg(0, 5);
		for(int i=0;i<list.size();i++){
			CompanyReg wr=list.get(i);
			String s= wr.toString();
			System.out.println(s);
		}
		
	}
}
