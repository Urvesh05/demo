package com.slk.task.opps;

public class CallByValue {
	
	// If we call a method passing a value,
	void change(int i ,int j)
	{
		i=i+100;
		
		j=j*2;
		
		System.out.println("After performing  Action");
		
		System.out.println(i+ " "+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			CallByValue callByValue=new CallByValue();
		
			int i = 90 , j=14;
		
			System.out.println("The value of i and j before call :");
			System.out.println(i+ " "+j);
		
			callByValue.change(90, 14);	
		
	}

}
