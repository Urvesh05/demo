package com.slk.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExampleComparator

{
	public Integer id;
	public String name;
	
	SortExampleComparator(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id	="+id+" +name = "+name+"]"; 
	}
	*/
	
	
	//Comparator Method  Sort By Id
	public static Comparator<SortExampleComparator> sortId =new Comparator<SortExampleComparator>() 
	{

		@Override
		public int compare(SortExampleComparator s1, SortExampleComparator s2) 
		{
			// TODO Auto-generated method stub
			int num=s1.getId();
			int num2=s2.getId();
			
			return num-num2;
			//return num2-num;//descending Order
		}
		
		};
		
		//Comparator Method  Sort By Name
		public static Comparator<SortExampleComparator> sortName =new Comparator<SortExampleComparator>() 
		{

			@Override
			public int compare(SortExampleComparator s1, SortExampleComparator s2) 
			{
				String name1 = s1.getName();
				String name2 =s2.getName();
				return name1.compareTo(name2);
				//return name2.compareTo(name1);//descending Order
				
			}
			
			};
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<SortExampleComparator> arrayList=new ArrayList<SortExampleComparator>();
		arrayList.add(new SortExampleComparator(100,"Jigar"));
		arrayList.add(new SortExampleComparator(10,"Hari"));
		arrayList.add(new SortExampleComparator(102,"Kabir"));
	    
		
		
		System.out.println("=====Sort by Id====");
		Collections.sort(arrayList,SortExampleComparator.sortId);
		
		for(SortExampleComparator sss:arrayList)
		{
			System.out.println(sss.id);
		}
		
		
		System.out.println("=====Sort by Name====");
		Collections.sort(arrayList,SortExampleComparator.sortName);
		//System.out.println(arrayList);
		
		for(SortExampleComparator sss:arrayList)
		{
			System.out.println(sss.name);
		}
	
		
	}

}
