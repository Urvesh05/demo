package com.NastedClass;

//Outer class in under Inner class 

//Outer class
public class MemberInner {
	
private	int data= 30;
public int data1=20;
static int data2=40;

//Inner class
	class Inner
	{
		void msg()
		{
			System.out.println(data+data1+data2);
		}
	}
	
	void dispaly()
	{
		Inner inner= new Inner();//(1) Inside inner class object
		inner.msg();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MemberInner outer = new MemberInner();
		//outer.dispaly();
		
		
		//Member Inner Class that is invoked outside a class (2)
		
		MemberInner outer = new MemberInner();
		MemberInner.Inner inner = outer.new Inner();
		inner.msg();
	}
}
