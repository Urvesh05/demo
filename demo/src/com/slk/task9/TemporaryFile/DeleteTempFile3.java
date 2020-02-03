package com.slk.task9.TemporaryFile;

import java.io.File;
import java.io.IOException;

public class DeleteTempFile3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
    		
	    	   //create a temp file
			
			File file= null;
			File dir=new File("/home/urvesh.gayakwad/git/demo/demo/Gzip/Temp");//temp file create in Specific path
			
			file=File.createTempFile("Temp File ", ".temp",dir);
			  System.out.println("Temp file created path : " + file.getAbsolutePath());
	    	   
	    	}catch(IOException e){
	    		
	    	   e.printStackTrace();
	    		
	    	}
	  
    }
}