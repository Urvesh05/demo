package com.slk.task13.Sychronization;

//example of java synchronized method  
class SychronizedTest
{
	
	synchronized void test(int n)//Synchronized method 
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println(n*i);
			
			try 
			{
				Thread.sleep(400);
			} catch (InterruptedException e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class MyThread1 extends Thread 
{  
	SychronizedTest t;  
	
	MyThread1(SychronizedTest t)//constructor
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.test(5);  
  
	}  
}


class MyThread2 extends Thread
{
	SychronizedTest s;
	
	public MyThread2(SychronizedTest s) //constructor
	{
		this.s=s;	
	}
	
	@Override
	public void run() 
	{
		s.test(100);
		
	}
}


public class SychronizedMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SychronizedTest obj = new SychronizedTest();//only one object  
		MyThread1 t= new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t.start();
	
		t2.start();
	}

}
