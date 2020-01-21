package com.slk.task.opps;

//class method
public class InvokeCurrentClassMethod {
	
	void dispaly()
	{
		//call function show
		this.show();
		System.out.println("dispaly method");
	}
	
	void show()
	{
		System.out.println("show method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvokeCurrentClassMethod invokeCurrentMethod = new InvokeCurrentClassMethod();
		invokeCurrentMethod.dispaly();

	}

}
