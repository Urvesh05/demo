package com.slk.task8.FIleCompresion;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DecompressFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			String s="/home/urvesh.gayakwad/git/demo/demo/t/test.txt";
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/t/Demo.zip");
	
			FileInputStream in  = new FileInputStream(file);
			
			ZipInputStream zipInputStream = new ZipInputStream(in);
			
			ZipEntry ze;
			
			while((ze=zipInputStream.getNextEntry())!=null)
			{
				System.out.println("UnZipping File ::" + ze.getName());
//				
//				
//				FileOutputStream out = new FileOutputStream(file1);
				byte[] buffer = new byte[2048];
				int i ;
				
				//File file1 = new File("/home/urvesh.gayakwad/git/demo/demo/t/test.txt");
				FileOutputStream out= new FileOutputStream(s+ze.getName());
				
				BufferedOutputStream br = new BufferedOutputStream(out);
				
				while((i=zipInputStream	.read())!=-1)
				{
					br.write(buffer, 0, i);
				}
				
				br.flush();
				br.close();
			}
			zipInputStream.close();
			
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
