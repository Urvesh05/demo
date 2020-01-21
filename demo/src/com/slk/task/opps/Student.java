package com.slk.task.opps;


//Static Variable class
public class Student {
	
	int id;//instance variable
	String name;
	
	static String college="Gtu";//static variable
		
	
	//static method to change the value of static variable  
	static void change()
	{
		college="Gvp";
	}
	
	
	//static block ( executed before main method ) 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student =new Student();
		student.id=103;
		student.name="Urvesh";
		
		Student student1 = new Student();
		student1.id=104;
		student1.name="Tarun";
		
		//calling change method  
		Student.change();
		
		System.out.println(student.id+" "+student.name+" "+student.college);
		System.out.println(student1.id+" "+student1.name+" "+student1.college);
		

	}

}
