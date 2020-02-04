package com.slk.task.opps;

public class DaemonThread extends Thread{
	
		public void run()
		
		{
			
			if(Thread.currentThread().isDaemon())//checking for daemon thread  
			{
				System.out.println("This Is Daemon thread work !");
			}
			else 
			{
				System.out.println("This is Thread Work !");
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DaemonThread d1 = new DaemonThread();//creating Threads
		DaemonThread d2 = new DaemonThread();
		DaemonThread d3= new DaemonThread();
			
		d1.setDaemon(true);//false //this is daemon thread
		
		d1.start();//start thread
		d2.start();
		d3.start();

	}

}
