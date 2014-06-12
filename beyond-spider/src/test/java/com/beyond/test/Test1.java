package com.beyond.test;

import org.junit.Test;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

public class Test1 {
	
	@Test
	public void test(){
		long time1=System.currentTimeMillis();
		Spider.create(new Ye56()).addUrl("http://qiye.56ye.net/").thread(10)
        .addPipeline(new ConsolePipeline()).run();
		long time2=System.currentTimeMillis();
		long s=(time2-time1)/1000;
		long min=s/60;
		System.out.println("耗时："+min+"分钟");
	}
}
