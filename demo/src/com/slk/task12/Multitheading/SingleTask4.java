package com.slk.task12.Multitheading;

public class SingleTask4 extends Thread{
	
	public void run()//task
	{
		System.out.println("This is a single task by thread Class ");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Single Task Multiple Thread
		SingleTask4 s= new SingleTask4();
		SingleTask4 s2= new SingleTask4();
		
		
		s.start();
		s2.start();
	}

}




















//https://www.c-sharpcorner.com/UploadFile/fd0172/perform-single-and-multiple-task-using-multiple-thread-in-ja/