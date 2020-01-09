package com.slk.task5;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import javafx.print.Collation;

import java.util.ArrayList;
public abstract class ArryListExampleDemo implements List {


		static int i=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Rahul");
		list.add("karan");
		list.add("Amit");
		
		Collections.sort(list);	
		
		//Different type Display (Print) 
		//System.out.println(list);
		
		// (1) loop
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}*/
		
		//(2) for each loop
		/*for(String i:list)
		{
			System.out.println(i);
		}*/
		
		//(3) while loop
		Iterator<String> iterator =list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(i++ +"."+iterator.next());
		}
		
	}

	

}
