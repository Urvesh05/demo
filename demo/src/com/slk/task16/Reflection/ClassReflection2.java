package com.slk.task16.Reflection;


public class ClassReflection2 {
	
	

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		//1.using forName() Method
		//Class  c= Class.forName("ClassReflection");
		//System.out.println(c.getName());
		
		
		//2.using .class
		Class cl =ClassReflection2.class;
		
		System.out.println(cl+"\n");
		
		//3.using getClass() Method
		ClassReflection2 clr= new ClassReflection2();
		Class cs=clr.getClass();
		System.out.println(cs);

	}

}







//https://examples.javacodegeeks.com/core-java/reflection/java-reflection-example/
//https://www.softwaretestinghelp.com/java/java-reflection/