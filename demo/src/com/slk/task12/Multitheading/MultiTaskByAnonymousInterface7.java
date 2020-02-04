package com.slk.task12.Multitheading;

public class MultiTaskByAnonymousInterface7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AnonymouseClass Runnable Interface (1)  Direct Object Create in This class
		Runnable runnable1 = new Runnable() 
		{
			
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("AnonymouseClass 1 Running ");
				for (int i = 0; i < 5; i++) {
					
					System.out.println(i);
				}
	
			}
		};
		
		
		//AnonymouseClass Runnable Interface (2)
		Runnable runnable2 = new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("AnonymouseClass 2 Running ");
				for (int i = 0; i < 5; i++) {
					
					System.out.println(i*2);
				}
			}
		};
		
		
		Thread t = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		
		
		t.start();
		t2.start();
		

	}

}
