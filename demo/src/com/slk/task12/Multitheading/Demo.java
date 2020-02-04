package com.slk.task12.Multitheading;

public class Demo{
	
	static class M extends Thread
	{
		
		
		public void run() {
			
			System.out.println("Hello");
			
			for (int i = 0; i < 6; i++) {
				
			
				
			}
			
		}
	}
	
	
	static class N extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("hello");
			
			
			for (int i = 0; i < 5; i++) {
			
				System.out.println(" test 1   "+i);
				
			}
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo.M m= new Demo.M();
		Demo.N n= new Demo.N();
		m.setName("ggg");
		n.setName("nnn");
	
		
		m.start();
		n.start();
		
		System.out.println(m.getName());
		
	

	}

}
