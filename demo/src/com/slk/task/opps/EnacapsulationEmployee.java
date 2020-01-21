package com.slk.task.opps;


//wrapping variable and method bind in a single unit 
public class EnacapsulationEmployee {
	
	private int id;//data hiding
	private String name;
	
	public int getEmpId() {
		return id;
	}
	
	public String getEmpName() {
		return name;
	}
	
	public void setEmpId(int id)
	{
		this.id=id;
	}	
	
	public void setEmpName(String name) {
		 this.name= name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnacapsulationEmployee enacapsulationEmployee = new EnacapsulationEmployee();
		enacapsulationEmployee.setEmpId(101);
		enacapsulationEmployee.setEmpName("slk");
		
		System.out.println(enacapsulationEmployee.getEmpId()+ " "+enacapsulationEmployee.getEmpName());

	}

}
