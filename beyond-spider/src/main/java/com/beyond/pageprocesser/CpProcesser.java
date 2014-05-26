package com.beyond.pageprocesser;

import java.util.List;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import com.beyond.entity.CompanyReg;

public class CpProcesser implements PageProcessor {
	
	private Site site ;
	private CompanyReg cr;
	
	public CpProcesser(Site site,CompanyReg cr){
		this.site=site;
		this.cr=cr;
	}
	
	@Override
	public Site getSite() {
		return site;
	}

	@Override
	public void process(Page page) {
		 List<String> links = page.getHtml().links().regex("http://my\\.oschina\\.net/flashsword/blog/\\d+").all();
	        page.addTargetRequests(links);
	        page.putField("title", page.getHtml().xpath("//div[@class='BlogEntity']/div[@class='BlogTitle']/h1/text()").toString());
	        page.putField("content", page.getHtml().xpath("//div[@class='BlogContent']/text()"));
	        page.putField("tags",page.getHtml().xpath("//div[@class='BlogTags']/a/text()").all());

	}

}
