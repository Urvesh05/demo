package com.slk.task12.Multitheading;


//Multiple Task Multiple Thread

public class MultiTasking5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A();
		B b = new B();
				
		a.start();
		b.start();
		
	}

}

//thread 1
class A extends Thread {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task 2 ! Running ");
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(i);
		}
	}
}

//thread 2
class B extends Thread {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task 1 ! Running ");
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(i*2);
		}
	}
}
