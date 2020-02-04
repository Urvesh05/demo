package com.slk.task12.Multitheading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Task class to be executed (Step 1) 
public class ThreadPool14 implements Runnable
{
	private String name;
	
	public ThreadPool14(String s) {
		// TODO Auto-generated constructor stub
		this.name=s;
	}
	
		
	public void run() {
		// TODO Auto-generated method stub


		System.out.println(Thread.currentThread().getName()+" Message "+name);
		
		processmessage();//call processmessage method that sleeps the thread for 2 seconds  
	}
	private void processmessage() {
		// TODO Auto-generated method stub
		  System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
		 
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService excExecutorService=Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		for (int i = 0; i < 10; i++) {
			
			Runnable work =new ThreadPool14(""+i);
			excExecutorService.execute(work);
		}
		excExecutorService.shutdown();
		while (!excExecutorService.isTerminated()) {
			

		}
		System.out.println("alll thread finis ");
		
	}


}
