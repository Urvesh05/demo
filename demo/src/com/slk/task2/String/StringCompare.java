package com.slk.task2.String;


public class StringCompare {

	//1) String compare by equals() method
	//authentication (by equals() method) (return true or false)
	public static void equals()
	{
				String s1="Karan";
				String s2="Karan";
				
				String ss= new String("Karan");
				
				String s3="Rahul";
				String s4="rahul";
				
				System.out.println(s1.equals(s2));//By equals() method  (true)
				System.out.println(s1.equals(ss));//true
				System.out.println(s1.equals(s3));//false
				
				//equalIgnoreCase()
				System.out.println(s3.equalsIgnoreCase(s4));//equalIgnoreCase() method
				
	}
	
	//2) String compare by compareTo() method
			//sorting (by compareTo() method)  (positive & negative  value return)
			
	public static void compareTo()
	{
		String s5="a";	
		String s6="a";
		
		String s7="b";  
		 
		String ss= new String("Karan");
		
		System.out.println("s1 == s2 "+s5.compareTo(s6));//0 
		System.out.println("s1== ss "+s5.compareTo(ss));
		System.out.println("s1 == s2 "+s7.compareTo(s5));//(because s7 > s5 )  :positive value
		
		System.out.println("s1 == s2 "+s5.compareTo(s7));//(because s5 < s7 )  :negative value
			
		
	}
	
	//3) String compare by == operator
			//reference matching (by == operator)
					
	public static void oprator()
	{
		String s1="karan";
		String s2 ="karan";
		String s3 = new String("Karan");//reference matching (by == operator)
		
		System.out.println(s1==s2);//true (because both refer to same instance)
		System.out.println(s1==s3);//false(because s3 refers to instance created in non-pool) 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("by equals method ");
		StringCompare.equals();
	
		System.out.println("by CompareTo method ");
		StringCompare.compareTo();
		
		System.out.println("Comapre by == oprator");
		StringCompare.oprator();
	}

}
