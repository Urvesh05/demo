package com.slk.task.example;

public class PatternExample2 {
	
	
	public static void pattern1() 
	{
		System.out.println("pattern ==> 1");
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
	
	
	public static void pattern11()
	{
	
		System.out.println("\npattern ==> 2");
		int n=5;
		int i,j,k;
		
		for( i=1;i<=n;i++)
		{
			
			for(j=n;j>=i;j--)//rows space
			{
				System.out.print(" ");
			}
			
			for( k=1;k<=i;k++)//Column
			{
				System.out.print(" *");
			}
				System.out.println();
		}
	
	}	
	
	/*
	
	public static void pattern2()
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
	*/
	
	
	public static void pattern3()
	{
		int i,j,k;
		//int n=5;
		
		System.out.println("\npattern ==> 3");
		
		for(i=1;i<=5;i++)//row
		{
			for(k=5;k>=i;k--)//space
			{
			System.out.print(" ");
			}
			for(j=1;j<=i;j++)//Column
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}
	
	
	public static void pattern4()
	{
		int i,j;
		int n=5;
		
		System.out.println("\npattern ==> 4");
		
		for(i=1;i<=n;i++)
			
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(""+i);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		PatternExample2.pattern1();
		PatternExample2.pattern11();
		//PatternExample2.pattern2();	
		PatternExample2.pattern3();
		PatternExample2.pattern4();

	}

}
