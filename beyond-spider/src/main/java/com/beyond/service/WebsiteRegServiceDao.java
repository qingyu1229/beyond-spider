package com.beyond.service;

import java.util.List;

import com.beyond.entity.WebsiteReg;

public interface WebsiteRegServiceDao {

	/**
	 * 获取需要抓取的网址
	 * @param begin
	 * @param count
	 * @return
	 */
	public List<WebsiteReg> getWebsiteReg(int begin,int count);
}
