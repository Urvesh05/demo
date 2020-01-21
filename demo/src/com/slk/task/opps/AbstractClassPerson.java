package com.slk.task.opps;


public class AbstractClassPerson extends Person
{
	int id;
	public AbstractClassPerson( String name,String gender ,int id) {
		super( name,gender);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		//System.out.println("hello");
		
		
		//if(id == 0)
	}
	
	
	public static void main(String[] args) {
		
		Person person= new AbstractClassPerson("Karan","Male",10);
		//person.get();
		
		System.out.println(person.toString());
		
	}
}