package com.slk.task15.GenericJava;

public class ClassObjectTypeDemo {
	
	/*
	public static <T> T getInstance(Class<T> theClass) 
			throws InstantiationException, IllegalAccessException
	{
		return theClass.newInstance();
		
	}
	*/
	public void name(Class<?>getClass) {
		//System.out.println(ClassObjectTypeDemo.class);
		
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
	
		ClassObjectTypeDemo d= new ClassObjectTypeDemo();
		Class<?> theClass = null;
		d.name(theClass);
		
		
		System.out.println(d);
		
	}

}

