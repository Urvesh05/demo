package com.slk.task.opps;

public class CallByValue1 {
	
	int data =100;
	
	void change(CallByValue1 callByValue1)
	{
		callByValue1.data=callByValue1.data+200;//changes will be in the instance variable  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValue1 callByValue1 = new CallByValue1();
		
		System.out.println("Before change Data "+callByValue1.data);
		
		callByValue1.change(callByValue1);
		
		System.out.println("After change Data "+callByValue1.data);
	}

}
	