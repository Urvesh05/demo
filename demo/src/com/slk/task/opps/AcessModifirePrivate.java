package com.slk.task.opps;

import java.nio.channels.AcceptPendingException;

public class AcessModifirePrivate {
	
	private int id=10;
	
	private void msg()
	{
		System.out.println("hello");
	}

}
	class Test
	{
		
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AcessModifirePrivate acessModifirePrivate = new AcessModifirePrivate();
		//System.out.println(acessModifirePrivate.id);//Compile Time Error  
		//AcessModifirePrivate.msg();//Compile Time Error  

	}

}
