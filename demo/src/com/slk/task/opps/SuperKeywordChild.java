package com.slk.task.opps;

//Child class
public class SuperKeywordChild extends SuperKeyword {
	
	//parent class call instance variable
	void get()
	{
		// parent class Instance Variable call
		System.out.println(super.name);
			
	}
	
//	//method
		void show()
		{
			
			System.out.println("Child class method");
			
		}
		
		//parent class method call
	void dispay()
	 {
			 super.Show();
		 }
		 
		 //constructor
		 
		 public SuperKeywordChild() {
			 
			 super();
			 //System.out.println("Child class Constructor");
			 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeywordChild superKeywordChild = new SuperKeywordChild();
		
		superKeywordChild.get();//variable
		superKeywordChild.dispay();//method
		
		
				

	}

}
