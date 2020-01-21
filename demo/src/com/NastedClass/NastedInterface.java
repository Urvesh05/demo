package com.NastedClass;

import com.NastedClass.NastedInterface.InnerInterface;

public interface NastedInterface {
	
	//void display();
	
	interface InnerInterface
	{
		void run() ;
	}
}
	
	 class Test implements NastedInterface.InnerInterface
	{
		public void run()
		{
			System.out.println("Nasted Interface");
		}
		
//		public void display()
//		{
//			System.out.println("parent class");
//		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NastedInterface.InnerInterface obj= new Test();
		obj.run();
		
		
	}

}
