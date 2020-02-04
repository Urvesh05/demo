package com.slk.task12.Multitheading;

public class MultiThreading1 implements Runnable 
{

	private Thread t;
	private String threadName;
	
	
	//create Constructor
	public MultiThreading1(String name) 
	{
		threadName=name;
		System.out.println("create thread "+ threadName);
		
	}
	
	
	public void run()
	{
		System.out.println("thread run "+threadName);
		
		try {
			
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread "+threadName+", "+i);
				Thread.sleep(100);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		System.out.println("thread exits");
		
	}
	
	private void start() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("starting Thread"+threadName);
		if(t==null)
		{
			t= new Thread(this,threadName);
			t.start();
		}

	}
	
	
	public static void main(String[] args) 
	{
		MultiThreading1 m1 = new MultiThreading1("thread ====> 1 ");
		
		m1.start();
		
		MultiThreading1 m2= new MultiThreading1("thread =====> 2");
		m2.start();
	
	
	
	}
}
	




