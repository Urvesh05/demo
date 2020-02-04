package com.slk.task12.Multitheading;

public class ThreadRunMethod_Extra extends Thread{
	
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
	
		System.out.println("Run Method call ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadRunMethod_Extra t = new ThreadRunMethod_Extra();
		t.run(); //fine, but does not start a separate call stack  
		// Problem if you direct call run() method


		

	}

}
