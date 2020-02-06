package com.slk.task5.Collection;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {
	
	
	public static void addRemove()
	{
		PriorityQueue<Integer> priorityQueue =new PriorityQueue<Integer>();
		
		
		// Add items to a Priority Queue (ENQUEUE)Rear
		priorityQueue.add(204);
		priorityQueue.add(452);
		priorityQueue.add(345);
		priorityQueue.add(532);
		
		System.out.println("Add "+priorityQueue);
		
		 // Remove items from the Priority Queue (DEQUEUE)Front
		
		while(!priorityQueue.isEmpty())
		{
			System.out.println("\nRemove "+priorityQueue.remove());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueueExample2.addRemove();

	}

}
