package com.slk.task12.Multitheading;

public class NamingThreadGetData11 extends Thread
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
		
		NamingThreadGetData11 t1= new NamingThreadGetData11();
		NamingThreadGetData11 t2 = new NamingThreadGetData11();
		
		
		t1.start();
		t2.start();
		
		t1.setName("Thread 1");//Change Thread Name
		t2.setName("Thread 2");
		
		System.out.println("Name Of Thread "+t1.getName());
		System.out.println("Name Of Thread "+t2.getName());
		
		System.out.println("Thread Id  "+t1.getId());
		

	}

}
