package com.beyond.test;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.beyond.dao.impl.CompanyDaoImpl;
import com.beyond.entity.Company;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class Ye56 implements PageProcessor
{
	private static  Set<Integer> set=new HashSet<Integer>();
	
	static{
		set.add(200);
	}
	
	private Site site = Site.me()
			.setDomain("56ye.net").setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36")
			.setRetryTimes(5).setSleepTime(300).setTimeOut(10000).setAcceptStatCode(set).setCycleRetryTimes(5)
			.setCharset("utf-8");
	@Override
	public Site getSite()
	{
		return site;
	}

	@Override
	public void process(Page page)
	{
		 List<String> links = page.getHtml().links().regex("^http://.*\\.56ye.net.*$").all();
	     page.addTargetRequests(links);
	     
	     String url=page.getRequest().getUrl();
	     boolean bl=url.matches("http://e.56ye.net/.*/introduce/");
	     
	     if(bl){
	    	 Company company=new Company();
	    	 System.out.println("url--"+url);
	    	 company.setWebsite(url);
	    	 String name= page.getHtml().xpath("//div[@class='px13 lh18']/table[1]/tbody/tr[1]/td[2]/text()").toString();
	    	 System.out.println("name--"+name);
	    	 company.setName(name);
	    	 String pro= page.getHtml().xpath("//div[@class='lh18 px13']/table[1]/tbody/tr[1]/td[1]/div/div[1]/text()").toString();
	    	 System.out.println("pro--"+pro);
	    	 company.setPro(pro);
	    	 String address= page.getHtml().xpath("//div[@class='px13 lh18']/table[1]/tbody/tr[2]/td[2]/text()").toString();
	    	 System.out.println("address--"+address);
	    	 company.setAddress(address);
	    	 String empcount= page.getHtml().xpath("//div[@class='px13 lh18']/table[1]/tbody/tr[2]/td[4]/text()").toString();
	    	 System.out.println("empcount--"+empcount);
	    	 String regDate= page.getHtml().xpath("//div[@class='px13 lh18']/table[1]/tbody/tr[3]/td[4]/text()").toString();
	    	 System.out.println("regDate--"+regDate);
	    	 String regMoney= page.getHtml().xpath("//div[@class='px13 lh18']/table[1]/tbody/tr[3]/td[2]/text()").toString();
	    	 System.out.println("regMoney--"+regMoney);
	    	 String main_products= page.getHtml().xpath("//div[@class='px13 lh18']/table[2]/tbody/tr[3]/td[2]/text()").toString();
	    	 System.out.println("main_products--"+main_products);
	    	 company.setMain_products(main_products);
	    	 String linkman= page.getHtml().xpath("//td[@id='side']/div[8]/ul/li[1]/text()").toString();
	    	 System.out.println("linkman--"+linkman);
	    	 company.setLinkman(linkman);
	    	 
	    	 String tel= page.getHtml().xpath("//td[@id='side']/div[8]/ul/li[2]/@title").toString();
	    	 System.out.println("tel--"+tel);
	    	 company.setTelePhone(tel);
	    	 
	    	 String fax= page.getHtml().xpath("//td[@id='side']/div[8]/ul/li[5]/@title").toString();
	    	 System.out.println("fax--"+fax);
	    	 company.setFax(fax);
	    	 
	    	 String phone= page.getHtml().xpath("//td[@id='side']/div[8]/ul/li[4]/@title").toString();
	    	 System.out.println("phone--"+phone);
	    	 company.setMobilePhone(phone);
	    	
	    	 company.setParent_web("http://www.56ye.net/");
	    	 company.setParent_web_name("物友网");
	    	 company.setStoreDate(new Date());
	    	
	    	CompanyDaoImpl cd=new CompanyDaoImpl();
	    	cd.addCompany(company);
	     }
	}

}
