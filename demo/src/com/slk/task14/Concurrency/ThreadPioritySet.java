package com.slk.task14.Concurrency;

public class ThreadPioritySet extends Thread{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Thread ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPioritySet t1= new ThreadPioritySet();
		ThreadPioritySet t2= new ThreadPioritySet();
		ThreadPioritySet t3= new ThreadPioritySet();
		
		 System.out.println("Default thread priority of Thread 1: " + t1.getPriority());
	      System.out.println("Default thread priority of Thread 2: " + t2.getPriority());
	      System.out.println("Default thread priority of Thread 3: " + t3.getPriority());
	      
	      //set Priority 
	      t1.setPriority(7);
	      t2.setPriority(3);
	      t3.setPriority(9);
	      
		
	      //Change piority get 
	      
	      System.out.println("\n==========Set Priority ============");
	      
	      System.out.println("\nChanged thread priority of Thread 1: " + t1.getPriority());
	      System.out.println("Changed thread priority of Thread 2: " + t2.getPriority());
	      System.out.println("Changed thread priority of Thread 3: " + t3.getPriority());
	      
	      
	      System.out.println("\n============Default Priority =========" + Thread.currentThread().getName());
	      System.out.println("\nDefault thread priority of Main Thread: " + Thread.currentThread().getPriority());
	      
	      currentThread().setPriority(MAX_PRIORITY);
	      System.out.println("\nMax Thread Priority : "+Thread.currentThread().getPriority());
	      
	     
	      
	      

	}

}
