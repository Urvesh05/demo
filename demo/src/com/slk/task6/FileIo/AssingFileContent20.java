package com.slk.task6.FileIo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class AssingFileContent20 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		DataInputStream di =new DataInputStream(new FileInputStream("/home/urvesh.gayakwad/git/demo/demo/Abc/abc.txt"));
		byte[] b= new byte[di.available()];//checked byte in file
		di.readFully(b);
		di.close();
		
		String content = new String(b,0,b.length);
		
		System.out.println(content);
	}

}
