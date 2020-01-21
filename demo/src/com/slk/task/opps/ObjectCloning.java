package com.slk.task.opps;

import java.lang.Object;

public class ObjectCloning implements Cloneable{
	
	int id;
	String name;
	
	//Create Contractor
	 ObjectCloning(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 //return Cloneable class(super class)
	 public Object clone()throws CloneNotSupportedException
	 {
		return super.clone();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
			ObjectCloning objectCloning = new ObjectCloning(100,"Slk");
			ObjectCloning objectCloning2=(ObjectCloning)objectCloning.clone();
			
			System.out.println("Id "+objectCloning.id+" Name "+objectCloning.name);
			
			System.out.println("Duplicate Id "+objectCloning2.id+" Name "+objectCloning2.name);
		
		}
		catch(CloneNotSupportedException c) {}
		
	}

}
