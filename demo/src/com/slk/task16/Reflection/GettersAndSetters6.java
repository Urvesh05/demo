package com.slk.task16.Reflection;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.util.Arrays;


//Generating Getters And Setters Using Reflection 
public class GettersAndSetters6 {
	
	 private int value;
	 private String name;
	 private boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GettersAndSetters6 gs= new GettersAndSetters6();
		StringBuffer sb = new StringBuffer();
		
		
		Class<?> c= GettersAndSetters6.class;
		
		// Getting fields of the class
		Field[] fields =c.getDeclaredFields();
		//System.out.println("Fields"+ Arrays.toString(fields));
		
		for (Field field : fields)
		{
			String fieldName= field.getName();
			String fieldType= field.getType().getSimpleName();
			
			 System.out.println("Field Name -- " + fieldName);
			 System.out.println("Field Type " + fieldType);
			 
			 
			 gs.createSetter(fieldName, fieldType, sb);
			    
			 gs.createGetter(fieldName, fieldType, sb);
		
		}
		 System.out.println("" + sb.toString());
		

	}
	
	//Generating Getters And Setters Using Reflection 
	private void createSetter(String fieldName, String fieldType, StringBuffer setter)
	
	{
		// TODO Auto-generated method stub
		System.out.println();
		setter.append("public void").append(" set");
		setter.append(GetFieldName(fieldName));
		setter.append("(" +fieldType+" "+fieldName+ "){");
		setter.append("\n\t this."+fieldName+" = "+fieldName+ ";");
		setter.append("\n" + "}" + "\n");
		
		
		
	}

	

	private void createGetter(String fieldName, String fieldType, StringBuffer getter)
	{
		// TODO Auto-generated method stub
		getter.append("public "+fieldType).append((fieldType.equals("boolean")?" is":" get")+GetFieldName(fieldName)+"(){");
		getter.append("\n\treturn "+fieldName+";");
		getter.append("\n"+"}"+"\n");
	}
	
	
	//setName And setVlaue 
	private Object GetFieldName(String fieldName) {
		// TODO Auto-generated method stub
		return fieldName.substring(0,1).toUpperCase()+fieldName.substring(1,fieldName.length());
		
		
		
	}

}







//invoking setter and setter 
//https://netjs.blogspot.com/2017/08/invoking-getters-and-setters-using-reflection-java.html
