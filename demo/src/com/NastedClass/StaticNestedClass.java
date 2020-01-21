package com.NastedClass;

public class StaticNestedClass {
	
		//public int data;
	
		static int num=20;//outer class static variable
		
		static class Inner
		{
			int data=22;
			
			void getNumber()
			{
				System.out.println("Outer data "+num+" Innre data "+data);
			}
		}
		
		public void one() {
			
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNestedClass.Inner in= new StaticNestedClass.Inner();
		in.getNumber();

	}

}
