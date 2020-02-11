package com.slk.task16.Reflection;



public class TestClassReflectConstructor {

	
	 private int value;
	 private String name;
	 
	 // public Constructor
	 public TestClassReflectConstructor(int value, String name) 
	 {
	  
	  this.value = value;
	  this.name=name;
	 }
	 // private constructor
	 private TestClassReflectConstructor() 
	 {
	  
	 }
	 
	 public void showValue() 
	 {
	  System.out.println("Value - " + value);
	  
	 }
}
