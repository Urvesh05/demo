package com.slk.task.opps;

public class SingleInheritanceClassB extends SingleInheritanceClassA{
	
	void get() {
	
		System.out.println("hi");
		
	}
	//SingleInheritanceClassA ab;

	public static void main(String[] args) {
		
		
		//parent class reference and object 
//	  SingleInheritanceClassA pa = new SingleInheritanceClassA();
//	  pa.get();
//	  
		//parent class reference and child class object to child class call
//	  SingleInheritanceClassA chi= new SingleInheritanceClassB();
//	  chi.get();
//	  
		
		//child class reference and child class object to child class call
	  SingleInheritanceClassB chi = new SingleInheritanceClassB();
		chi.get();
		
		//child class reference and parent class object to parent class call
//		SingleInheritanceClassB pa = new SingleInheritanceClassA();
//		pa.get();
//		

	}

}
