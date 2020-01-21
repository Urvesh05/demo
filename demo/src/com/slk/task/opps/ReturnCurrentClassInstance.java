package com.slk.task.opps;

//Return current class all method ,Constructor and variable
public class ReturnCurrentClassInstance {
	int a;
	int b;
	
	//Default Constructor
	public ReturnCurrentClassInstance() {
		 a=10;
		 b=30;
		
	}
	//parameterized constructor
	ReturnCurrentClassInstance(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	// Method that current class instance
	
	ReturnCurrentClassInstance get() {
		return this;
	}
	
	void dispaly()
	{
		System.out.println("Current class Instance " +a+ " "+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnCurrentClassInstance returnCurrentClassInstance = new ReturnCurrentClassInstance();
		System.out.println(returnCurrentClassInstance.a);
		returnCurrentClassInstance.dispaly();

	}

}
