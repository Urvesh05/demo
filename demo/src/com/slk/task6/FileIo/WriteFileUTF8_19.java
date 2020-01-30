package com.slk.task6.FileIo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class WriteFileUTF8_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/a.txt");
			Writer write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF8"));
			write.append("welcome ").append("\r\n");
			write.append("जिद्दी");
			
			System.out.println("Insered Data In this File --> "+file);
			write.flush();
			write.close();
			
		} catch (UnsupportedEncodingException e)
	      {
	         System.out.println(e.getMessage());
	      } catch (IOException e)
	      {
	         System.out.println(e.getMessage());
	         
	      } catch (Exception e)
	      {
	         System.out.println(e.getMessage());
	      }
	}

}
