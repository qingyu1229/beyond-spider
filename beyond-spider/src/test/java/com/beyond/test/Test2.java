package com.beyond.test;

import org.junit.Test;

import com.beyond.dao.impl.CompanyDaoImpl;
import com.beyond.entity.Company;

public class Test2 {
	
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
}
