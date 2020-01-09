package com.slk.task5;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("karan");
		list.add("Ronak");
		list.add("Haresh");
		list.add("Jigar");	
		list.add("Amit");
		
		ListIterator<String> itretor =list.listIterator();

			while(itretor.hasNext())
			{
				System.out.println(itretor.next());
			}
	}

}
