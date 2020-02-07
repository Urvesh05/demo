package com.slk.task16.Reflection;

import java.lang.reflect.Modifier;

//interface 1
interface Animal 
{
	
	public void dispaly();
}

//interface 2
interface Birds
{
	public void run();
}
	

//class 
public class GetInterface implements Animal,Birds//Multiple Inheritance 

{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Animal");
		
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("Bird Is Flying");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// create an object of  GetInterface class
			GetInterface i = new GetInterface();
			
			// create an object of Class using getClass()
			Class obj=i.getClass();
			
			
			 // Get the access modifier of Dog in integer form
			int modifire =obj.getModifiers();
			System.out.println("Modifier in this class ===> "+Modifier.toString(modifire));
			
			
			// Find the superclass of GetInteface
			Class superClass= obj.getSuperclass();
			System.out.println("SupreClass ===>"+superClass.getName());
			
			
			// find the interfaces implemented by GetInterface
			//Store Interface in array 
			Class[] objectInterface=obj.getInterfaces();
			
			for (Class  c: objectInterface) 
			{
				// print the name of interfaces
				System.out.println("Inteface Name ==>"+ c.getName());	
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
