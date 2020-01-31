package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressDemoInflater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Data read Zip format to text
		try {
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/t/l.txt");
			FileInputStream in = new FileInputStream(file);//read data
			
			InflaterInputStream decompress = new InflaterInputStream(in);//decompress  data in store to text format 
			FileOutputStream out = new FileOutputStream("/home/urvesh.gayakwad/git/demo/demo/t/decompress.java");///write data
			
			
			int i;
			while((i=decompress.read())!=-1)	
			{
				
				out.write((byte)i);
				
				out.flush();
			}
			
			in.close();
			out.close();
			decompress.close();
			System.out.println("Data Decompress successfully");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
