package com.slk.task12.Multitheading;


//Thread create Runnable interface
public class ThreadCreateRunnebleInterface3 implements Runnable{
	
	public void run()//Override 
	{
		// TODO Auto-generated method stub
		
		System.out.println("This is Runnble interace ");
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ThreadCreateRunnebleInterface3 r= new ThreadCreateRunnebleInterface3();
		
		Thread t = new Thread(r);//Create Thread Class 
		
		t.start();//Thread class  start() method call  to Runnable Interface run

	}

	

}
