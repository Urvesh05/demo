package com.slk.task5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<TreeSetEmployee> treeSet = new TreeSet<TreeSetEmployee>(new TreeSetComparatorId());
		treeSet.add(new TreeSetEmployee(12, "kamal"));
		treeSet.add(new TreeSetEmployee(11, "ami"));
		treeSet.add(new TreeSetEmployee(10, "ratan"));
		
		 System.out.println("======Sort By Id=======");
		 Iterator<TreeSetEmployee> it = treeSet.iterator();
         while (it.hasNext())
         {
             System.out.println(it.next().getId());
         }
         
       /*  
        System.out.println("=======Sort By Name=======");
        TreeSet<TreeSetEmployee> treeSet1 = new TreeSet<TreeSetEmployee>(new TreeSetCompratorName());
 		treeSet1.add(new TreeSetEmployee(12, "kamal"));
 		treeSet1.add(new TreeSetEmployee(11, "ami"));
 		treeSet1.add(new TreeSetEmployee(10, "ratan"));
 		treeSet1.add(new TreeSetEmployee(15, "Hari"));
         

		 Iterator<TreeSetEmployee> it1 = treeSet1.iterator();
         while (it1.hasNext())
         {
             System.out.println(it1.next().getName());
         }
        
		*/
		
	}

}
