package com.slk.task2.String;

//unmodifiable or unchangeable.
public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Computer";//reference variable still refers to "Computer"
		s.concat(" Science");
		System.out.println(s);
		
		
		//new assign the reference variable
		s=s.concat(" Gujarat");	
		System.out.println(s);

	}

}
