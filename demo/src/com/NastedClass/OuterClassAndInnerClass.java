package com.NastedClass;


//inner class static 
public class OuterClassAndInnerClass {
	
	
	int x=10;
	
	static	class InnerClass
	{
		
		
		int y=20;
	}

// without creating an object of the outer class: in access to inner class (using by static class)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Static class use 
		OuterClassAndInnerClass.InnerClass in= new OuterClassAndInnerClass.InnerClass();
		
		System.out.println(in.y);

	}
}

