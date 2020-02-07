package com.slk.task16.Reflection;

class Simple{}  

class Demo{  
 public static void main(String args[]) throws ClassNotFoundException{  
  
		 
	 	//using forName() Method
	 
	 	Class c= Class.forName("Simple");
	 	System.out.println(c.getName());
	 
	 	/*
		 //using .class
		 Class 	d=Demo.class;
		 System.out.println(d.getName());
		
		 //using getClass() Method
		 Demo d1 = new Demo();
		 Class c1=d1.getClass();
		 
		 System.out.println(c1.getName());
		 */
	
 	}
 }