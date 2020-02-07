package com.slk.task15.GenericJava;

class MyClass<T>//like( String, Integer, and Class)parameter 
{
	T obj;
	
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
		
	}
	
	
}


public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyClass<Integer> m= new MyClass();//MyClass object creation time (Type Define) ex.int,str; 
		m.add(new Integer(54));
		
		MyClass<String> s= new MyClass();
		s.add(new String("Rahul"));
		
		
		
		MyClass<Integer> m2 = new MyClass();
		m2.add(55);
		
		MyClass<String> s2 = new MyClass();
		s2.add("jigu");
		
		System.out.println(m.get());
		System.out.println(s.get());
		System.out.println(m2.get());
		System.out.println(s2.get());
		
		
	}

}
