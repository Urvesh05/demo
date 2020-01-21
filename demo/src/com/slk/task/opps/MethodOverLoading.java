package com.slk.task.opps;

//Method Over Loading  (Number of Arguments)
public class MethodOverLoading {
	
	//Number of Method are same but Different Parameter(signature)
	public int Over(int i,int j)
	{
		return i+j;
	}
	
	//Changing data type of argument
	
	public int Over(int i,int j,int k)
	{
		return i+j+k;
	}
	
	
	public double Over(double i,double j)
	{
		return i+j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading methodOverLoading = new MethodOverLoading();
		
		System.out.println(methodOverLoading.Over(20, 20));
		System.out.println(methodOverLoading.Over(10, 20, 30));
		System.out.println(methodOverLoading.Over(10.2, 20.4));

	}

}
