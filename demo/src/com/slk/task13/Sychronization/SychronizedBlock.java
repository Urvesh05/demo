package com.slk.task13.Sychronization;


//example of java synchronized method  

class TestBlock
{
	
	public void test(int n)//in this method under the Synchronized Block
	{
		
		synchronized(this)//Synchronized block   (in this block work is synchronized method type work)
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
	
}

class MyThread11 extends Thread 
{  
	TestBlock t;  
	
	MyThread11(TestBlock testBlock)//constructor
	{  
		this.t=testBlock;  
	}  
	public void run()
	{  
		t.test(5);  
  
	}  
}


class MyThread12 extends Thread
{
	TestBlock s;
	
	public MyThread12(TestBlock s) //constructor
	{
		this.s=s;	
	}
	
	@Override
	public void run() 
	{
		s.test(100);
		
	}
}




public class SychronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("This is Sychronize Bllock ");
	
	TestBlock testBlock = new TestBlock();
		
		MyThread11 m= new MyThread11(testBlock);//one obj create 
		MyThread12 m2 = new MyThread12(testBlock);
		
		
		m.start();
		m2.start();
		

	}

}
