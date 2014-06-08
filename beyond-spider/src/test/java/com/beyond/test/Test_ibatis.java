package com.beyond.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.beyond.factory.MybatisConnectionFactory;

public class Test_ibatis {
	
/*	@Test
	public void t1(){
		SqlSessionFactory sessionFactory= MybatisConnectionFactory.getSqlSessionFactory();
		
		SqlSession session= sessionFactory.openSession();
		
		List<Company> list= session.selectList("selectCompany",1);
		
		System.out.println(list.get(0).getName());
		session.close();
	}*/
}
