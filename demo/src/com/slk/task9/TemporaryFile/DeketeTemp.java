package com.slk.task9.TemporaryFile;

import java.io.File;
import java.io.IOException;

public class DeketeTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
    		
	    	   //create a temp file
	    	   File temp = File.createTempFile("temptempfilefile", ".tmp"); 
	    		
	    	   //delete temporary file when the program is exited
	    	   temp.deleteOnExit();
	    	
	           //delete immediate	
	    	   //temp.delete();
	    		
	    	}catch(IOException e){
	    		
	    	   e.printStackTrace();
	    		
	    	}
	    	
	}
	}