package com.slk.task12.Multitheading;

public class ThreadPriority12 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Priority Check ");
		
		System.out.println("Thread Name "+Thread.currentThread().getName());
		
		System.out.println("Thread Priority "+Thread.currentThread().getPriority());
			Thread.currentThread().setPriority(5);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPriority12 t= new ThreadPriority12();
		//t.setPriority(MAX_PRIORITY);//10
		t.setPriority(MIN_PRIORITY);//1
		//t.setPriority(NORM_PRIORITY);//5
		t.start();
	}

}
