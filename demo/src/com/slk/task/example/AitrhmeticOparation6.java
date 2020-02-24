package com.slk.task.example;

//Number of Method are same but Different are Parameter(signature)

public class AitrhmeticOparation6 
{
	int add(int num1,int num2)//method overloading
	{
		return num1+num2;
		
	}
	
	int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
		
	}
	int add(int num1,int num2,int num3,int num4)
	{
		return num1+num2+num3+num4;
		
	}

	public static void main(String[] args) {
		
		System.out.println("----------Airthmetic Opration Method Overloading -------\n");
		AitrhmeticOparation6 a= new AitrhmeticOparation6();
		//This will call the first add method
		System.out.println("Sum of two numbers: "+a.add(10,20));
		
		//This will call second add method
        System.out.println("Sum of three numbers: "+a.add(10,20,30));
        
        //This will call third add method
        System.out.println("Sum of four numbers: "+a.add(10,20,30,40));
		
		
		
	}

}
