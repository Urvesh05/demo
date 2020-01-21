package com.slk.task.opps;


//BabyDog class extends Dog class (Child class)
public class MultiLevelInheritance3 extends MultilevelInheritance2
{
	
	void sleep()
	{
		//super.run();	
		System.out.println("Sleeping");
		
	}
//	void night()
//	{
//		System.out.println("ok");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiLevelInheritance3 multiLevelInherItance = new MultiLevelInheritance3();
		multiLevelInherItance.eat();
		multiLevelInherItance.run();
		multiLevelInherItance.sleep();
		//multiLevelInherItance.night();

	}

}
