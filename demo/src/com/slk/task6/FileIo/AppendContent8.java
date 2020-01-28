package com.slk.task6.FileIo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendContent8 {
	
	
	//1. Append to File using BufferedWritter
	public static void bufferWritter()
	{
		
		try {
			
			System.out.println("\n1. =======Append Data to BufferWriter======");
			String data="Appebd data in BufferWritter";//add Content
			File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/BufferWriter_append.txt");
			FileWriter file1= new FileWriter(file,true);
			BufferedWriter br= new BufferedWriter(file1);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			br.newLine();
			br.write(data);
			br.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	
	
	//2. Append to File using PrintWriter
			public static void printWriter()
			{
				try {
					
					System.out.println("\n2. =======Append Data to PrintWriter======");
					String data="Appebd data in PrintWriter";//add Content
					File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/PrintWriter_append.txt");
					FileWriter file1= new FileWriter(file,true);
					PrintWriter pr= new PrintWriter(file1);
					
					if(!file.exists())
					{
						file.createNewFile();
					}
					
					
					pr.write(data);
					pr.close();
					
					
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
			//3.Append to File using FileOutputStream
			
			public static void fileOutPutSteram()//write binary data to a file.
			{
				try {
					
					System.out.println("\n3. =======Append Data to FileOutPutStream======");
					
					String data="Appebd data in FileOutPutStream_append";//add Content
					
					File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/FileOutPutStream_append.txt");
					
					FileOutputStream out= new FileOutputStream(file,true);
					
					
					if(!file.exists())
					{
						file.createNewFile();
					}
					
					out.write(data.getBytes(), 0, data.length());
					
					//or Second 
					//byte[] b= data.getBytes();
					//out.write(b);
					
					out.close();
					
					
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
	
			//4.Append to File using FileWriter class
			
			public static void fileWriter()//write binary data to a file.
			{
				try {
					
					System.out.println("\n4. =======Append Data to FileWriter======");
					
					String data="Appebd data in FileWriter";//add Content
					
					File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/FileWriter_append.txt");
					FileWriter write = new FileWriter(file,true);
				
					if(!file.exists())
					{
						file.createNewFile();
					}
					
					write.write(data);
					write.close();
					
					
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
			
			//5.Append to File using Files  class
			
			public static void files()//write binary data to a file.
			{
				try {
					
					System.out.println("\n5. =======Append Data to File======");
					
					String data="Appebd data in Files";//add Content
					
					Path path = Paths.get("/home/urvesh.gayakwad/git/demo/demo/Abc/append.txt");
					
					Files.write(path, data.getBytes(), StandardOpenOption.APPEND);//Append mode
				
					
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AppendContent8.bufferWritter();
		AppendContent8.printWriter();
		AppendContent8.fileOutPutSteram();
		AppendContent8.fileWriter();
		AppendContent8.files();
	}

}
