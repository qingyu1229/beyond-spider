package com.beyond.test;

import org.junit.Test;

import com.beyond.entity.enums.ProviceEnum;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

public class Test2 {
	
	@Test
	public void test(){
		System.out.println(ProviceEnum.HUBEI.getValue());
	}
}
