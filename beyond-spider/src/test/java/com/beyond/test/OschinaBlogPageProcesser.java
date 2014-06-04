package com.beyond.test;
import java.util.List;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
public class OschinaBlogPageProcesser implements PageProcessor{
	private Site site = Site.me()
			.setDomain("my.oschina.net")
			.setRetryTimes(3).setSleepTime(100).setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36")
			.setCharset("utf-8");
	@Override
	public void process(Page page) {
		
		
		
		 List<String> links = page.getHtml().links().regex("http://my\\.oschina\\.net/flashsword/blog/\\d+").all();
		 
		 
	        page.addTargetRequests(links);
	        page.putField("title", page.getHtml().xpath("//div[@class='BlogEntity']/div[@class='BlogTitle']/h1/text()").toString());
	        page.putField("content", page.getHtml().xpath("//div[@class='BlogContent']/text()"));
	        page.putField("tags",page.getHtml().xpath("//div[@class='BlogTags']/a/text()").all());
	}

	@Override
	public Site getSite() {
		return site;
	}
	
	public static void main(String[] args) {
		   Spider.create(new OschinaBlogPageProcesser()).addUrl("http://my.oschina.net/flashsword/blog").thread(3)
           .addPipeline(new ConsolePipeline()).run();
	}
	
}
