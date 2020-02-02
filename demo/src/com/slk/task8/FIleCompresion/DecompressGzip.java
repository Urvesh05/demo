package com.slk.task8.FIleCompresion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class DecompressGzip {

	static final String INPUT_FILE  
    	= "C:\\Users\\Urvesh Gayakwad\\git\\demo\\demo\\Abc\\r.txt"; 
	static final String OUTPUT_FILE  
    	= "C:\\Users\\Urvesh Gayakwad\\git\\demo\\demo\\Abc\\r.java"; 

	static void decompress() 
	{ 
		byte[] buffer = new byte[1024]; 
		try
		{ 
			GZIPInputStream is =  
            new GZIPInputStream(new FileInputStream(INPUT_FILE)); 
              
			FileOutputStream out = 
            new FileOutputStream(OUTPUT_FILE); 
      
			int totalSize; 
			while((totalSize = is.read(buffer)) > 0 ) 
			{ 
				out.write(buffer, 0, totalSize); 
			} 
      
			out.close(); 
			is.close(); 
      
			System.out.println("File Successfully decompressed"); 
		} 
		catch (IOException e) 
		{ 
			e.printStackTrace(); 
		} 
  
	} 

		public static void main (String[] args) 
		{ 
			decompress(); 
  
		} 
} 