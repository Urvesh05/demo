package com.slk.task.opps;

//Multiple Inheritance by Use Interface
public class InterfaceClass implements InterfaceClassC,InterfaceClassA{
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("interface A");
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("interface C");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.show();
		interfaceClass.dispaly();

	}
}
