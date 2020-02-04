package com.slk.task12.Multitheading;



//Thread create Thread class
public class ThreadCreateThreadClass3 extends Thread{
	
	public void run() //Override method 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Thread is Running ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadCreateThreadClass3 t = new ThreadCreateThreadClass3();
		
		t.start();//Thread class Method
		
	}

}
