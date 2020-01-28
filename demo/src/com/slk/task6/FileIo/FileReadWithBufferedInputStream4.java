package com.slk.task6.FileIo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadWithBufferedInputStream4 {
	
	// 1. Read file (input)
	public static void readFile()
	{
		try
		{
			
			FileInputStream file = new FileInputStream("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
			BufferedInputStream bf =new BufferedInputStream(file);
			
			System.out.println("\n======Read File======");
			
			System.out.println("Number of Bytes "+bf.available());
			
			int i;
			while((i=bf.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
		
            }catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	
	
	//2. Read File of set (start index , End Index)
	
	
	public static void readFileIndex() throws FileNotFoundException
	{
		
		System.out.println("\n======Read File Of Set	======");
		
		FileInputStream file1 = new FileInputStream("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
		BufferedInputStream bf= new BufferedInputStream(file1);
		
		
		try {
			
			byte[] by= new byte[10];//array convert
			int i = bf.read(by, 2, 7);//of set (start index , End Index)
			
			System.out.println("Number of Byte ="+i);
			
			//byte covert to character
			for(byte b:by )
			{
				bf.skip(6);
				char c=(char)b;
				System.out.println(" Read File :"+c);
				
			}
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		FileReadWithBufferedInputStream4.readFile();
		FileReadWithBufferedInputStream4.readFileIndex();
		
	}
}
