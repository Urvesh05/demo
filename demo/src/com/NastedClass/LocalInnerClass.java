package com.NastedClass;



public class LocalInnerClass {
	
	private int data=32;
	//final int d=100;//invoke
	void dispaly()
	{
		class LocalClass//method local inner class
		{
			void msg()
			{
				System.out.println(" Data Is "+data);
			}
		}
		
		LocalClass local = new LocalClass();
		local.msg();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalInnerClass outer = new LocalInnerClass();
		outer.dispaly();

	}

}
