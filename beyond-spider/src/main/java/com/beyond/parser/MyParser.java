package com.beyond.parser;

import us.codecraft.webmagic.selector.Html;

import com.beyond.entity.Company;
import com.beyond.entity.CompanyReg;

public interface MyParser {

	public Company parser(Html html, CompanyReg cr);
}
