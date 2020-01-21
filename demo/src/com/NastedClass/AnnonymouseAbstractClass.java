package com.NastedClass;

// an argument so that it can be passed to methods or constructors.

abstract class AnnonymouseAbstractClass {
	
	abstract void getName();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnonymouseAbstractClass an= new AnnonymouseAbstractClass() 
		{
			
			@Override
			void getName() 
			{
				// TODO Auto-generated method stub
				
				System.out.println("Name is Slk");
			}
		};
		an.getName();
	}

}
