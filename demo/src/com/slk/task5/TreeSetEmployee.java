package com.slk.task5;


public class TreeSetEmployee {
	
	int id; 
	String name;
	
	public TreeSetEmployee(int id,String name) {
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
			
	}
	
	public 	int getId()
	{
		return id;
		
	}
	
	public void setId(int id)
	{
		
		this.id=id;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void setName(String name)
	{
		
		this.name=name;
	}
	/* public String toString(){
	        return "Id: "+this.id+"-- name: "+this.name;
	    }
*/
	
	
}
