package com.beyond.test;

import java.util.Date;

import com.beyond.queue.SeedUrlQueue;

public class Test_Queue_Thread2 extends Thread
{

	private SeedUrlQueue suq;
	public Test_Queue_Thread2(SeedUrlQueue suq){
		this.suq=suq;
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<2000;i++){
			try
			{
				sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date date= (Date) suq.poll();
			System.out.println("出队列---"+date);
			System.out.println("队列大小---"+suq.size());
			System.out.println("================================================================");
		}
	
	
	}
	
}
