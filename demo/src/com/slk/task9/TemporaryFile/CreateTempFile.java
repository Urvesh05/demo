package com.slk.task9.TemporaryFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTempFile {

	/**
	 * @param args
	 * @throws IOException c
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File temp = File.createTempFile ("pattern", ".temp");
	      temp.deleteOnExit(); 
	      BufferedWriter out = new BufferedWriter (new FileWriter(temp));
	      out.write("aString");
	      System.out.println("temporary file created:"+temp.getAbsolutePath());
	      out.close();
}
}