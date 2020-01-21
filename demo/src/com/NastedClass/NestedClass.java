package com.NastedClass;

//it is also possible to nested classes (a class within a class).outer class
public class NestedClass //outer class
{
	private int x=10;
	
	class InnerClass//inner class
	{
		int y=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedClass outer = new NestedClass();
		NestedClass.InnerClass inner = outer.new InnerClass();
		
		System.out.println(outer.x + inner.y);
	}

}
