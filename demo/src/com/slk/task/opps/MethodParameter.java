package com.slk.task.opps;

//this keyword use in method parameter
public class MethodParameter {
	
	int a;
	int b;
	
	//Default Constructor
	public MethodParameter() {
		a=10;
		b=20;
		
	}
	
	//method receive this keyword as parameter
	void display(MethodParameter methodParameter)
	{
		System.out.println("a= " +a+" b= "+b);
	}
	
	//method return current class instance
	void get()
	{
		display(this);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		MethodParameter methodParameter = new MethodParameter();
		methodParameter.get();

	}

}
