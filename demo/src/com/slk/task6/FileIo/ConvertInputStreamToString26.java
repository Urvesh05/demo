package com.slk.task6.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConvertInputStreamToString26 {

	//1.input Stream Reader class 
	
	public static void inputStram() throws IOException
	{
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
		
		//File Attach in Input Stream
		InputStream in= new FileInputStream(file);
		
		//this is byte to character convert
		InputStreamReader readData= new InputStreamReader(in);
		
		//create aray
		char[] charArray= new char[(int)file.length()];
		
		//reading the content of the reader
			readData.read(charArray);
		
			//	convert char array to string
			
			String s= new String(charArray); 
			
			System.out.println(s);
	}

	
	
	
	//2. Convert InputStream to String with BufferedReader
	
	public static void bufferReadre() throws IOException {
		
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/getDate1.txt");
		
		//Byte file 
		InputStream in =new FileInputStream(file);
		
		//Byte Convert to char(inputStreamReader)
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		//String Builder create to store data string format 
		StringBuilder builder = new StringBuilder();
		
		String line;
		while((line= reader.readLine())!=null)
		{
			builder.append(line);
		}
		System.out.println(builder.toString());
		reader.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	ConvertInputStreamToString26.inputStram();
	ConvertInputStreamToString26.bufferReadre();
	
	}
		
}
