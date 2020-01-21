package com.slk.task.opps;

public class EnacapsulationWriteOnly {
	
	private String collge;
	
	public void setCollege(String college)
	{
		//this.collge=collge;
		System.out.println(collge);
	}
	
	public String getCollege()
	{
		return collge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnacapsulationWriteOnly enacapsulationWriteOnly = new EnacapsulationWriteOnly();
		enacapsulationWriteOnly.setCollege("slk");
		//System.out.println(enacapsulationWriteOnly.getCollege());

	}

}
