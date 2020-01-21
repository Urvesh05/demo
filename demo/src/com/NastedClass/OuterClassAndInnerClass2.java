package com.NastedClass;


//inner classes, is that they can access attributes and methods of the outer class:
public class OuterClassAndInnerClass2 {
	
	int x= 30;// this data access by inner class
	
	//class Inner
	private class Inner
	
	{
		public int get()
		{
			return x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClassAndInnerClass2 outer = new OuterClassAndInnerClass2();
		OuterClassAndInnerClass2.Inner inner = outer.new Inner();
		
		System.out.println(inner.get());

	}

}
