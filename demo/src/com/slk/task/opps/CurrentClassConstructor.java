package com.slk.task.opps;


//current class constructor
public class CurrentClassConstructor {
	
	int a;
	int b;
	
	//Default Constructor
	public CurrentClassConstructor() {
		this(10,30);
		System.out.println("default Constructor "+a+ " "+b);
	}
	
	//Parameterized constructor
	public CurrentClassConstructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("parameterrized constructor "+a+" "+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentClassConstructor currentClassConstructor = new CurrentClassConstructor();
		

	}

}
