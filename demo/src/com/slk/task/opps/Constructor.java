package com.slk.task.opps;

public class Constructor extends Student {
	
	//Default Constructor  & no-arg
	 public Constructor() 
	{
		System.out.println("Default Constructor");
	
	}
	
	//Parameterize Constructor
	
	int id;
	String name;
	 public Constructor(int i,String n)
	{
		this();
		id=i;
		name=n;
		//System.out.println("id");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor constructor = new Constructor(10,"abc");
		
		
		constructor.id=101;
		constructor.name="Urvesh";
		
		System.out.println(constructor.id+" "+constructor.name);
	}

}
