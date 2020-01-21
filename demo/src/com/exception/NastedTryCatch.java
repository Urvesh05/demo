package com.exception;


public class NastedTryCatch {
	
	
	public static void main(String[] args) {
		
			try
			{
				int a[]= {10,23,13,45,67,90,30};
				System.out.println("Elements index at "+a[3]);
				
				try {
					
					int i = 100/2;
					System.out.println("Ans ="+i);
					
					
				} catch (ArithmeticException e) {
					System.out.println("Arthmetic Exception Sorry! Division by zero isn't feasible! ");
				}
				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException ");
			}
		
	}
}