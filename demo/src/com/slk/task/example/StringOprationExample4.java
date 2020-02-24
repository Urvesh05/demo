package com.slk.task.example;

public class StringOprationExample4 {
	
	public static void stringToChar() 
	{
		String s="Jai Hind";
		
		System.out.println("------String to Char------");
		char[] c =s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			
			
			System.out.println("char At "+i+" index is => "+c[i]);
		}
	}
	
	public static void charToString()
	{
		
		System.out.println("\n-------Char to String------- ");
		
		char[] c1= {'J','a','y','H','i','n','d'};
		
		String s = new String(c1);
		
		System.out.println(s);
		
		
		//String s1= String.valueOf(c1);//valueOf method
		//System.out.println(s1);
				
	}
	
	
	public static void removeSpace()
	{
		
		String s = "Jai Hind";
		System.out.println("\n--------Remove Space before ------");
		System.out.println("===> "+s);
		
		
		 s= s.replaceAll("\\s","");
		 System.out.println("\n-------Remove Space After -------");
		 System.out.println("===> "+s);
		
	}
	
	public static void UppreLoweChar() 
	{
		System.out.println("\n--------Upper To LoweCharacters--------");
		
		String s ="JAI HIND";
		String l=s.toLowerCase();
		System.out.println(l);
		
		System.out.println("\n--------Lower To Upper Characters-----------");
		String u=l.toUpperCase();
		System.out.println(u);
		
		
		
	}
	
	
	public static void reverseString() 
	{
		
		System.out.println("\n------Reverse String-------- ");
		String s = "Jai Hind";
		
		char[]  c= s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}
		
		/*
		//OR
		
		String s1 = "Hello";
		char[] c1 = s1.toCharArray();
		
		int left,rigth = 0;
		rigth=c1.length-1;
		
		for(left=0;left<rigth;left++,rigth--)
		{
			
			 // Swap values of left and right 
			char temp=c1[left];
			c1[left]=c1[rigth];
			c1[rigth]=temp;
			
			for (char d : c1) 
			{
				System.out.print(d);
				System.out.println();
				
			}
		}
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringOprationExample4.stringToChar();
		StringOprationExample4.charToString();
		StringOprationExample4.removeSpace();
		StringOprationExample4.UppreLoweChar();
		StringOprationExample4.reverseString();

	}

}
