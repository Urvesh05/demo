package com.slk.task12.Multitheading;

public class SingleTaskRunnable4 implements Runnable{
	
	public void run() //single task (Sharable )
	{
		// TODO Auto-generated method stub
		System.out.println("this is Single task by Runnable Interface ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTaskRunnable4 s= new SingleTaskRunnable4();//One Object To Multiple Task 
		//SingleTaskRunnable4 s2 = new SingleTaskRunnable4();
		
		
		Thread t = new Thread(s);//thread 1
		t.start();
		
		Thread t2= new Thread(s);//thread 2  object one 
		t2.start();

	}

	

}
