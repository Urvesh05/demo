package com.slk.task16.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PrivateField7 {
	
	
	public int i=100;
	
	private String i2;
	
	public PrivateField7(String i2)
	{
		// TODO Auto-generated constructor stub
		this.i2=i2;
	}

	
	
	public PrivateField7(int i) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		//PrivateFieldAndMethod7 p = new PrivateFieldAndMethod7();
			
		Class c= PrivateField7.class;
		
		
		//public Field
		Field[] fields=c.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
			
		}
		
		//We can use getDeclaringClass() of field object to get the class declaring the field.
		Field  f=c.getField("i");
		System.out.println("class Name =>"+f.getDeclaringClass().getCanonicalName());
		
		
		//declared field type,
		System.out.println("Public Fields type => :"+f.getType());
		
		
		//private Fields Access
		System.out.println("\n=======Private Fields Access=====");
		PrivateField7 p =new PrivateField7("This is Private fields");
		Field f2=PrivateField7.class.getDeclaredField("i2");
		
		f2.setAccessible(true);
		
		int accessModifier =f2.getModifiers();
		System.out.println("Access Modifiers of the variable =:"+Modifier.toString(accessModifier));
		
		String fieldValue =(String)f2.get(p);
		System.out.println("field Vlue =>"+fieldValue);
		
	}

}
