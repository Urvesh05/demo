package com.slk.task.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortObjectComprable3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		List< Emplpyee> emplpyees = new ArrayList<Emplpyee>();// int sort 
		emplpyees.add(new Emplpyee("Haresh", 12, "Rajkot"));
		emplpyees.add(new Emplpyee("Amar", 30, "Narmda"));
		emplpyees.add(new Emplpyee("Umesh", 20, "Bavnagar"));
		
		Collections.sort(emplpyees);
		System.out.println(emplpyees);//age sort 
		

		/*
		//Name Sorting 
		Emplpyee[] employees = {new Emplpyee("Rahul", 12, "surat"),new Emplpyee("Jitu", 23, "rajkot")};
		        
		
		System.out.println("Employee array before sorting: " + Arrays.toString(employees));
		
		Arrays.sort(employees);
		
		System.out.println("Employee array after sorting: " + Arrays.toString(employees));
	*/
	}

}
