package com.beyond.service;

import java.util.List;

import com.beyond.entity.CompanyReg;

public interface WebsiteRegServiceDao {

	/**
	 * 获取需要抓取的网址
	 * @param begin
	 * @param count
	 * @return
	 */
	public List<CompanyReg> getWebsiteReg(int begin,int count);
}
