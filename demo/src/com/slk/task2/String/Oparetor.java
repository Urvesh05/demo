package com.slk.task2.String;

import java.util.Scanner;

public class Oparetor {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter Value 1");
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("Enter Value 2");
		int b= sc.nextInt();
		
		System.out.println("opration ");
		System.out.println("1.<");
		System.out.println("2.<=");
		System.out.println("3.>");
		System.out.println("4.>=");
		
		int ch = sc.nextInt();
	
		switch (ch) {
		case 1: 	
				System.out.println(a+" < "+b);
				
				if((a<b))
				{
					System.out.println("true");
				}
				else
				{
					System.out.println("false");
				}
			
			break;
			
		case 2: 	
			System.out.println(a+" <="+b);
			
			if(a<=b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		
		break;
		
		case 3: 	
			System.out.println(a+" > "+b);
			
			if(a>b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		
		break;
		
		case 4: 	
			System.out.println(a+" >= "+b);
			
			if(a>=b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		
		break;

		default :
			System.out.println("in valid ");
			break;
		}
		
	}
}
