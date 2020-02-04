package com.slk.task12.Multitheading;

public class M2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task 2 ");
		
		
		int i=0;
		for (i = 0; i < 10; i++) 
		{
			System.out.println(i*2);
		}
		
		
	}


}
