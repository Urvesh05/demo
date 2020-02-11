package com.slk.task16.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectConstructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			 
			
				Class c=TestClassReflectConstructor.class;	
				
			   // To get constructor with 2 args(parameter)
			   Constructor<?> constructor = c.getConstructor(int.class,String.class);
			   System.out.println("=========Constartctor Name :========\n");
			   System.out.println("constructor name :" + constructor.toString());
			  
			   /*
			   // Getting constructors of the class
			   System.out.println("\n============Public constractor =========\n");
			   Constructor<?>[] constructors = c.getConstructors();
			   System.out.println("public Constructors - " + Arrays.toString(constructors));
			   
			   System.out.println("\n===========Private Constarctor=======\n");
			   // to get private constructor using getDeclaredConstructor() method
			   constructor = c.getDeclaredConstructor();
			   System.out.println("private constructor " + constructor.toString());
			   */
			  
			   
			   //con Modifier 
			   System.out.println("\n========Modifier ============\n");
			   System.out.println("Modifier : "+Modifier.toString(constructor.getModifiers()));
			   	
			   
			   
			   //getting parameter 
			   System.out.println("\n=======Paremeter ======\n");
			   //Class c2=TestClassReflectConstructor.class;
			   
			 
			    Class<?>[] pType  = constructor.getParameterTypes();
			    
			    for (int i = 0; i < pType.length; i++)
			    {
			     System.out.println("Parameter -- " + pType[i]);
			    }
			   
			   
			   
			  } catch (NoSuchMethodException | SecurityException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }

	}

}
