package com.slk.task.opps;

abstract class Person {
	
	private String name;
	private String gender;

	public Person( String name,String gender) {

		this.gender = gender;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person name = " + name +" gender = " +gender +" ";
	}
	abstract void work();
}
