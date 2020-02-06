package com.slk.task5.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("karan");// 1 .add elements
		list.add("Ronak");
		list.add("Haresh");
		list.add("Jigar");	
		list.add("Amit");
		
		
		//2. next elements 
		System.out.println("2. Displaying list elements in forward direction :");
		
		ListIterator<String> itretor =list.listIterator();

			while(itretor.hasNext())//check next elements
			{
				System.out.println(itretor.next());//3. Returns the next element in the list and advances the cursor position.
			}
			
			
			//previous elements
			System.out.println();
			System.out.println("3. Displaying list elements in backward direction : "); 
			  
			while(itretor.hasPrevious())//check Previous elements
			{
				System.out.println(itretor.previous());//Returns the previous element in the list and moves the cursor position backwards.
			}
			
			
			//remove operation
			System.out.println("\n 4. remove elements at index");
			System.out.println(list);
			int index=2;
			list.remove(index);
			System.out.println(list);
			
			
			//set() change elements
			System.out.println("\n 5. add new  elements at index");
			list.set(3, "Ganesh");
			System.out.println(list);
	}

}
