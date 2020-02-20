package com.slk.task.example;

import sun.print.resources.serviceui;

public class PatternExample2 {
	
	/*
	public static void pattern1() 
	{
		int n=3;
		int i,j;
		
		for( i=0;i<=n;i++)//row
		{
			System.out.print("");
		
			for( j=0;j<=i;j++)//Column
			{
				System.out.print("*");
			}
			
			System.out.println();	
		}
	}
	
	/*
	public static void pattern2()
	{
		int n=5;
		
		for(int i=1;i<=n;i++)//rows
		{
			
			for(int j=i;j>=i;j--)
			{
				System.out.print("");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	
	}	
	*/
	
	
	public static void pattern3()
	{
		System.out.println("pattern 2");
		int i,j;
		int n=5;
		
		for(i=0;i<=n;i++)
		{
			for(j=n;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print (" ");
				}
				else 
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		
	}
	
	
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//PatternExample2.pattern1();
		//PatternExample2.pattern2();
		PatternExample2.pattern3();
		
		System.out.println("hello");

	}

}
