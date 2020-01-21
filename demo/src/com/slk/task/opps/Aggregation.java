package com.slk.task.opps;

public class Aggregation {
	int id;
	String name;
	
	public Aggregation(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
				
	}

}
	class Address1
	{
		String city;
		String state;
		
		//Aggregation HAS-A relation ship with address class
		Aggregation student_details;
		
		public Address1(String city,String state,Aggregation student_details) {
			// TODO Auto-generated constructor stub
			
			this.city=city;
			this.state=state;
			this.student_details=student_details;
					
		}
	}
