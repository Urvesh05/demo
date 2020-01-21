package com.slk.task2.String;

//Reverse String
public class StringDemo {
	
	public static void get()
	{
		System.out.println(">>> Using Arry" );
		char arr[] = {'K','a','r','a','n'};
		String s2= new String(arr);
		System.out.println(s2);
		
		char r;
		int i;
		
		for(i=4;i>='\0';i--)
		{
			r=arr[i];
			System.out.print(r);
		}
	}
	
	public static void string()
	{
		System.out.println(" \n>>>>Using String ");
		String s=new String("Hiral lalu");
		char ar[] =s.toCharArray();
		
		System.out.println(s);
		char rev;
		int i;
		for(i=9;i>='\0';i--)
		{
			rev=ar[i];
			System.out.print(rev);
		}	
	}
	
	public static void buffer()
	{
		System.out.println(" \n >>> Using String Buffer");
		
		StringBuffer sb= new StringBuffer("Rahul");
		System.out.println(sb);
		
		String s= sb.toString();
		System.out.println(s);
		
		char arr[] = s.toCharArray();
		System.out.println(arr);
		
		char temp;
		int i;
		
		for(i=4;i>=0;i--)
		{
			temp=arr[i];
			System.out.print(temp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo.get();
		StringDemo.string();
		StringDemo.buffer();
	}

}
