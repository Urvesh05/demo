package com.slk.task.opps;

//Cat class extends Animal (Child class)
public class HierarchicalInheritance3 extends HierarchicalInheritance {
	
	void sleep()
	{
		
		System.out.println("Sleeping");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchicalInheritance3 hierarchicalInheritance = new HierarchicalInheritance3();
		hierarchicalInheritance.eat();
		hierarchicalInheritance.sleep();
		
		//HirerarchicalInheritance2 hr= new HirerarchicalInheritance2();
		//hr.run();
		
	}

}
