package com.slk.task15.GenericJava;

import java.util.ArrayList;
import java.util.List;

public class GenericForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("Jigar");
		list.add("Haresh");
		list.add("Tarun");
		list.add("Lalu");
		
		
		
		//Generic ForLoop
		for (String string : list) 
		{
			
			System.out.println(string);
		}
	}

}
