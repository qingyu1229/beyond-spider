package com.beyond.quartz;

import org.apache.ibatis.session.SqlSession;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.beyond.factory.MybatisConnectionFactory;

public class QuartzJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("启动成功！！！！执行中----------------------");
		
	    SqlSession session=	MybatisConnectionFactory.getSqlSessionFactory().openSession();
		
		session.selectList("", "");
		
	}

}
