package com.beyond.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import us.codecraft.webmagic.selector.Html;

import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;

public class ParserDateFromHtml implements MyParser {

	@Override
	public Company parser(Html html, CompanyReg cr) {
		Company company=new Company();
		
		String name= html.xpath(cr.getReg_name()).toString();
		company.setName(name);
		
		if(cr.getReg_address()!=null){
			String address=html.xpath(cr.getReg_address()).toString();
			company.setAddress(address);
		}
		if(cr.getReg_city()!=null){
			String city=html.xpath(cr.getReg_city()).toString();
			company.setCity(city);
		}
		if(cr.getReg_empCount()!=null){
			String empCount=html.xpath(cr.getReg_empCount()).toString();
			company.setEmpCount(getNum(empCount));
		}
		
		if(cr.getReg_fax()!=null){
			String fax=html.xpath(cr.getReg_fax()).toString();
			company.setFax(fax);
		}
		if(cr.getReg_industry()!=null){
			String industry=html.xpath(cr.getReg_industry()).toString();
			company.setIndustry(industry);
		}
		if(cr.getReg_legalPersion()!=null){
			String legalPerson=html.xpath(cr.getReg_legalPersion()).toString();
			company.setLegalPerson(legalPerson);
		}
		if(cr.getReg_linkman()!=null){
			String linkman=html.xpath(cr.getReg_linkman()).toString();
			company.setLinkman(linkman);
		}
		if(cr.getReg_main_products()!=null){
			String main_products=html.xpath(cr.getReg_main_products()).toString();
			company.setMain_products(main_products);
		}
		if(cr.getReg_mobilePhone()!=null){
			String mobilePhone=html.xpath(cr.getReg_mobilePhone()).toString();
			company.setMobilePhone(mobilePhone);
		}
		if(cr.getReg_pro()!=null){
			String pro=html.xpath(cr.getReg_pro()).toString();
			company.setPro(pro);
		}
		if(cr.getReg_provice()!=null){
			String province=html.xpath(cr.getReg_provice()).toString();
			company.setProvince(province);
		}
		if(cr.getReg_regDate()!=null){
			String regDate=html.xpath(cr.getReg_regDate()).toString();
			
			
			//company.setRegDate(getNum(regDate));
		}
		if(cr.getReg_regMoney()!=null){
			String regMoney=html.xpath(cr.getReg_regMoney()).toString();
			company.setRegMoney(getNum(regMoney));
		}
		if(cr.getReg_telePhone()!=null){
			String telePhone=html.xpath(cr.getReg_telePhone()).toString();
			company.setTelePhone(telePhone);
		}
		if(cr.getReg_town()!=null){
			String town=html.xpath(cr.getReg_town()).toString();
			company.setTown(town);
		}
		if(cr.getReg_turnover()!=null){
			String turnover=html.xpath(cr.getReg_turnover()).toString();
			company.setTurnover(getNum(turnover));
		}
		return company;
	}
	
	private int getNum(String str){
		int num=0;
		Pattern p = Pattern.compile("[^0-9]");
		Matcher m = p.matcher(str);
		String result = m.replaceAll("|");
		System.out.println(result);
		String[] ss= StringUtils.split(result,"|");
		for(int i=0;i<ss.length;i++){
			int n=0;
			try {
				n = Integer.valueOf(ss[i]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			if(n>num){
				num=n;
			}
		}
		return num;
	}

}
