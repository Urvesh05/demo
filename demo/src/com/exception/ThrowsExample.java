	package com.exception;

import java.io.File;
import java.io.IOException;


//handle the exception
public class ThrowsExample {
	public static void get() throws IOException
	
	{
		//int a=50/0;
		File f = new File("/home/abc.txt");
		
		throw new IOException("file not found");//checked exception   (handle the exception)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			ThrowsExample.get();
			
		}catch(IOException e)
		{
			System.out.println(e);
			
		}
	}

}
