package com.slk.task5;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayDemo2 extends ArrayDemo implements Comparator<ArrayDemo>{


	ArrayDemo2(int id, String student_name) {
		super(id, student_name);
		// TODO Auto-generated constructor stub
	}

	public int compare(ArrayDemo e1, ArrayDemo e2){
		  return e1.id.compareTo(e2.id);
		 }
	
	public String toString(){
		  return "StudentIdComparator";
		 }
	
}

	class Test5
	{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayDemo>myList;
		ArrayDemo2 comparator;

		myList = new ArrayList<ArrayDemo>();
		comparator= new ArrayDemo2(0, null);
		
		 myList.add(new ArrayDemo(4, "David"));
		  myList.add(new ArrayDemo(2, "Tom"));
		  myList.add(new ArrayDemo(5, "Rohit"));
		  myList.add(new ArrayDemo(1, "Paul"));
		  myList.add(new ArrayDemo(3, "Vishal"));
		
		  System.out.println("Elements Before Sorting");
		  System.out.println(myList); 
		  myList.sort(comparator);
		  
		  System.out.println("Elements After Sorting");
		  System.out.println(myList); 
	}

}
