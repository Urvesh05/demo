package com.slk.task.example;

import java.util.Comparator;

public class CitySort3  implements Comparator<Person3>
{

	@Override
	public int compare(Person3 o1, Person3 o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}
