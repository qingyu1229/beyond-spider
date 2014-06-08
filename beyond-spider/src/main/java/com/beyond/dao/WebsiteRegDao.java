package com.beyond.dao;

import java.util.List;

import com.beyond.entity.WebsiteReg;

public interface WebsiteRegDao {

	/**
	 * 获取需要抓取的网址
	 * @param begin
	 * @param count
	 * @return
	 */
	public List<WebsiteReg> getWebsiteReg(int begin,int count);
}
