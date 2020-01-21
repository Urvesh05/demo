package com.exception;

import java.io.File;
import java.io.IOException;

//thrown at runtime because throws does not handle the exception.
public class ThrowsExample3 {
	
public static void get() throws IOException
	
	{
		//int a=50/0;
		File f = new File("/home/abc.txt");
		
		throw new IOException("file not found");//checked exception (handle the exception)
	}


	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		ThrowsExample3 throwsExample3 = new ThrowsExample3();
				throwsExample3.get();
		
	}

}
