package com.slk.task16.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrivateMethod7 {
	
	
	private String privateString = null;
	
	
	public PrivateMethod7(String privateString) 
	{
		this.privateString=privateString;
		
	}
	
	//private method 
	 private String getPrivateString()
	 {
		  return this.privateString;
	 }

	 
	 
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		PrivateMethod7 p= new PrivateMethod7("The Private Method ");
		
		Method privateMethod =PrivateMethod7.class.getDeclaredMethod("getPrivateString", null);
		
		System.out.println("======Private method Access=======\n");
		privateMethod.setAccessible(true);
		
		int accessModifier =privateMethod.getModifiers();
		System.out.println("Access Modifiers =>:"+Modifier.toString(accessModifier));
		
		
		String returnValue=(String)privateMethod.invoke(p, null);
		
		System.out.println("Private Method Value =>"+returnValue);

	}

}
