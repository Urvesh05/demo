package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class CompressDemoDefletor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
			
		//Data Store in Zip Format 
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/t/CompressFile.java");
			FileInputStream in = new FileInputStream(file);//read file 
			
			//write data in to this txt file 
			FileOutputStream out = new FileOutputStream("/home/urvesh.gayakwad/git/demo/demo/t/l.txt");
			DeflaterOutputStream compress= new DeflaterOutputStream(out);//this txt file all data store and compress 
			
			int i;
			while((i=in.read())!=-1)//read java file
			{
				//System.out.println((char)i);
				compress.write((byte)i);//write file in store to compress 
				compress.flush();//store data in hard disk memory
			}
			
			in.close();
			compress.close();
			
			System.out.println("Compress Data successfully");
			
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
			catch( IOException e1) {
			// TODO Auto-generated catch block
			
				e1.printStackTrace();
			}
		}
	
	}

