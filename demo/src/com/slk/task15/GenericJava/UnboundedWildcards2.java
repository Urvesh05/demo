package com.slk.task15.GenericJava;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards2 {
	
	
	public static void unBounded(List<?>list)//all Type (Object)
	{
		for (Object object : list) 
		{
			System.out.println(object);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========Integer======");
		List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(6); 
        integerList.add(3); 
        integerList.add(10);
      
        UnboundedWildcards2.unBounded(integerList);
        
        
        System.out.println("\n========String===========");
        List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        //print(stringList);
       
        
        UnboundedWildcards2.unBounded(stringList);
	}

}
