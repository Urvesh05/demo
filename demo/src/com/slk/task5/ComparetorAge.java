package com.slk.task5;

import java.util.Comparator;

public class ComparetorAge implements Comparator<ComparetorStudent>{

	@Override
	public int compare(ComparetorStudent s1, ComparetorStudent s2) {
		// TODO Auto-generated method stub
		
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}
		else 
		{
			return-1;
		}
		
		
	}

	

}
