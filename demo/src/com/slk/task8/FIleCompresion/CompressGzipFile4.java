package com.slk.task8.FIleCompresion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressGzipFile4 {

	static final String OUTPUT_FILE  = "/home/urvesh.gayakwad/git/demo/demo/Gzip/a.txt"; 
	static final String INPUT_FILE = "/home/urvesh.gayakwad/git/demo/demo/Gzip/abc.txt"; 

	static void compress() 
	{ 
		byte[] buffer = new byte[1024]; 
		try
		{ 
			GZIPOutputStream os = new GZIPOutputStream(new FileOutputStream(OUTPUT_FILE)); //write file a.txt(compress)
              
			FileInputStream in =  new FileInputStream(INPUT_FILE); //read File abc.txt
      
			int totalSize; 
			while((totalSize = in.read(buffer)) > 0 ) 
			{ 
				os.write(buffer, 0, totalSize); 
			} 
      
			in.close(); 
				os.finish(); 
				os.close(); 
      
				System.out.println("File Successfully compressed"); 
		} 
		catch (IOException e) 
		{ 
			e.printStackTrace(); 
		} 
  
	} 

	public static void main (String[] args) 
	{ 
		compress(); 
  
	} 
	} 
