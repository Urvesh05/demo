package com.slk.task.example;

public class Person3 {
	
	private String name;
	private int age;
	private String city;
	private String country;
	private String state;
	
	
	public Person3(String name, int age, String city, String country, String state)
	{
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
		this.state = state;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() 
	{
		return "Sort By [name=" + name + ", age=" + age + ", city=" + city + ", country=" + country + ", state=" + state+"]\n";
	}
	

}
