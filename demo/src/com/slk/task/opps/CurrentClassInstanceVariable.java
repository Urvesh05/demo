package com.slk.task.opps;


//refer current class instance variables
public class CurrentClassInstanceVariable 
{
	
	int a;
	int b;
	
	//parameterized constructor
	public CurrentClassInstanceVariable(int a,int b) 
	{
		this.a=a;
		this.b=b;
		
	}
	
	public void dispaly() 
	{
		System.out.println(" a= "+a+" b= "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentClassInstanceVariable currentClassInstanceVariable = new CurrentClassInstanceVariable(10, 30);
		currentClassInstanceVariable.dispaly(); 

	}

}
