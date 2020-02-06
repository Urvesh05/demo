package com.slk.task5.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	
	static int i=1;
	
	public static void linkedList()
	{
		LinkedList< String> list= new LinkedList<String>();

		//add()
		System.out.println(">>>>  1.Add Data");
		list.add("Karan");
		list.add("Chirag");
		list.addFirst("First");//addFirst
		
		//  2. addAll()
		System.out.println(">>>>  2.AddAll Data");
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("jaydeep");
		list2.add("Hiren");
		list2.addLast("Last");//addLast
		
		//list.add(index, element);
				list.addAll(list2);//addAll data
			
				
				System.out.println("\nAll Data Diplay");
				for(String s:list)
					{
						System.out.println(i++ +"."+s);
					}
		
				//3.remove()
				System.out.println("\n>>>  3.Remove data ");
				/*System.out.println("3.>>> remove ");
				list.remove(2);
				list.remove("Hiren");
				System.out.println(list);
				*/
				
				//Remove all data
				/*
				list.removeAll(list);
				System.out.println();		
				*/
				//Remove first/Last data

				/*list.removeFirst();
				list.removeLast();
				*/
				
				
				//4. Descending Order 
				System.out.println("\n>>>  4.Reverse Order");
				Iterator<String> descenting=list.descendingIterator();
				
				while(descenting.hasNext())
				{
					System.out.println(descenting.next());
				}
		
				
				// 5.element()(retrieve first element) of this list.
				System.out.println("\n>>> 5. first elements show");
				String s1= list.element();
				System.out.println(s1);
				 
				
				//6.get() elements
				System.out.println("\n>>> 6.get elements & First ,Last  ");
				//list.get(2);
				//System.out.println(list);
				System.out.println(list.getFirst());
				System.out.println(list.getLast());
				
				
				//set 
				System.out.println("\n>>> -- set elements");
				System.out.println(list.set(4, "Hardip"));
				
				
				//7. indexOf()
				System.out.println("\n>>> 7.IndexOF() Define Index And Last Index");
				System.out.println(list.indexOf("jaydeep"));
				System.out.println(list.lastIndexOf("Last"));
				
				
				//8.offer()  (offering a new element )
				System.out.println("\n>>> 8.offer ,offerfirst offerlast");
				list.offer("Guajarat"); // adds element at tail(last).
				
				System.out.println(list);
				list.offerFirst("Offer First");//add first
				list.offerLast("Offer Last");//add last 
				System.out.println(list);
				
				
				
				// 9. peek() retrive elements do not remove
				System.out.println("\n>>> 9. peek(), peekFirst(),peekLast() Retrieve");
				System.out.println(list.peek());
				System.out.println("Retrieve First --> "+list.peekFirst());
				System.out.println("Retrieve Last --> "+list.peekLast());
				
				
				
				//10 poll() Retrieve and removed
				System.out.println("\n>>>> 10.poll() , pollFirst() ,pollLast() retrieve and remove");
				System.out.println(list.poll());
				System.out.println(list.pollFirst());
				System.out.println(list.pollLast());
				System.out.println(list);
				
				
				
				//11.pop() 
				System.out.println("\n>>> 11.pop() Retrieve and Remove First elements");
				System.out.println(list.pop());
				
				
				
				//12.push
				System.out.println("\n>>>12.push() Add first elements");
				list.push("India");
				System.out.println(list);
				
				
				
				//13.size
				System.out.println("\n>>>13.List size");
				System.out.println(list.size());
				
				
				/*
				//14 to array()
				System.out.println("\n>>> 14.object to Array() ");
				String []arr=new String[10];
				arr=(String[]) list.toArray(arr);
				System.out.println(Arrays.toString(arr));
				
				*/
				
		/*ListIterator< String> listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}*/
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListExample.linkedList();
		
	}

}
