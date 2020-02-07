package com.slk.task15.GenericJava;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded3 {
	
	public static void lowerBound(List<? super 	Integer>list) //Integer Super Class Number Or Object 
	{
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(35);
		list1.add(78);
		
		System.out.println("==========Integer =======");
		LowerBounded3.lowerBound(list1);
		
		
	
		ArrayList<Number> d= new ArrayList<Number>();
		d.add(12.34);
		d.add(54.09);
		
		System.out.println("==========Double =======");
		LowerBounded3.lowerBound(d);

	}

}
