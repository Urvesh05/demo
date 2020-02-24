package com.slk.task.example;

import java.util.Comparator;

public class NameSort3 implements Comparator<Person3>
{

	@Override
	public int compare(Person3 p1, Person3 p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

}
