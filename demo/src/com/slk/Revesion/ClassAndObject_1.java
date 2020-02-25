package com.slk.Revesion;

public class ClassAndObject_1 {
	
	int id; 
	String name;
	
	public void demo(int n,String s) 
	{
		id=n;
		name=s;
	}

	public void show() 
	{
		System.out.println(id+name);
	}

	public static void main(String []args) 
	{
		// TODO Auto-generated method stub
		
		ClassAndObject_1 classAndObject_1= new ClassAndObject_1();
		classAndObject_1.demo(100,"Gita");
		classAndObject_1.show();
	}

}
