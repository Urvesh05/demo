package com.slk.task.opps;

public class This_Keyword   {
	int id;
	String Name;
	float fee;
	
	
	public This_Keyword(int id,String Name,float fee) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.Name=Name;
		this.fee=fee;
		
	}
	
	
	void show() 
	{
		System.out.println("Id "+id+" Name "+Name+" fess "+fee);
	}
	
	public static void main(String[] args) {
		This_Keyword this_Keyword= new This_Keyword(102, "rahul",123);
		this_Keyword.show();
		
	}
}
