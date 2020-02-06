package com.slk.task15.GenericJava;


class Second<T,U>
{
	T type;
	U obj2;
	
	
	Second(T type,U obj2)
	{
		this.type=type;
		this.obj2=obj2;
		
	}
	
	
	void print()
	{
		System.out.println(type);
		System.out.println(obj2);
	}
	
}


public class GenericClass2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Second<Integer ,String> s= new Second(24, "sds");
		
		s.print();
		
		Second<Integer,Integer> s2 = new Second(12,"qqweqw");
		s2.print();
	}

}
