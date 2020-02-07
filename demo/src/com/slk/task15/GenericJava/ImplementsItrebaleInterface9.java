package com.slk.task15.GenericJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee
{
	int id;
	String name;
	
	public Employee(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

//implements Iterable Interface ( Implement Iterable<T> interface.)
public class ImplementsItrebaleInterface9 implements Iterable<Employee>//class Name (<class name>)
{
	List<Employee> emp;//class Variable 
	
	public ImplementsItrebaleInterface9(List<Employee> emp) 
	{
		// TODO Auto-generated constructor stub
		this.emp=emp;
		
	}

	@Override
	public Iterator<Employee> iterator() 
	{
		// TODO Auto-generated method stub
		return emp.iterator();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp= new ArrayList<Employee>();
		emp.add(new Employee(12, "karan"));
		emp.add(new Employee(11, "lalu"));
		
		ImplementsItrebaleInterface9 imp= new ImplementsItrebaleInterface9(emp);//object creation 
		
		for (Employee employee : imp)
		{
			System.out.println(employee.getId()+" "+employee.getName());
		}
	}

}
















//https://www.javabrahman.com/corejava/implementing-iterable-interface-in-java-to-enable-for-each-loop-based-iteration/
