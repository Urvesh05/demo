package com.slk.task6.FileIo;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWithFileOutputStream6  {

	//1. output stream used for writing data to a file.
	public static void writeFile() throws IOException
	
	{
		
		File fi =null;
		
		try
		{
			
			System.out.println("\n==========File Write=========");
			
			fi=new File("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
			FileOutputStream out= new FileOutputStream(fi);
			
			
			// FileDescriptor object that represents the connection to the actual file 
			FileDescriptor fileDescriptor;
			fileDescriptor =out.getFD();
			boolean valid =fileDescriptor.valid();
			System.out.println(" File IS valid : "+valid);
			
			
			//1.integer
				out.write(65);
			//out.close();
			
			//2.String
				String s=" Welcome ";
				byte[] b=s.getBytes();//converting string into byte array 
				
				out.write(b);
				out.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("File Written successfully");
		
		
	}
	
	
	//2.This method writes len bytes from the specified byte array starting at offset off to this file output stream.
	
	public static void writeFileSpecifedByte()
	{
		try
		
		{
			
			System.out.println("\n ==========File Write In  Specified Byte (offset)========= ");
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/r.txt");
			FileOutputStream out= new FileOutputStream(file);
			
			//Create String 
			String data="Hello How Are You";
			
			
			if(file.exists())
			{
				file.createNewFile();
			}
			
			//Store String in byte array
			byte[] bs=data.getBytes();
			out.write(bs, 2, 7);// from the specified byte array starting at offset off to this file output stream.
			out.flush();
			out.close();
			System.out.println("File Written successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WriteWithFileOutputStream6.writeFile();
		WriteWithFileOutputStream6.writeFileSpecifedByte();

	}

}
