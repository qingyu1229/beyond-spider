package com.beyond.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
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
	@Test
	public void test2(){
		String a="love23next234csdn3423javaeye";
		
		int num=0;
		List<Integer> digitList = new ArrayList<Integer>();
		Pattern p = Pattern.compile("[^0-9]");
		Matcher m = p.matcher(a);
		String result = m.replaceAll("|");
		System.out.println(result);
		String[] s= StringUtils.split(result,"|");
		for(int i=0;i<s.length;i++){
			int n=0;
			try {
				n = Integer.valueOf(s[i]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			if(n>num){
				num=n;
			}
		}
		System.out.println(num);
	}
	
	@Test
	public void Test3(){
		
		List<String> list=new ArrayList<String>();
		list.add("jianren");
		list.add("dhfksdhkf");
		list.add("qqqqq");
		list.add("qqqqq");
		System.out.println(list);
	}
}
