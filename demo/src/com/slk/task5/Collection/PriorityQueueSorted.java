package com.slk.task5.Collection;

import java.util.PriorityQueue;

public class PriorityQueueSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<PriorityQueueEmployee> priorityQueue = new PriorityQueue<PriorityQueueEmployee>();
		priorityQueue.add(new PriorityQueueEmployee(101));
		priorityQueue.add(new PriorityQueueEmployee(100));
		
		priorityQueue.add(new PriorityQueueEmployee(102));
		priorityQueue.add(new PriorityQueueEmployee(99));
		priorityQueue.add(new PriorityQueueEmployee(106));
		priorityQueue.add(new PriorityQueueEmployee(103));
		//System.out.println(priorityQueue);
	
		while(true)
		{
			PriorityQueueEmployee p =	priorityQueue.poll();
			System.out.println(p);
			
			if(p==null)
			
			{
			break;
			}
		}
		
		
	}

}
