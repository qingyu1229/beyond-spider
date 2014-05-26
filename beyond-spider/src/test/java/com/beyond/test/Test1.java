package com.beyond.test;

import org.junit.Test;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

public class Test1 {
	
	@Test
	public void test(){
		  Spider.create(new OschinaBlogPageProcesser()).addUrl("http://www.ic72.com/").thread(3)
          .addPipeline(new ConsolePipeline()).run();
	}
}
