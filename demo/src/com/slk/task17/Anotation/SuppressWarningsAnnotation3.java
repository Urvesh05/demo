package com.slk.task17.Anotation;

import java.util.ArrayList;

public class SuppressWarningsAnnotation3 {

	@SuppressWarnings({"checked", "deprecation"})  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj);  

	}

}
