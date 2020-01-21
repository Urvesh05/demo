package com.slk.task2.String;

public class StringBuilder1 {
	
	
	//(1) append() method concatenates the given argument with this string last index added.
	
		public static void append()
		{
			StringBuilder sb = new StringBuilder("Hello");
			sb.append("java");
			System.out.println(sb);
		}

		//(2) insert() method  (string at the given position inserted.)
		
		public static void insert()
		{
			StringBuilder sb = new StringBuilder("welcome2020");
			sb.insert(7, " ");
			System.out.println(sb);
		}
		
		//(3) replace() method (string from the specified beginIndex and endIndex.)
		
		public static void replace()
		{
			StringBuilder sb = new StringBuilder("Wel come");
			sb.replace(3, 4, "-");
			System.out.println(sb);
		}
		
		//(4) delete() method (deletes the string from the specified beginIndex to endIndex.)
		
		public static void delete()
		{
			StringBuilder sb=new StringBuilder("Hello");  
			sb.delete(1,3);  
			System.out.println(sb);//prints Hlo  
		}
		
		//(5) reverse() method
		
		public static void reverce() 
		{
			StringBuilder sb=new StringBuilder("welcome");  
			sb.reverse();  
			System.out.println(sb);//  
		}
		
		//(6) capacity() method
		
		public static void capacity()
		{
			StringBuilder sb=new StringBuilder();  
			//System.out.println(sb.capacity());//default 16  
			sb.append("Hello");  
			System.out.println(sb.capacity());//now 16  
			sb.append("java is my favourite language");  
			System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
			
//			sb.ensureCapacity(10);
//			System.out.println(sb.capacity());
//			
//			sb.ensureCapacity(50);
//			System.out.println(sb.capacity());

		}
		
//		public static void ensureCapacity()
//		{
//			StringBuilder sb = new StringBuilder();
//			
//			System.out.println("Before ensureCapacity Method "+sb.capacity());
//			
//			sb.ensureCapacity(15);
//		}
//		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(">> append method");
		StringBuffer1.append();
		
		System.out.println(">> insert method");
		StringBuffer1.insert();
		
		System.out.println(">> replace method");
		StringBuffer1.replace();
		
		System.out.println(">> delete method");
		StringBuffer1.delete();
		
		System.out.println(">> reverce method");
		StringBuffer1.reverce();
		
		System.out.println(">> capacity method");
		StringBuffer1.capacity();

//		System.out.println(">> ensurecapacity method");
//		StringBuffer1.ensureCapacity();

	}

}
