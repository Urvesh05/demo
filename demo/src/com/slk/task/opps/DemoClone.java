package com.slk.task.opps;
import java.lang.Object;
public class DemoClone  implements Cloneable {
	
	int dRollNo;
	String dName;
	
	public DemoClone(int dRollNo , String dName)
	{
		this.dRollNo= dRollNo;
		this.dName=dName;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			DemoClone demoClone = new DemoClone(11, "slk");
			DemoClone demoClone2=(DemoClone)demoClone.clone();
			
			System.out.println(demoClone.dName+ " "+demoClone.dRollNo);
			System.out.println(demoClone2.dName+" "+demoClone2.dRollNo);
			
		}catch (CloneNotSupportedException e) {
			
		}
	}

}
