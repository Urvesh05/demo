package com.slk.task9.TemporaryFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTempFile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
    		

			File file=null;
			File dir=new File("/home/urvesh.gayakwad/git/demo/demo/Gzip/Temp");//temp file create in Specific path
	
			file = File.createTempFile ("Temp File Write ", ".temp",dir);
			
				
					System.out.println("temporary file created:"+file.getAbsolutePath());
					
		    	    //write it
		    	    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		    	    bw.write("This is the temporary file content");
		    	    bw.close();
    		
		    	    System.out.println("Done");
				
    	}catch(IOException e){
    		
    	    e.printStackTrace();
    		
    	}
    	
    }
}