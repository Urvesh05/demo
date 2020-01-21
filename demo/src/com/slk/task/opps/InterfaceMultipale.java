package com.slk.task.opps;

public class InterfaceMultipale implements InterfaceMultipaleA,InterfaceMultipaleB {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("interface A");
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("interface B");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceMultipale interfaceMultipale = new InterfaceMultipale();
		interfaceMultipale.get();
		interfaceMultipale.show();

	}

}
