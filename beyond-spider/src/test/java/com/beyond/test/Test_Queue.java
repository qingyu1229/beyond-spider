package com.beyond.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.beyond.queue.SeedUrlQueue;

public class Test_Queue
{

	static SeedUrlQueue suq;
	@Test
	public void test()
	{
		suq=new SeedUrlQueue(1000);
		
		Test_Queue_Thread1 t1=new Test_Queue_Thread1(suq);
		Test_Queue_Thread2 t2=new Test_Queue_Thread2(suq);
		
		t1.start();
		t2.start();
	}

}
