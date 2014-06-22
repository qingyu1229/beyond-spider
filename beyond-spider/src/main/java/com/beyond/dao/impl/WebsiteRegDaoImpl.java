package com.beyond.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beyond.dao.WebsiteRegDao;
import com.beyond.entity.CompanyReg;
import com.beyond.entity.WebsiteReg;
import com.beyond.factory.MybatisConnectionFactory;

public class WebsiteRegDaoImpl implements WebsiteRegDao {

	@Override
	public List<CompanyReg> getWebsiteReg(int begin, int count) {
		List<CompanyReg> list=new ArrayList<CompanyReg>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("begin", begin);
		map.put("count", count);
		list= MybatisConnectionFactory.getSession().selectList("getWebsiteReg", map);
		return list;
	}

}
