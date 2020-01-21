package com.slk.task2.String;

public class StringConcatenation {
	
	//1) String Concatenation by + (string concatenation) operator
	public static void oprator() 
	{
		String s ="Rahul"+"Patel";
		System.out.println(s);
		
		String s1= 20+10+"Rahul"+20+19+"patel";
		System.out.println(s1+"\n");
		
	}
	//2) String Concatenation by concat() method
	
	public static void concat() 
	{
		String s1="hello";
		String s2="Karan";
		String s3="Rathod";
		String s4=s1.concat(s2).concat(s3);
		System.out.println(s4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringConcatenation.oprator();
		StringConcatenation.concat();
	}

}
