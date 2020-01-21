package com.slk.task2.String;

public class Opration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Unary Operator 
		int x=10;
		
		System.out.println(x++);//10+1=(11)
		System.out.println(++x);//1+11=(12)
		
		System.out.println(x--);//12-1=(11)
		
		System.out.println(--x);//-1+11=(10)
		
		
		int b=20;
		int c=30;
		
		System.out.println(b++ + ++b);//20+1+1+20=42
		System.out.println(c++ + c++);//30+1+30=61
		
		boolean d=true;
		boolean e=false;
		System.out.println(!d);
		System.out.println(!e);
		
		
		//Java Left Shift Operator
		
		System.out.println(10<<2);//10*2*2=40
		
		//Java Right Shift Operator
		System.out.println(10>>2);//10/2*2=10/4=(2)
	
	}

}
