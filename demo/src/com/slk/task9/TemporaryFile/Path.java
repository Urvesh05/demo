package com.slk.task9.TemporaryFile;

import java.io.File;
import java.io.IOException;

public class Path {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

try{
    		
    		//create a temp file
    		File temp = File.createTempFile("temp-file-name", ".tmp"); 
    		
    		System.out.println("Temp file : " + temp.getAbsolutePath());
    		
		//Get tempropary file path
    		String absolutePath = temp.getAbsolutePath();
    		String tempFilePath = absolutePath.
    		    substring(0,absolutePath.lastIndexOf(File.separator));
    		
    		System.out.println("Temp file path : " + tempFilePath);
				
    	}catch(IOException e){
    		
    		e.printStackTrace();
    		
    	}
    	
    }
}