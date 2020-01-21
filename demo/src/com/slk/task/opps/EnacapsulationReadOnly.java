package com.slk.task.opps;

public class EnacapsulationReadOnly {
	
	private String college="Slk";  
	//getter method for college  
	public String getCollege(){  
	return college;  
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnacapsulationReadOnly enacapsulationReadOnly = new EnacapsulationReadOnly ();
		System.out.println(enacapsulationReadOnly.getCollege());
		

	}

}
