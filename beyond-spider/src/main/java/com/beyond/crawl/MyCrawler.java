package com.beyond.crawl;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

import com.beyond.entity.CompanyReg;
import com.beyond.pageprocesser.CpProcesser;

public class MyCrawler {
	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		
		
		
		
		Site site = Site.me()
				.setDomain("56ye.net").setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36")
				.setRetryTimes(5).setSleepTime(300).setTimeOut(10000).setCycleRetryTimes(5)
				.setCharset("utf-8");
		CompanyReg cr=new CompanyReg();
		
		CpProcesser cp=new CpProcesser(site,cr,"","");
		
		
		Spider.create(cp).addUrl("http://qiye.56ye.net/").thread(10)
        .addPipeline(new ConsolePipeline()).run();
		long time2=System.currentTimeMillis();
		long s=(time2-time1)/1000;
		long min=s/60;
		System.out.println("耗时："+min+"分钟");
	}
}
