package com.slk.task.opps;

//child class B implements (parent class) interface A
public class InterfaceClassB implements InterfaceClassA{
	
	public void show()
	{
		System.out.println("Interface class b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interface class A reference variable (parent class) and InterfcaeClassB (Child class)object variable to call child class
		InterfaceClassA interfaceClassA = new InterfaceClassB();
		interfaceClassA.show();

	}

}
