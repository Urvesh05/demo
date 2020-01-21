package com.slk.task.opps;

public class StaticBinding {

	//private, final or static method in a class, there is static binding.
	static void run()
	{
		System.out.println("Static binding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Object create to use static binding
//		StaticBinding staticBinding = new StaticBinding();
		
		//Without object create to use static binding
		StaticBinding.run();

	}

}
