package com.slk.task5;

public class PriorityQueueEmployee {
	
	int id;  
	String name;
	public PriorityQueueEmployee(int id,String name) 
	{
		
		  this.id = id;  
		  this.name = name; 
	}
	
	public int getId()
	{
		return id;
	}
	
	public int setId(int id)
	{
		return this.id=id;
	}
	/*
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;

	}*/
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+name;
	}

	
	
}


