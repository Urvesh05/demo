package com.slk.task12.Multitheading;

public class SleepThread9 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Sleep Method ");
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(i);
			
			//Thread Sleep Method 
			try {
				Thread.sleep(1000);
				//System.out.println("Thread Sleep ");
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepThread9 t= new SleepThread9();
		
		t.start();
		

	}

}
