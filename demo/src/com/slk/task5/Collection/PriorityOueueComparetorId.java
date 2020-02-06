package com.slk.task5.Collection;

public class PriorityOueueComparetorId implements Comparable<PriorityQueueEmployee>
{

	@Override
	public int compareTo(PriorityQueueEmployee o) {
		// TODO Auto-generated method stub
		
		if(o.getId()<o.getId())
		{
			return 1;
		}
		else if(o.getId()>o.getId())
		{
			return -1;
		}
		
		return 0;
	}

	
		
		
		//return o1.getId().compareTo(o2.getId());
		
		
		//return o1.getId()-o2.getId();
		// Sort By Id
		
		/*
				 if(o1.getId() > o2.getId())
				 {
			            return 1;
			        } 
				 else 
			        {
			            return -1;
			        }
				*/ 
		


}
