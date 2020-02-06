package com.slk.task5.Collection;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Predicate;

public class ArryListExample2 {
	
	//add() method
	public static void Adddata()
	{
		int i=1;
		
		ArrayList<String> list= new ArrayList<String>(3);
		
		// 1. Add()
		System.out.println(">>>>  1.Add Data");
		list.add("Karan");
		list.add("Rohan");
		list.add("Amit");
		list.add("Hitesh");
		list.add("Ganesh");
		list.add("Zarin");
		list.add("Hitesh");
		
		
		
		//  2. addAll()
		System.out.println(">>>>  2.AddAll Data");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("jay");
		list2.add("Hiren");
		list2.add("Hitesh");
		list2.add("Haresh");
		list2.add("Hiren");
		list2.add("Hitesh");
		
		//list.add(index, element);
		list.addAll(list2);//addAll data
		
		System.out.println("\nAll Data Diplay");
		for(String s:list)
			{
				System.out.println(i++ +"."+s);
			}
			
		//  3. Clear data
		System.out.println(">>>> 3.Clear Data");
		/*list.clear();
		System.out.println(list);
		*/
		
		// 4. clone Method 
		System.out.println(">>>> 4.Clone Data ");
		Object cloneList;
		
		cloneList=list.clone();
		System.out.println(cloneList);
		
		//5. Contains 
		System.out.println(">>>>  5.Contains Data Check");
		System.out.println(list.contains("Hiral"));//true or false
		
		//6. IndexOf 
		System.out.println(">>> 6.Index Of ");
		System.out.println(list.indexOf("Zarin"));
		
		// 7. ensureCapacity()
		System.out.println(">>> 7.ensureCapacity ");
		System.out.println("Before Add Data "+list);
		list.ensureCapacity(10);
		list.add("Raku");
		System.out.println("After Add data  "+list);
		
		//8.forEach()
        System.out.println(">>> 8.forEach() method reference--------");  
		list.forEach(System.out::println);
		
       /* System.out.println(">>> 8.forEach() lambda expression-------");  
		list.forEach(lists -> System.out.println(lists));//-Iterating by passing lambda expression
		*/
		
		//9.Get() Method
		System.out.println(">>> 9.Get Data At Position ");
		String s1 = list.get(4);
		System.out.println(s1);
		
		// 10. Set() Change Data 
		System.out.println(">>> 10.set Data ");
		System.out.println("Old Data    "+list);
		list.set(5, "Urvesh");
		System.out.println("Change Data "+list);
		
		//11.last IndexOf
		System.out.println(">>> 11.Last Index Of ");
		int lastIndex=list.lastIndexOf("Ganesh");
		System.out.println(lastIndex);
		
		lastIndex =list.lastIndexOf("Abc");
		System.out.println(lastIndex);
		
		//12. ListIterator() Method
		System.out.println(">>> 12. List Iterator  next & previose");
		System.out.println(">>>  Forward List");
		ListIterator<String> itr =list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(">>>  Backward List");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		//12. ListIterator()  Add/Remove
		System.out.println(">>> 12. List Iterator Add/Remove  ");
		ListIterator< String >listitr=list.listIterator();
		
		System.out.println("----Show 0 index data---- "+listitr.next());
		System.out.println("----Show 1 index data---- "+listitr.next());//2nd position after add new data
		listitr.add("tarun");//add new data
		//list.add("tara");//Fail-fast
		System.out.println("----Add data 2nd position----"+list);
		
		//remove()
		System.out.println("\n----Remove All data.----");
		System.out.println("----Previose data---- "+listitr.previous());
		//System.out.println(listitr.next());
		//System.out.println(listitr.next());
		listitr.remove();//remove all data
		System.out.println("----Remove All Data--- "+list);
		//System.out.println(listitr.next());	
		
		//13. Remove ()
		System.out.println("\n>>> 13.---Before Remove Data----\n"+list);
		list.remove(5);
		System.out.println("\n---After Remove Data 5th Position---"+list);
		
		System.out.println("\n---Before Remove Data----"+list);
		list.removeAll(Collections.singleton("Hiren"));
		System.out.println("\n---Similar Type Data Remove---- "+list+"\n");// Similar data removed
		
		//14.RemoveIf()
		System.out.println("\n>>> 14.Remove if");
		System.out.println(list);
		
		 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		 numbers.removeIf(number ->number%2==0);
		 System.out.println(numbers);
		
		//15. retainAll() method (remove all elements)
		System.out.println("\n>>> 15.Retail All ");
		 list2.retainAll(Collections.singleton("Hitesh"));
		 System.out.println(list2);
		
		//16. Sort data
		 System.out.println("\n>>> 16.Sort Data ");
		Collections.sort(list2);
		System.out.println(list2);
		
		//17. spliterator()
		System.out.println("\n>>> 17. Spliterator ");
		System.out.println(list);
		Spliterator<String> mySpliterator=list.spliterator();//one column Data Show	
		mySpliterator.tryAdvance(d -> System.out.println(d));
		mySpliterator.tryAdvance(d -> System.out.println(d));
		
		mySpliterator.forEachRemaining(d -> System.out.println(d));//All Data Show
		//System.out.println(mySpliterator.characteristics());	
		
		//18.SubList
		System.out.println("\n>>> 18.Sublist--");
		System.out.println(list);
		ArrayList<String> newSublist = new ArrayList<String>(list.subList(1, 4));
		System.out.println(newSublist);
		
		//19 toArray()
		System.out.println("\n >>> 19.Convert to Array");
		Object[]array = list.toArray();
		System.out.println(Arrays.toString(array));
		
		for(Object o:array)
		{
			String s =(String)o;
			System.out.println(s);
		}
		
		
		//String[] array2=list.toArray(new String[list.size()]);
		//System.out.println(Arrays.toString(array2));
		
		//20 trimToSize() Method
		System.out.println("\n>>> 20. trimToSize");
		//System.out.println(list);
		
		list.trimToSize();//current Size of array
		for(String s11:list)
		{
			System.out.println(s11);
		}
		
		// 21. replaceAll()
		System.out.println("\n>>> 21.replaceAll ");
		ArrayList<String> alphabets = new ArrayList<String>(Arrays.asList("A","B","c"));
		System.out.println(alphabets);
		alphabets.replaceAll(e->e.toLowerCase());
		System.out.println(alphabets);
		
		Collections.replaceAll(list, "Haresh", "fana");	
		System.out.println(list);
		
		
	}

	private static ListIterator hasNext() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArryListExample2.Adddata();
		
	}

}
