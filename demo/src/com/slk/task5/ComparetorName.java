package com.slk.task5;

import java.util.Comparator;

public class ComparetorName implements Comparator<ComparetorStudent> {

	@Override
	public int compare(ComparetorStudent o1, ComparetorStudent o2) {
		// TODO Auto-generated method stub
		
		return o1.name.compareTo(o2.name);
	}

	

}
