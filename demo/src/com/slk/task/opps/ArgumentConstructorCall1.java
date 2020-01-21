package com.slk.task.opps;

public class ArgumentConstructorCall1 {
	
	int a=2;
	
	//argument constructor class
	public ArgumentConstructorCall1() {
		// TODO Auto-generated constructor stub
		
		ArgumentConstructorCall argumentConsctructor = new ArgumentConstructorCall(this);
				
	}
	
	void dispaly() {
		System.out.println(" a = " +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgumentConstructorCall1 argumentConstructor1 = new ArgumentConstructorCall1();
		

	}

}
