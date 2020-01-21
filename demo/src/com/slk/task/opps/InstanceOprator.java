package com.slk.task.opps;

public class InstanceOprator extends InstanceOpratorParent{
	
	static void get(InstanceOprator ip)
	{
		if(ip instanceof InstanceOprator)
		{
			System.out.println("ok ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceOpratorParent ip= new InstanceOprator();///downcasting  
		InstanceOprator child = (InstanceOprator)ip;
		InstanceOprator.get(child);
	}

}
