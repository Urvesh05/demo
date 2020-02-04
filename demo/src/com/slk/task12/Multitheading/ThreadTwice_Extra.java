package com.slk.task12.Multitheading;

public class ThreadTwice_Extra extends Thread {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thred is Twice");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTwice_Extra t = new ThreadTwice_Extra();
		t.start();
		t.start();//starting a thread one time  it can never be started second time again.to (IllegalThreadStateException)
		

	}

}
