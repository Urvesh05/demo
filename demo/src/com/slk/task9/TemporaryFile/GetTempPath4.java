package com.slk.task9.TemporaryFile;

import java.io.File;
import java.io.IOException;

public class GetTempPath4 {

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
			  System.out.println("Temp file created : " + file.getAbsolutePath());	
			
			 
	    	   //delete temporary file when the program is exited
	    	   file.deleteOnExit();//Delete on runtime exit	
	    	
	           //delete immediate	
	    	   //file.delete();
	    	   System.out.println("Temp file exists : " + file.exists());
	    	   
	    	}catch(IOException e){
	    		
	    	   e.printStackTrace();
	    		
	    	}
	    	
	}
	}