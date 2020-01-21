package slk;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("H");
		list.add("abcd");
		list.add("abcde");
		list.add("abcdef");
		System.out.println(list);
		
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println(itr.hasNext());
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		list.set(3, "Jigar");
		//System.out.println(itr.hasNext());
	}

}
