package com.beyond.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class HY88 implements PageProcessor
{

	private static  Set<Integer> set=new HashSet<Integer>();
	
	static {
		set.add(200);
		set.add(403);
    }
	private Site site = Site.me()
			.setDomain("huangye88.com").setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36")
			.setRetryTimes(5).setSleepTime(100).setTimeOut(10000).setAcceptStatCode(set).setCycleRetryTimes(5)
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
	     
	     //boolean bl= page.getHtml().links().regex("^http://.*\\.b2b.huangye88.com.*$").match();
	     
	     boolean bl =page.getRequest().getUrl().contains("b2b.huangye88.com");
	     
	     if(bl){
	    	 System.out.println("-----------------url---"+page.getRequest().getUrl());
	    	 String name= page.getHtml().xpath("//div[@class='introduce']/h3/text()").toString();
	    	 System.out.println("name--"+name);
	    	 String jianjie= page.getHtml().xpath("//div[@class='introduct']/p/text()").toString();
	    	 System.out.println("jianjie--"+jianjie);
	    	 String linkman=page.getHtml().xpath("//table[@class='tablelist'][2]/tbody/tr[1]/td/text()").toString();
	    	 System.out.println("linkman--"+linkman);
	    	 String address=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[2]/td/text()").toString();
	    	 System.out.println("address--"+address);
	    	 String tel=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[3]/td/text()").toString();
	    	 System.out.println("tel--"+tel);
	    	 String zhuying=page.getHtml().xpath("//table[@class='tablelist'][1]/tbody/tr[4]/td/text()").toString();
	    	 System.out.println("zhuying--"+zhuying);
	    	 String phone=page.getHtml().xpath("//table[@class='tablelist'][2]/tbody/tr[2]/td/text()").toString();
	    	 System.out.println("phone--"+phone);
	    	 String qq=page.getHtml().xpath("//table[@class='tablelist'][2]/tbody/tr[3]/td/text()").toString();
	    	 System.out.println("qq--"+qq);
	    	 
	    	/* page.putField("title", page.getHtml().xpath("//div[@class='BlogEntity']/div[@class='BlogTitle']/h1/text()").toString());
		     page.putField("content", page.getHtml().xpath("//div[@class='BlogContent']/text()"));
		     page.putField("tags",page.getHtml().xpath("//div[@class='BlogTags']/a/text()").all());*/
	     }
	}

}
