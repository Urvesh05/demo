package com.NastedClass;


//Outer Class 
public class AnnonymouseClass {
	
	int speed=20;
	
	public void run()
	{
		System.out.println("Speed Is ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnonymouseClass annonymouseClass = new AnnonymouseClass();
		{
			annonymouseClass.run();
		}
		
		AnnonymouseClass annonymouseClass2 = new AnnonymouseClass()
		
				{
					public void run()
					{
						System.out.println(speed);
					}
				};
				annonymouseClass2.run();
	}
}
