package com.beyond.pageprocesser;

import java.util.List;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;
import com.beyond.factory.ServiceFactory;
import com.beyond.utils.HtmlUtls;

public class CpProcesser implements PageProcessor
{
	private Site site;
	private CompanyReg cr;
	private String fetch_url_reg;
	private String parser_url_reg;
	
	public CpProcesser(Site site, CompanyReg cr)
	{
		this.site = site;
		this.cr = cr;
	}

	@Override
	public Site getSite()
	{
		return site;
	}

	@Override
	public void process(Page page)
	{
		List<String> links = page.getHtml().links().regex(fetch_url_reg).all();
		page.addTargetRequests(links);
		
		/**
		 * 对于网址符合特定规则的网页进行信息抽取
		 */
		boolean bl =page.getRequest().getUrl().matches(parser_url_reg);
		if(bl){
			//page.getHtml().xpath(cr.getReg_name());
			Company c= HtmlUtls.parserDataFromHTML(page.getHtml(), cr);
			ServiceFactory.getCompanyService().addCompany(c);
		}
	/*	page.putField("title", page.getHtml().xpath("//div[@class='BlogEntity']/div[@class='BlogTitle']/h1/text()").toString());
		page.putField("content", page.getHtml().xpath("//div[@class='BlogContent']/text()"));
		page.putField("tags", page.getHtml().xpath("//div[@class='BlogTags']/a/text()").all());*/
	}

}
