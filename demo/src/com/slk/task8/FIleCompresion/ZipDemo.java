package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			String sourceFile="/home/urvesh.gayakwad/git/demo/demo/t/Demo.txt";
			
			FileOutputStream readData= new FileOutputStream("/home/urvesh.gayakwad/git/demo/demo/t/Demo.zip");
			
			ZipOutputStream zipOutputStream = new ZipOutputStream(readData);
			
			File file = new File(sourceFile);
			FileInputStream infile = new FileInputStream(file);
			ZipEntry zip = new ZipEntry(file.getName());
			
			zipOutputStream.putNextEntry(zip);
			
			byte[] bytes= new byte[1024];
			
			int i;
			
			while((i=infile.read())!=-1)
			{
				readData.write(bytes, 0, i);
			}
			zipOutputStream.closeEntry();
			zipOutputStream.close();
			readData.close();
			
			System.out.println("ok");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}
