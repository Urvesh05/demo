package com.slk.task14.Concurrency;

public class ThreadCreate_Start extends Thread

{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread Create Thread Class \n");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadCreate_Start t = new ThreadCreate_Start();
		t.start();
		
		
		
		Runnable r = new Runnable() 
		{
			
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Thread Create Runnable Interface");
			}
		};
		Thread t2 = new Thread (r);
		t2.start();
	}

}

