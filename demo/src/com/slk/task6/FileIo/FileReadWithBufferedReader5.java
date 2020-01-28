package com.slk.task6.FileIo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


//input
public class FileReadWithBufferedReader5 {
	
	//1. read File   reading the data from the text file
	public static void readFile() throws IOException 
	{
		FileReader file = new FileReader("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
		BufferedReader br= new BufferedReader(file);
		
		String i;
		
		// skip 5 character
		//br.skip(2);
				
		System.out.println(br.readLine());
		
		while((i=br.readLine())!=null) //readLine Method
		{
			
			
			System.out.println(i);
			
		}

	}
	
	
	//2. Read file using BufferedReader ready method
	
	public static void readyMethod()
	{
		try {
			
			BufferedReader br=new BufferedReader(new FileReader("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt"));
			
			//check of ready  (input stream is ready to be read.)
			if(br.ready())
			{
				int i=0;
				while((i=br.read())!=-1)
				{
					char c=(char)i;
					//prints the character
					System.out.print(c);
				}
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	//3. Reading data from console by InputStreamReader and BufferedReader
	
	public static void readByColsole() throws IOException 
	{
		
		InputStreamReader r= new InputStreamReader(System.in);//
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Name :");
		String name=br.readLine();
		System.out.println(" hi "+name);
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReadWithBufferedReader5.readFile();
		
		FileReadWithBufferedReader5.readyMethod();
		FileReadWithBufferedReader5.readByColsole();
		
	}

}
