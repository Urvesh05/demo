package com.slk.task.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Comparator

public class SortObjectCompator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person3>persons= new ArrayList<Person3>();
		
		persons.add(new Person3("Raman", 22, "Surat", "India", "Gujarat"));
		persons.add(new Person3("Amit", 10, "Mumbai", "India", "MH"));
		persons.add(new Person3("Kamal", 30, "Agra", "India", "UP"));
		persons.add(new Person3("Ganesh", 5, "Indor", "India", "MP"));
		
		
		Collections.sort(persons,new NameSort3());
		System.out.println("Name Sort ==> "+persons);
		
		Collections.sort(persons,new AgeSort3());
		System.out.println("Age Sort ==> "+persons);
		
		Collections.sort(persons,new CitySort3());
		System.out.println("City Sort == > "+persons);

	}

}
