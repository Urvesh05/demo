package com.slk.task.opps;

public class MethodOverRiding_B extends MethodOverRiding_A{
	
	public void get(int a)
	{
		System.out.println("overriding "+a);
		super.get(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding_B methodOverRiding = new MethodOverRiding_B();
		methodOverRiding.get(20); 

	}

}
