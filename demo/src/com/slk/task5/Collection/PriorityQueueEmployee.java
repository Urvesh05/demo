package com.slk.task5.Collection;

public class PriorityQueueEmployee implements Comparable<PriorityQueueEmployee>{
	
	
	int id;  
	//String name;
	
	PriorityQueueEmployee(int id) 
	{
		
		  this.id = id;  
		 // this.name = name; 
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PriorityQueueEmployee [id=" + id + "]";
	}

	@Override
	public int compareTo(PriorityQueueEmployee o) {
		// TODO Auto-generated method stub
		
		
		return this.getId().compareTo(o.getId());
		/*if(o.getId()<o.getId())
		{
			return 1;
		}
		else if(o.getId()>o.getId())
		{
			return -1;
		}
		
		return 0;*/
	}

	
}


