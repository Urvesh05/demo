package com.slk.task2.String;

public class StringClassMethods {

	
	//(1)toUpperCase() toLowerCase()
	
	static String s= "computer";
	
	public static void upperCaseLoweCase() 
	{
		String s= "computer";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}
	
	//(2) trim()
	public static void trim()
	{
		String s1= " Ronak ";
		System.out.println(s1);
		System.out.println(s1.trim());
	}
	
	//(3) startWith(prefix) & endsWith(suffix)
	
	public static void startWithendsWith()
	{
		 System.out.println(s.startsWith("co"));
		 System.out.println(s.endsWith("te"));
	}
	
	//(4)charAt() method
	
	public static void charAt() {
		 System.out.println(s.charAt(3));
	}
	
	 //(5)String length() method
	
	public static void length() {
		 System.out.println(s.length());
	}
	
	 //(6) intern() method (reference and value to another reference provide)
	public static void intern()
	{
		 
		  String s3=new String("Sachin"); 
		  //System.out.println(s3.hashCode());
		  String s4=s3.intern();
		 // System.out.println(s3.hashCode());
		  System.out.println(s4);
		  
		    
			 /* String str1=new String("Hello World");  
			  String str2="Hello World";  
			  String str3="hello world";
				
				System.out.println(str1.intern()==str2); //both are same with intern
				System.out.println(str1==str2); //both are different without intern
				System.out.println(str1.intern()==str3); //intern is case sensitive  
				*/
			  
		 
	}
	
	//(7) valueOf() convert data type to string 
	
	public static void valueOf()
	{
		int a=10;
		String s = String.valueOf(a);
		System.out.println(s+10+10);
	}
	
	//(8)replace() method
	
	public static void replace()
	{
		String sa="Computer Science in java";
		String replaceString =sa.replace("java", "php");//replace java to php
		System.out.println(replaceString);
	}
	
	
	//(9) String format()
	public static void stringFormat()
	{
		String name="java";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434); //float 
		String sf3=String.format("value is %d",300);//returns int   
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);  
	}
	
	//(10)Substring()	(starting index,end index)
	
	public static void subString()
	{
		String s="Gujarat Technology";
		String sub= s.substring(3, 10);
		System.out.println(sub);
	}
	
	//(11)contains() //search index to found string to return true 
	
	public static void contains()
	{
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
	}
	
	//(12)String join() method 
	
	public static void join()
	{
		String s= String.join("-","java","php","html");
		System.out.println(s);
	}
	
	//(13)Equal() method
	
	public static void eqaul()
	{
		  	String s1 = "java";    
	        String s2 = "java";    
	        String s3 = "Html";  
	        System.out.println(s1.equals(s2)); // True because content is same    
	        if (s1.equals(s3)) {  
	            System.out.println("both strings are equal");  
	        }else System.out.println("both strings are unequal");     
	   
	}
	//(14)isEmpty() method
	
	public static void empty()
	{
		String s1="";  
		String s2="java";  
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty()); 
	}
	
	//(15)concat() method 
	public static void concat()
	{
		 	String str1 = "Hello";  
	        String str2 = "Java";  
	        String str3 = "Reader";  
	        // Concatenating one string   
	        String str4 = str1.concat(str2);          
	        System.out.println(str4);  
	        // Concatenating multiple strings  
	        String str5 = str1.concat(str2).concat(str3);  
	        System.out.println(str5); 
	}
	
	//(16)split() method (regular Expression )
	
	public static void split()
	{
		String str = new String("Hello/my/Friends");//splits the string based on / 
		System.out.println(str);
		String[] arr=str.split("/");//Array to return string represent 
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		/*String s1="java string split method by java";  
		String[] words=s1.split("\\s");
		//using java foreach loop to print elements of string array  
		for(String w:words)
		{  
			System.out.println(w); 
		}*/
	}
	
	//(17) indexOf() method
	public static void indexOf()
	{
		  String s1 = "This is indexOf method"; 
		  System.out.println(s1.indexOf("f"));//Returns the index of this substring   
		  //System.out.println(s1.indexOf("f",13)); //Returns the index of this char 
		  
		 /* String str1 = new String("Hello World");
	      String str2 = new String("World");
		  
		  System.out.println("Index found");
		  System.out.println(str1.indexOf(str2));
		  */
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(">>>> toUpperCase() toLowerCase()");
		StringClassMethods.upperCaseLoweCase();
		
		System.out.println(">>>> trim() method");
		StringClassMethods.trim();
		
		System.out.println(">>>>  startWith(prefix) & endsWith(suffix)");
		StringClassMethods.startWithendsWith();
		 
		 System.out.println(">>>> charAt() method");
		 StringClassMethods.charAt();
		 
		 System.out.println(">>>> Length() method");
		 StringClassMethods.length();
		
		 System.out.println(">>> intern() method");
		 StringClassMethods.intern();

		 System.out.println(">>> valueOf() method");
		 StringClassMethods.valueOf();
		
		 System.out.println(">>> replace() method");
		 StringClassMethods.replace();
		
		 System.out.println(">>> format() method");
		 StringClassMethods.stringFormat();
		
		 System.out.println(">>> substring() method");
		 StringClassMethods.subString();
		 
		 System.out.println(">>> contains() method");
		 StringClassMethods.contains();
		 
		 System.out.println(">>> join() method");
		 StringClassMethods.join();
		 
		 System.out.println(">>> equals() method");
		 StringClassMethods.eqaul();	
		 
		 System.out.println(">>> isEmpty() method");
		 StringClassMethods.empty();
		 
		 System.out.println(">>> equals() method");
		 StringClassMethods.eqaul();
		
		 System.out.println(">>> concat() method");
		 StringClassMethods.concat();	
		
		 System.out.println(">>> split() method");
		 StringClassMethods.split();	
		 
		 System.out.println(">>> indexOf() method");
		 StringClassMethods.indexOf();	
		
		
		 
	}

}
