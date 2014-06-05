package com.beyond.utils;

import java.lang.reflect.Field;

import us.codecraft.webmagic.selector.Html;

import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;

public class HtmlUtls {

	public static Company parserDataFromHTML(Html html, CompanyReg cr) {
		Company company = new Company();
		Field[] fields = cr.getClass().getDeclaredFields();
		for (Field field : fields) {
			String field_name = field.getName();
			try {
				
				 String reg= String.valueOf(getProperty(cr,field_name)) ;
				 if(reg!=null){
					 String value=String.valueOf(html.xpath(reg)) ;
					 Field f= company.getClass().getField(field_name);
					 f.set(company, value);
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return company;
	}

	private static Object getProperty(Object owner, String fieldName) throws Exception {
		Field field = owner.getClass().getField(fieldName);
		Object property = field.get(owner);
		return property;
	}

	
/*	public boolean setProperty(Object owner,String fieldName,String value) throws IllegalArgumentException, IllegalAccessException, SecurityException, NoSuchFieldException{
		 Field f= owner.getClass().getField(fieldName);
		 f.set(owner, value);
		return true;
	}*/
}
