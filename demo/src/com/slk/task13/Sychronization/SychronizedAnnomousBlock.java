package com.slk.task13.Sychronization;


class SynBlock
{
	public void block(int n)//in this method under the Synchronized Block
	{
		synchronized(this)//synchronized block
		{
			for (int i = 0; i <=5; i++)
			{
				System.out.println(n*i);
				try {
					
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


public class SychronizedAnnomousBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is Anonymus Block : ");
		
		final SynBlock b= new SynBlock();//only one object 
		
		
		//Anonymous class 1
		Thread t = new Thread() //Anonymous class
		{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				b.block(10);
			}
		};
		

		//Anonymous class 2
		Thread t2 = new Thread() //Anonymous class
		{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				b.block(100);
			}
		};
		

		t.start();
		t2.start();

	}

}
