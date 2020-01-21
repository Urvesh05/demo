package com.slk.task.opps;


//Child class extends parent class
public class DynaminBinding_Child extends DynamicBinding{
	
	//method override
	void run()
	{
		System.out.println("Dyanamic binding child" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  parent class reference create to child class object in call child class method 
		DynamicBinding dynaming = new DynaminBinding_Child();
		dynaming.run();
		
		//parent class object create
//		DynamicBinding dynamicBinding = new DynamicBinding();
//		dynamicBinding.run();
	}

}
