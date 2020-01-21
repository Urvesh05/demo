package com.slk.task5;

import java.util.Comparator;

public class TreeSetComparatorId implements Comparator<TreeSetEmployee>
{

	@Override
	public int compare(TreeSetEmployee e1, TreeSetEmployee e2) 
	{
		// Sort By Id
		 if(e1.getId() > e2.getId())
		 {
	            return 1;
	        } 
		 else 
	        {
	            return -1;
	        }
	}

}		

