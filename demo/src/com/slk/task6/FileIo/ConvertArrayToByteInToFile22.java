package com.slk.task6.FileIo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ConvertArrayToByteInToFile22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] b="hello".getBytes();
		File file  =new File("C:\\Users\\Urvesh Gayakwad\\git\\demo\\demo\\WindowsFile\\xyz.txt");
		
		
		try {
			
			OutputStream out =new FileOutputStream(file);
			out.write(b);
			 System.out.println("Write bytes to file.");
			 out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}

}
