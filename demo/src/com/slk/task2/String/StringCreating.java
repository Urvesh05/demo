package com.slk.task2.String;

//creating string by java string
public class StringCreating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";//creating string by java string literal (same string to one time memory allocate)  
		String s2="java";//no memory allocate
		String s11=s1;
		String s3= new String("Slk techolab");//creating string by new keyword  
		//String s4= new String("Slk techolab");
		
		String s12 = new String(s11);
		char ch[] = {'G','u','j','a','r','a','t'};//converting char array to string  
		String s4 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s4);
		//System.out.println(s5);
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		
		System.out.println(s11==s1);
		
		System.out.println(s11==s12);
	}
}
