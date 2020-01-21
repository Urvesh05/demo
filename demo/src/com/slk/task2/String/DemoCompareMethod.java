package com.slk.task2.String;


public  class DemoCompareMethod extends Object{
	
	static void get()
	{
		String  s1= "Slk";
		String s2="Slk";
		
		String s3 = new String ("Slk");
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s1==s2);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoCompareMethod.get();
		
	}

}
