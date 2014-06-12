package com.beyond.test;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.beyond.dao.impl.CompanyDaoImpl;
import com.beyond.entity.Company;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class HY88 implements PageProcessor
{
	private static  Set<Integer> set=new HashSet<Integer>();
	
	static{
		set.add(200);
	}
	
	private Site site = Site.me()
			.setDomain("huangye88.com").setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36")
			.setRetryTimes(5).setSleepTime(1000).setTimeOut(10000).setAcceptStatCode(set).setCycleRetryTimes(5)
			.setCharset("utf-8");
	@Override
	public Site getSite()
	{
		return site;
	}

	@Override
	public void process(Page page)
	{
		 List<String> links = page.getHtml().links().regex("^http://.*\\.huangye88.com.*$").all();
	     page.addTargetRequests(links);
	     
	     //boolean bl= page.getHtml().links().regex("http://.*\\.b2b.huangye88.com/").match();
	     
	     //boolean bl =page.getRequest().getUrl().contains("b2b.huangye88.com");
	     String url=page.getRequest().getUrl();
	     boolean bl=url.matches("http://.*\\.b2b.huangye88.com/");
	     
	     if(bl){
	    	 
	    	 Company company=new Company();
	    	 
	    	
	    	 System.out.println(url);
	    	 String name= page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[1]/td/a[1]/text()").toString();
	    	 System.out.println("name--"+name);
	    	 company.setName(name);
	    	 
	    	 String jianjie= page.getHtml().xpath("//div[@class='introduct']/p/text()").toString();
	    	 System.out.println("jianjie--"+jianjie);
	    	 company.setPro(jianjie);
	    	 
	    	 String linkman=page.getHtml().xpath("//table[@class='tablelist'][2]/tbody/tr[1]/td/a[1]/span/text()").toString();
	    	 System.out.println("linkman--"+linkman);
	    	 company.setLinkman(linkman);
	    	 
	    	 String address=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[2]/td/text()").toString();
	    	 System.out.println("address--"+address);
	    	 company.setAddress(address);
	    	 
	    	 String tel=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[3]/td/text()").toString();
	    	 System.out.println("tel--"+tel);
	    	 company.setTelePhone(tel);
	    	 
	    	 String zhuying=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[5]/td/strong//a/text()").toString();
	    	 System.out.println("zhuying--"+zhuying);
	    	 company.setMain_products(zhuying);
	    	 
	    	 String phone=page.getHtml().xpath("//table[@class='tablelist'][2]/tbody/tr[3]/td/span/text()").toString();
	    	 System.out.println("phone--"+phone);
	    	 
	    	 String province=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[2]/td/a[1]/text()").toString();
	    	 System.out.println("province--"+province);
	    	 
	    	 String city=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[2]/td/a[2]/text()").toString();
	    	 System.out.println("city--"+city);
	    	 
	    	 company.setMobilePhone(phone);
	    	 company.setWebsite(url);
	    	 company.setParent_web("http://www.huangye88.com/");
	    	 company.setParent_web_name("黄页88");
	    	 company.setProvince(province);
	    	 company.setCity(city);
	    	 company.setStoreDate(new Date());
	    	 
	    	 Pattern pattern = Pattern.compile("(?<=http://).*(?=.b2b.huangye88.com/)");
	         Matcher matcher = pattern.matcher(url);
	    	 
	         if(matcher.find()){
	        	 company.setWebsite_outerid(matcher.group());
	        	 System.out.println(matcher.group());
	         }
	    	 
	    	CompanyDaoImpl cd=new CompanyDaoImpl();
	    	cd.addCompany(company);
	     }
	}

}
