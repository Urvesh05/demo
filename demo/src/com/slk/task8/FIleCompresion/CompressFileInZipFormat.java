package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressFileInZipFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/t/Compress.zip");
			
			FileOutputStream out = new FileOutputStream(file);
			ZipOutputStream zip = new ZipOutputStream(out);//read data and compress to zip
			
			File file1= new File("/home/urvesh.gayakwad/git/demo/demo/t/test.txt");
			ZipEntry zipEntry= new ZipEntry(file1.getName());
			zip.putNextEntry(zipEntry);
			
			
			FileInputStream input = new FileInputStream(file1);//
			
			byte[] buff= new byte[1024];
			int i;
			
			while((i=input.read())!=-1)
			{
				zip.write(buff,0,i);
			}
			
			zip.closeEntry();
			zip.close();
			out.close();
			
			//System.out.println("regular file "+file.getCanonicalPath()+"zip file  path "+file);
			
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		if(!file.exists())
		{
			try {
				file.createNewFile();
				System.out.println("File Created ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	*/
		
		
		
	}

}
