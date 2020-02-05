package com.slk.task13.Sychronization;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final String s= "Thread 1";
		final String s2= "Thread 2";
		
		
		  // t tries to lock s then t2  
		Thread t = new Thread()
			{
				@Override
				public void run() {
					// TODO Auto-generated method stub
						synchronized(s)
						{
							System.out.println("Thread 1 is locked ! ");
						}
						try 
						{
							Thread.sleep(200);
							
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
				}
				
			};
			
			
			 // t2 tries to lock s then t  
			Thread t2 = new Thread()
			{
				@Override
				public void run() {
					// TODO Auto-generated method stub
					/*
					for (int i = 0; i < 10; i++) {
						System.out.println(i);
						
					}*/
						synchronized(s2)
						{
							
							System.out.println("Thread 2 is locked ! ");
						}
						try 
						{
							Thread.sleep(200);
							
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
				}
				
			};
			
			t.start();
			t2.start();

	}

}
