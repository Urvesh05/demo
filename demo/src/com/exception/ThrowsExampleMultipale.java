package com.exception;

import java.io.File;
import java.io.IOException;

public class ThrowsExampleMultipale {
	
	public static void get() throws ArithmeticException,IOException//Multiple Exception
	
	{
		int a=50/0;
		
		System.out.println(a);
		
		
		File f = new File("/home/abc.txt");
		
		throw new IOException("file not found");//checked exception   (handle the exception)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try
		{
			ThrowsExampleMultipale.get();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(IOException io)
		{
			System.out.println(io);
			
		}
		
	}
}
