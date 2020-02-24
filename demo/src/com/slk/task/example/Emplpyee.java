package com.slk.task.example;

public class Emplpyee implements Comparable<Emplpyee>
{
	
	private String name;
	private int age;
	private String ciry;
	
	
	
	public Emplpyee(String name, int age, String ciry) {
		super();
		this.name = name;
		this.age = age;
		this.ciry = ciry;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCiry() {
		return ciry;
	}



	public void setCiry(String ciry) {
		this.ciry = ciry;
	}



	@Override
	public String toString() {
		return "Sort age  [name=" + name + ", age=" + age + ", ciry=" + ciry + "]";
	}



	@Override
	public int compareTo(Emplpyee o) {
		// TODO Auto-generated method stub
		//return this.age-o.age;
		
		//or age sorting 
		if(age==o.age)
		{
			return 0;
		}
		else if (age>o.age) {
			
			return 1;
		}
		else 
		{
			return -1;
		}
		
		//name sorting 
		// return this.name.compareTo(o.name);
	}
	
	
	
	

}
