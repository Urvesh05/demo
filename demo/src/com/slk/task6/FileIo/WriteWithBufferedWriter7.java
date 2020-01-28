package com.slk.task6.FileIo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteWithBufferedWriter7 {
	
	//1. output stream used for writing data to a file
	public static void BufferWriter()
	{
		
		
		try 
		{
			
			FileWriter file = new FileWriter("/home/urvesh.gayakwad/git/demo/demo/Abc/r.txt");
			BufferedWriter br= new BufferedWriter(file);
			
			//write integers
			 br.write(80);
			 br.write(76);
			 br.write(100);
			 
			 System.out.println("file Is Successfully Write");
			// char c=80;
			 //System.out.println(c);
			
			
			
			 br.flush();
			 br.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	//2. (offset) & This method writes a line separator.
	
	//BufferedWriter write(String  s,  int  off,  int  len) and newLine() method
	
	public static void writeOfSet() 
	{
		
		try
		{
			String data="hello how are yor";
			//char[] arr=(char[]) "hello gvp ".toCharArray();// This method writes a portion of an array of characters specified by char[] from int offset. 
			File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/rt.txt");//fileClass(Different)
			//Writer write=  new Writer();
			//OutputStreamWriter out=new OutputStreamWriter();
			FileWriter fr= new FileWriter(file);//File Writer Class
			BufferedWriter br= new BufferedWriter(fr);//BufferWriter Class
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			br.write(data,0,3);
			br.newLine();
			br.write(data, 4,5);
			
			System.out.println("SuccessFully ");
				
			
			// br.flush();
			 br.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WriteWithBufferedWriter7.BufferWriter();
		WriteWithBufferedWriter7.writeOfSet();
		

	}

}
