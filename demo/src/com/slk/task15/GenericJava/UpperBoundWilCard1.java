package com.slk.task15.GenericJava;

import java.util.ArrayList;

public class UpperBoundWilCard1 {
	
	 //Upper Bounded Integer List
	public static void upper(ArrayList<? extends Number>lits) 
	{
		//double sum=0.0;
		for (Number number : lits) 
		{
			System.out.println(number);
			//sum= sum+number.doubleValue();
			
		}
		//return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Integer ");
		
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(12);
	list1.add(34);
	
	UpperBoundWilCard1.upper(list1);
		
	ArrayList<Double > dl= new ArrayList<Double>();
	dl.add(12.43);
	dl.add(45.65);

	System.out.println("\nDouble  ");
	UpperBoundWilCard1.upper(dl);
	
	//System.out.println(upper(list1));
	//System.out.println(upper(dl));

	}

}
