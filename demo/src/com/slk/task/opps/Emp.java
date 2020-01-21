package com.slk.task.opps;

public class Emp {
	
	String name;
	Address ad;
	
	public Emp( String name, Address ad) {
		// TODO Auto-generated constructor stub
		
		this.ad=ad;
		this.name=name;
	}

	private void display(){
		// TODO Auto-generated method stub
		
		System.out.println("Name is "+name+ " City "+ad.city+" State " +ad.state);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address= new Address("Surat", "Gujarat");
		Emp emp=new Emp("Urvesh",address);
		
		//System.out.println(emp.name+emp.ad);
		
		emp.display();
	}

}
