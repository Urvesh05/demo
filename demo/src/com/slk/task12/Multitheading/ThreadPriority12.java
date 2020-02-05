package com.slk.task12.Multitheading;

public class ThreadPriority12 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Priority Check ");
		
		//System.out.println("Thread Name "+Thread.currentThread().getName());
		
		System.out.println("Thread Priority "+Thread.currentThread().getPriority());
		
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				
			}
		
	
	}
	public static void main(String[] args) {
		
		ThreadPriority12 t= new ThreadPriority12();
		
		t.setPriority(Thread.MAX_PRIORITY);
		
		
		//t.setPriority(t.getPriority());
		
		//t.setPriority(MAX_PRIORITY);//10
		//t.setPriority(MIN_PRIORITY);//1
		//t.setPriority(NORM_PRIORITY);//5
		t.start();
	}

}
