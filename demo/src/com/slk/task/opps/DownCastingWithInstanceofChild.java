package com.slk.task.opps;

//child class extends to parent class
public class DownCastingWithInstanceofChild extends DownCastingWithInstanceofParent{
	
	public void show(DownCastingWithInstanceofParent downCastingWithInstanceofParent) 
	{  
	    if(downCastingWithInstanceofParent instanceof DownCastingWithInstanceofChild)
	    {  
	    	//DownCastingWithInstanceofChild d =(DownCastingWithInstanceofChild)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	    } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DownCastingWithInstanceofParent downCastingWithInstanceofParent = new DownCastingWithInstanceofChild();
		
		DownCastingWithInstanceofChild downCastingWithInstanceofChild2 = (DownCastingWithInstanceofChild)downCastingWithInstanceofParent;
		downCastingWithInstanceofChild2.show(downCastingWithInstanceofParent);

	}

}
