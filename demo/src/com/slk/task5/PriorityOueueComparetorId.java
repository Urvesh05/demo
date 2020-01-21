package com.slk.task5;

import java.util.Comparator;

public class PriorityOueueComparetorId implements Comparable<PriorityQueueEmployee>
{

	@Override
	public int compareTo(PriorityQueueEmployee emp)
	{
		
		return this.getId.compareTo(emp.getId());
	}

	public PriorityOueueComparetorId getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
