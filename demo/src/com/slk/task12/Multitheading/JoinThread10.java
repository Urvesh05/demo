package com.slk.task12.Multitheading;

public class JoinThread10 extends Thread {
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("Thread Join Method ");
		for (int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName());
			
			System.out.println(i);
			try {
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinThread10 j = new JoinThread10() ;
		
		JoinThread10 j2 = new JoinThread10() ;
		
		j.setName("Thread 1");
		j2.setName("Thread 2");
		
		j.start();
		
		try {
			
			j.join();//first start this method 
			//j.join(2000);//first start 2000 second after two thread parallel work
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//j1 stop after (pacchi) j2 start 
		j2.start();
		

	}

}
