package com.slk.task5;

import java.util.ArrayList;
import java.util.Collections;

public class SortExampleComparable implements  Comparable<SortExampleComparable>

	{
		public Integer id;
		public String name;
		
		SortExampleComparable(int id,String name) 
		{
			this.id=id;
			this.name=name;
		}
		
		//Compare Method
		public int compareTo(SortExampleComparable s) 
		{
			//return name.compareTo(s.name);	
			return id.compareTo(s.id);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<SortExampleComparable> arrayList=new ArrayList<SortExampleComparable>();
		arrayList.add(new SortExampleComparable(100,"Jigar"));
		arrayList.add(new SortExampleComparable(99,"Hari"));
		arrayList.add(new SortExampleComparable(102,"Abc"));
	    
		System.out.println("=====Sort by Id====");
		Collections.sort(arrayList);
		
		for(SortExampleComparable ss:arrayList)
		System.out.println(ss.id);
	}

}
