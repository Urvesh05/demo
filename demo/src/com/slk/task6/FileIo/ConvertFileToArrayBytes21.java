package com.slk.task6.FileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ConvertFileToArrayBytes21 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file  =new File("/home/urvesh.gayakwad/git/demo/demo/Abc/abc.txt");
		FileInputStream in=new FileInputStream(file);
		
		byte[] b = new byte[(int) file.length()];//cast to int
				
		in.read(b);//read in to byte 
		b.clone();
		System.out.println(Arrays.toString(b));
	}

}
