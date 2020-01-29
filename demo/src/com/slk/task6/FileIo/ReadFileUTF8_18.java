package com.slk.task6.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadFileUTF8_18 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try
		{

			File file = new File("C:\\Users\\Urvesh Gayakwad\\git\\demo\\demo\\WindowsFile\\xyz.txt");
			BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF8"));
			
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			br.close();
			
		}
		 catch (UnsupportedEncodingException e) 
         {
             System.out.println(e.getMessage());
         } 
         catch (IOException e) 
         {
             System.out.println(e.getMessage());
         }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }
	}

}
