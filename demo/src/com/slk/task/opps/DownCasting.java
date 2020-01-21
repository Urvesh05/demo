package com.slk.task.opps;

//child class
public class DownCasting extends DownCasting_Parent{
	
	public void run()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent class reference to create child class object 
		//and child class reference to casting in parent class reference cast in child class call method
		DownCasting_Parent downCasting = new  DownCasting();
		DownCasting downCasting2 = (DownCasting)downCasting;
		downCasting2.run();
	}

}
