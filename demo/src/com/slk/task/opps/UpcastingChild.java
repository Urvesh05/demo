package com.slk.task.opps;

//child class
public class UpcastingChild extends UpcastingParent{
	
	public void get() {
		System.out.println("upcating child");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// in object create to this class call
		UpcastingChild upcastingChild = new  UpcastingChild();
		UpcastingParent upcastingParent = (UpcastingParent) upcastingChild;
		upcastingParent.get();
		
		//UpcastingParent upcastingParent = new UpcastingChild();
		

	}

}
