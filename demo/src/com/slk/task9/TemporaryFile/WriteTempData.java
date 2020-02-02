package com.slk.task9.TemporaryFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTempData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
    		
    	    //create a temp file
    	    File temp = File.createTempFile("tempfile", ".tmp"); 
    		
	    //write it
    	    BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    	    bw.write("This is the temporary file content");
    	    bw.close();
    		
    	    System.out.println("Done");
				
    	}catch(IOException e){
    		
    	    e.printStackTrace();
    		
    	}
    	
    }
}