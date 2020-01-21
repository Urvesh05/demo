package com.slk.task.opps;

 class FinalKeyword {
	
	//final variable
	final String name="Final variable";
	
	//final method
	
	final void get()
	{
		System.out.println("final method");
	}

	//cannot override final method and final class extends
//		class Child extends FinalKeyword
//	{
//		void get()
//		{
//			System.out.println(" child method");
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyword finalKeyword = new FinalKeyword();
		System.out.println(finalKeyword.name);
		finalKeyword.get();

	}
 }

