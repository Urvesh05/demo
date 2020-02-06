package com.slk.task14.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//https://www.tutorialspoint.com/java_concurrency/concurrency_lock.htm
class PrintDemo

{
	private final Lock queueLock= new ReentrantLock();
	
	
	public void print()
	{
		
		queueLock.lock();
		System.out.println("===Thread lock==");
		
		try {
			
//			System.out.println(Thread.currentThread().getName()+"==Time Teken==");
//			Thread.sleep(10000);
			
			Long duration = (long) (Math.random() * 10000);
			
	        System.out.println(Thread.currentThread().getName() + "  Time Taken " + (duration / 1000) + " seconds.");
	        
	         Thread.sleep(duration);
	         
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		
		{ 
			System.out.printf("%s printed the document successfully.\n", Thread.currentThread().getName());
			System.out.println("=======UnLock Thread========= ");
	         queueLock.unlock();
		}
	}
}


class ThreadDemo extends Thread
{
	
	PrintDemo  printDemo;//class Variable 
	
	public ThreadDemo(String name,PrintDemo printDemo) {
		// TODO Auto-generated constructor stub
	
		super(name);
		this.printDemo=printDemo;
		
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 //System.out.println("Lock "); 
		 System.out.printf("%s starts printing a document \n", Thread.currentThread().getName());
		  
		 printDemo.print();
		
		
		
	}
}


public class LockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PrintDemo pd= new PrintDemo();
		
		
		ThreadDemo td = new ThreadDemo("Thread 1", pd);
		ThreadDemo td2 = new ThreadDemo("Thread 2", pd);
		
		
		td.start();
		td2.start();
		

	}

}
