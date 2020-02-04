package com.slk.task12.Multitheading;

public class M1 extends Thread 
{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task 1 ");
		
		int i=0;
		for (i = 0; i < 5; i++) 
		{
			System.out.println(i);
		}
		
		
	}

}
