package com.slk.task12.Multitheading;

public class DeamonThread13 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Yes This is Deamon Thread ");//checking for daemon thread  
		}
		else
		{
			System.out.println("This is not deamon thread ");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DeamonThread13 d=new DeamonThread13();
		d.setDaemon(true);//now this is deamon thread 
		
		d.start();
		
		
	}

}
