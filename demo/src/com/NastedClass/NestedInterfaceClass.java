package com.NastedClass;

public class NestedInterfaceClass 
{
	
		interface Inner
		{
			void dispaly();
		}

}

	class Test1 implements NestedInterfaceClass.Inner
	{
		public void dispaly()
		{
			System.out.println("Nasted class ");
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedInterfaceClass.Inner in=new  Test1();
		in.dispaly();
		
	}

}
