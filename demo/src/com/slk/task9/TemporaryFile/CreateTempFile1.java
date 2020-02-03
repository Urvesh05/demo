package com.slk.task9.TemporaryFile;

import java.io.File;
import java.io.IOException;

public class CreateTempFile1 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		File file=null;
		File dir=new File("/home/urvesh.gayakwad/git/demo/demo/Gzip/Temp");//temp file create in Specific path
		
		file = File.createTempFile ("Temp File ", ".temp",dir);
		 
	     System.out.println("temporary file created:"+file.getAbsolutePath());
	   
	}
}