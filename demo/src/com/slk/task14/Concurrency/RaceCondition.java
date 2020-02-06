package com.slk.task14.Concurrency;


//Multipale thread ekj resource upre work kare 6e thethi teni value ma change thay 6e.(Resource i )



public class RaceCondition implements Runnable{

	
	private int i=0;
	
	public void increment()
	{
		
		try {
			
			Thread.sleep(100);
			
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}
	
	public void decrement() 
	{
		i--;
	}
	
	public int getValue()
	{
		return i;
	}

	
	
	public void run() 
	{
		// TODO Auto-generated method stub

		//increments
		
			this.increment();
			System.out.println("After Increments "+ Thread.currentThread().getName()+" "+this.getValue());

			//Decrements 
			this.decrement();
			System.out.println("After Decrements "+Thread.currentThread().getName()+" "+this.getValue());
			
			System.out.println("\n");
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RaceCondition rc= new RaceCondition();
		
		Thread t1= new Thread(rc,"Thread-1 ");
		
		Thread t2= new Thread(rc,"Thread-2 ");
		
		Thread t3= new Thread(rc,"Thread-3 ");
		
		t1.start();
		t2.start();
		t3.start();
		

	}


}


//Since multiple threads try to race each other to finish executing a method thus the name race condition.
