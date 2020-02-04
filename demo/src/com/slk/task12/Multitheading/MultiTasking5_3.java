package com.slk.task12.Multitheading;


//Multi Thread  In Runnable Interface

public class MultiTasking5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		Thread t = new Thread(test1);//Thread Create 1 
		t.start();
		
		Thread t2 = new Thread(test2);//Thread Create 2
		t2.start();

	}

}

// 1
class Test1 implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Task 1 ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}
	
}


// 2
class Test2 implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Task 2 ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i*3);
		}
		
	}
}