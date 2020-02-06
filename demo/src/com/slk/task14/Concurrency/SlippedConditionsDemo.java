package com.slk.task14.Concurrency;

public class SlippedConditionsDemo extends Thread  {
	
	private boolean isLocked=true;
	

	public void lock()
	{
		
		synchronized(this)
		{
				while(isLocked)
					
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		}
		
		synchronized(this)
		{
			isLocked=true;
		}
		
	}
	
	public synchronized void unlock()
	{
		isLocked=false;
		this.notify();
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final SlippedConditionsDemo d= new SlippedConditionsDemo();
		
		
		Thread t = new Thread(d) {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			d.unlock();
			}
		};
		t.start();
		
		System.out.println("hello");

	}

}
