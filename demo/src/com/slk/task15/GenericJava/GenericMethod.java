package com.slk.task15.GenericJava;

public class GenericMethod {
	
	// generic method printArray
	public static <E> void getArray(E[] inputArray)
	{
		//System.out.println("======Static Method ==========\n");
		
		 // Display array elements
		for (E e : inputArray) {
			System.out.printf(" %s ",e);
		}
		
	}
	
	
	public <E> void nonStatic(E[] doubleArray)
	{
		//System.out.println("======Non-Static Method ==========\n");

		for (E e1 : doubleArray) {
			System.out.println(e1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray= {1,4,1,7,8,4,5};
		Character[] charArray= {'R','A','H','U','L'};
		
		System.out.println("======Static Method ==========\n");
		
		System.out.println("Array integerArray contains:\n");
		getArray(intArray);
		
		
		System.out.println("\nArray characterArray contains:\n");
		getArray(charArray);
		
	
		System.out.println("\n======Non-Static Method ==========");
		Double[] doubles = {1.1,2.5,5.7,8.1};
		GenericMethod m= new GenericMethod();
		
		System.out.println("\nArray DoubleType  contains:");
		m.nonStatic(doubles);
	}

}
