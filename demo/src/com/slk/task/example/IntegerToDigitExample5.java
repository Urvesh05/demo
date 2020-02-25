package com.slk.task.example;

import java.util.ArrayList;

public class IntegerToDigitExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num=123456;
		
		System.out.println("\n-------Integer To Digit-------");
		
		while(num>0)
		{
			
			System.out.println(num%10);
			num= num/10;
			
			
		}
		
		/*
		//OR
		int temp=10236769;
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		do 
		{
			list.add(temp%10);
			temp /= 10;
			
		}
		while(temp>0);
		
		//System.out.println(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}*/
	}
	


}
