package com.slk.task2.String;

//String All Method
public class StringDemo2 {

   static String s = " Lalu";
	
	public static void replace()
	{
		
		System.out.println(" Replace Method >> "+s.replace('u', 'U'));
		
		System.out.println("\n Trime Method >> "+s.trim());
		
		System.out.println("\n UpperCase >> "+s.toUpperCase());
		System.out.println("\n LowerCase >> "+s.toLowerCase());
		
		System.out.println("\n StartWith >> "+s.startsWith("l"));
		System.out.println("\n EndWith >> "+s.endsWith("u"));
		
		System.out.println("\n charAt(index Char) >> "+s.charAt(2));
	
		System.out.println("\n String Length >>  "+s.length());
		
		String s1=s.intern();
		System.out.println("\n Inter(reference provide) >> "+s1);
		
		int a=10;
		String s2=String.valueOf(a);
		System.out.println("\n ValueOf (int to String) >> "+s+s2);
		
		String s4= String.format("%d",123);
		System.out.println("\n String Format >> "+s+s4);
		
		System.out.println("\n SubString >> "+s.substring(1, 3));
		
		System.out.println("\n Contains(char search) >> "+s.contains("u"));
		
		String s5 = String.join("-","lalu bhai", "patel");
		System.out.println("\n Join >>"+s5);
		//System.out.println(s.join("-","karan", "patel"));
		
		
		String s6=" Lalu";
		//String s7 =" lalu";
		System.out.print(" \n Oprator >> ");
		System.out.println(s6==s);
		System.out.println("\n equal >> "+s.equals(s6));
	
		String s8="";
		System.out.println("\n empty >> "+s8.isEmpty());
		
		//concate
		String s9="patel hello";
		System.out.println("\n Concate >> "+s9.concat(s6));
		
		String s14="patel hello";
		String sp=" ";	
		String b="uv";
		String d=s14.substring(0, 5);
		//System.out.println(d.concat(sp.concat(b)));
		String e=s14.substring(6,11);
		System.out.println("\n Multipale Concate >> "+d.concat(sp.concat(b.concat(sp.concat(e)))));
		
		//replace
		/*System.out.println("Replace >> "+s9.replace(" ", " hi "));
		System.out.println("Replace Word >> "+s9.replace("hello", "hi"));
		
		System.out.println("equalsIgnoreCase >> "+s6.equalsIgnoreCase(s7));
		
		
		//Split
		/*String arr[]=s9.split("l",0);
		for(String ar:arr) 
		{
			System.out.println(ar);
		}
		*/
		
		
		/*
		String s10="Hello How are you";
		//String[] u= s10.split("\\s");
		for(String j:s10.split("\\s",2))
		{
			System.out.println("String Split >> "+j);
		}
		
		//intern
		
		String s11= new String("Hello How are you ");
		String s12=s11.intern();
		System.out.println("Intern  >> "+s12);
		
		*/
		//indexOf
		String s11= new String("Hello How are you ");
		System.out.println("\n IndexOf >> "+s11.indexOf("are",9));
		System.out.println("\n IndexOf >> "+s11.indexOf('e',2));
		
		
		String s15=" Hello how are you ";
		String s16=" Java ";
		
		System.out.println("\n IndexOf >> "+s15.trim()+s16.trim());
		
		
		int v=10;
		float f=12.6f;
		double l=129.9;
		long l1=13L;
		short sh=100;
		boolean bl=true;
		char ch[]= {'j','a','v','a'};
		
		String s17=String.valueOf(v);
		String s18=String.valueOf(f);
		String s19=String.valueOf(l);
		String s20=String.valueOf(l1);
		String s21=String.valueOf(sh);
		String s22=String.valueOf(bl);
		String s23=String.valueOf(ch);
		System.out.println("\n ValueOf >> "+s17+s18+s19+s20+s21+s22+s23);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String Class All Methods \n");
		
		StringDemo2.replace();
	}

}
