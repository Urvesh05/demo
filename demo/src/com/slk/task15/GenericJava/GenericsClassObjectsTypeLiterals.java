package com.slk.task15.GenericJava;

public class GenericsClassObjectsTypeLiterals 
{
	
	public void name(Class<?>getClass) {
		System.out.println(Object.class);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericsClassObjectsTypeLiterals s= new GenericsClassObjectsTypeLiterals();
		Class<?> getClass = null;
		
		s.name(getClass);
		
		System.out.println(s+"\n");
	
	}

}
