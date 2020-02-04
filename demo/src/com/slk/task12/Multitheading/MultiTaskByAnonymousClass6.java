package com.slk.task12.Multitheading;

public class MultiTaskByAnonymousClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AnonymouseClass ExtendsThreadClass (1)  Direct Object Create in This class
		Thread t = new Thread()
				{
					@Override
					public void run()
					{
						// TODO Auto-generated method stub
						System.out.println("Anonymouse Class 1 Running ");
						
						for (int i = 0; i <10; i++) {
							
							System.out.println(i);
						}
					
					}
			
				};
		
				Thread t2 = new Thread()
						{
					
							@Override
							public void run() 
							{
								// TODO Auto-generated method stub
								System.out.println("Anonymouse Class 2 Running ");
								
								for (int i = 0; i <10; i++) 
								{
									
									System.out.println(i*2);
								}
								
							}
					
						};
						
						
						t.start();
						t2.start();
	}

}
