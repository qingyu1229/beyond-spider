package com.beyond.test;

import java.util.Date;

import com.beyond.queue.SeedUrlQueue;

public class Test_Queue_Thread1 extends Thread
{

	private SeedUrlQueue suq;
	public Test_Queue_Thread1(SeedUrlQueue suq){
		this.suq=suq;
	}
	
	
	@Override
	public void run()
	{
		
		for(int i=0;i<2000;i++){
			Date date=new Date();
			suq.add(date);
			System.out.println("----------------入队列--"+date);
			System.out.println("队列大小---"+suq.size());
			
			System.out.println("================================================================");
			try
			{
				sleep(50);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
