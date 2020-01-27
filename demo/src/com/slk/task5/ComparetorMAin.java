package com.slk.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparetorMAin {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<ComparetorStudent> al=new ArrayList<ComparetorStudent>();
		
		al.add(new ComparetorStudent(101,"Vijay",23));  
		al.add(new ComparetorStudent(106,"Ajay",27));  
		al.add(new ComparetorStudent(105,"Jai",21)); 
		
		System.out.println("\n===========Sorting by Name===========");
		
		Collections.sort(al,new ComparetorName());
		for(ComparetorStudent s:al)
		{
			System.out.println(s.rollno+" "+s.name+" "+s.age );
		}
		
		
		System.out.println("\n=========Sorting by age============="); 
		Collections.sort(al,new ComparetorAge());
		for(ComparetorStudent ag:al)
		{
			System.out.println(ag.rollno+" "+ag.name+" "+ag.age );
		}

	}

}
