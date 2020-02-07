package com.slk.task15.GenericJava;

import java.util.ArrayList;
import java.util.List;


abstract class Animal
{
	abstract void run();
}


class Dog extends Animal{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog is Running ");
	}
	
}

class Cat extends Animal
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat is Running ");
	}
	
}


 
public class WildCardDemo 
{
	
	
	 public static void runMethod(List<? extends Animal>lists)
	 {
		 for (Animal animal : lists) 
		 {
			//print Data 
			animal.run();
		 }
	 }
	
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Dog> d= new ArrayList<Dog>();
		d.add(new Dog());
		runMethod(d);
		
		
		List<Cat> c= new ArrayList<Cat>();
		c.add(new Cat());
		runMethod(c);
		

	}

}
