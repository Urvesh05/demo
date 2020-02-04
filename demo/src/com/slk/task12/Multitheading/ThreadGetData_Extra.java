package com.slk.task12.Multitheading;

public class ThreadGetData_Extra extends Thread
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("======== Thread Get Data =========");
		
		System.out.println("Current Thread Name "+Thread.currentThread().getName());//current thread work check
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGetData_Extra t1= new ThreadGetData_Extra();
		ThreadGetData_Extra t2 = new ThreadGetData_Extra();
		
		
		t1.start();
		t1.setName("Thread 1");//Change Thread Name
		System.out.println("Name Of Thread "+t1.getName());
		System.out.println("Thread Id  "+t1.getId());
		

	}

}
