package slk;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Predicate;

public class ArryListExample {
	
	//add() method
	public static void Adddata()
	{
		
		int i=1;	
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		// 1. Add()
		System.out.println(">>>>  1.Add Data");
		list.add("Karan");
		list.add("Rohan");
		list.add("Amit");
		list.add("Hitesh");
		
		System.out.println(list.size());
		System.out.println("\nAll Data Diplay");
		for(String s:list)
			{
				System.out.println(i++  +"." +s);
			}
	
		//Clone data
		ArrayList<String> cloneData = (ArrayList<String>) list.clone();
		
		System.out.println("\n >>> 2.Clone Data\n"+cloneData);
		
		
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArryListExample.Adddata();
		
	}

}
