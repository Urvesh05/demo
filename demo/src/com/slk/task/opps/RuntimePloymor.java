package com.slk.task.opps;

//Animal   (hierarchical inheritance)
public class RuntimePloymor {
	
	public void run()
	{
		System.out.println("running polymore");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 RuntimePloymor runtimePolymor;
		
		runtimePolymor = new RuntimePolymorA();
		
		runtimePolymor.run();
		
		runtimePolymor = new RuntimePolymorB();
		runtimePolymor.run();
		
	
	}

}
