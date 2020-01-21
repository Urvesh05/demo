package com.slk.task.opps;

public class Pattern1 {
	
public void simplePattern() 
{

	for(int i=1;i<=5;i++)
	{
		for(int j=1 ;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}



public void simplePattern2() 
{

	for(int i=1;i<=5;i++)
	{
		for(int j=1 ;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}


public void simplePattern3() 
{

	for(char i='A';i<='E';i++)
	{
		for(char j='A' ;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}


public void simplePattern4() 
{

	for(int i=1;i<=5;i++)
	{
		for(int j=3 ;j>=i;j--)
		{
			System.out.print(" ");
		}
		
		for(int k=1;k<=i;k++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern1 pattern1= new Pattern1();
		pattern1.simplePattern();
		pattern1.simplePattern2();
		pattern1.simplePattern3();
		pattern1.simplePattern4();

	}

}
