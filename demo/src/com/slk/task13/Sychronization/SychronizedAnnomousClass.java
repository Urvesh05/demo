package com.slk.task13.Sychronization;


class Test
{
	synchronized void test(int n)
	{
		System.out.println("Anonymous class : ");
		
		for (int i = 0; i < 5; i++) 
		{
			
			System.out.println(n*i);
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



public class SychronizedAnnomousClass
{

	public static void main(String[] args) 
	{
		
		final Test t = new Test();//only One Object 
		
		//Anonymous class 1
		Thread thread =new Thread()//synchronized method by using anonymous class	
				{
					
					@Override
					public void run() 
					{
						// TODO Auto-generated method stub
						
					
						t.test(6);
					
					}
				
				};
				
				
				//Anonymous class 2
				Thread thread2 = new Thread()
				{
					@Override
					public void run() 
					{
						// TODO Auto-generated method stub
						
						t.test(10);
						
					}
				};
				
				thread.start();
				thread2.start();
	}

}
