package com.slk.task9.TemporaryFile;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class TempFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			
			FileReader file = new FileReader("/home/urvesh.gayakwad/git/demo/demo/Gzip/Temp/Temp File Write 8602147071514487543.temp");
			
			BufferedReader br = new BufferedReader(file);
			//read line by line 
			
			String s;
			while ((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			 System.err.format("IOException: %s%n", e);
		}

	}

}
