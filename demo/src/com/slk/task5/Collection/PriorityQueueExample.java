package com.slk.task5.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	
	public static void queue()
	{
		
		PriorityQueue<Integer> priorityQueue =new PriorityQueue<Integer>();
		priorityQueue.add(12);
		priorityQueue.add(5);
		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(13);
		
		
		System.out.println(">>> 1. Add Elements");
		Iterator< Integer> itr=priorityQueue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//2. offer()   Add elements
		System.out.println("\n>>> 2.Offer() Add elemets ");
		priorityQueue.offer(2);//Add elements
		System.out.println(priorityQueue);
		
		
		//3.Remove
		System.out.println("\n>>> 3.remove() >> Remove first (Head) elements");
		priorityQueue.remove();
		System.out.println(priorityQueue);
		
		
		//4. pool
		System.out.println("\n>>> 4.pool() >>Retrieves and removes the head of this queue, or returns null if this queue is empty.");
		priorityQueue.poll();
		System.out.println(priorityQueue);
		
		
		//5.element()
		System.out.println("\n>>> 5.elements() >>Retrieves, but does not remove, the head of this queue,");
		priorityQueue.element();
		System.out.println(priorityQueue);
		
		
		//6.peek()
		System.out.println("\n 6.peek() >>Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.");
		priorityQueue.peek();
		System.out.println(priorityQueue);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueueExample.queue();
	}

}
