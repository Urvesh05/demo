package com.NastedClass;

public interface AnnonymouseInterface {
	
	void run();
	
	
	public static void main(String[] args) {
		
		
		AnnonymouseInterface annonymouseInterface = new AnnonymouseInterface() 
		{
			
			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				System.out.println("Interface call");
			}

			
		};
		annonymouseInterface.run();
		
		System.out.println(annonymouseInterface.getClass().getName());
	}
}
