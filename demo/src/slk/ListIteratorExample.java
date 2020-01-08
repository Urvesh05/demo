package slk;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList();
		list.add("abc");
		list.add("abcd");
		list.add("abcde");
		list.add("abcdef");
		System.out.println(list);
		
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		//System.out.println(itr.hasNext());
	}

}
