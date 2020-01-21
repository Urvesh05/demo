package com.slk.task5;

import java.util.Comparator;

public class TreeSetCompratorName implements Comparator<TreeSetEmployee> {

	@Override
	public int compare(TreeSetEmployee e1, TreeSetEmployee e2) {
		// TODO Auto-generated method stub
		 if (e1.getName().compareTo(e1.getName()) > 0)
             return -1;
         else if (e1.getName().compareTo(e1.getName()) < 0)
             return 1;
         else
             return 0;
	}

}
