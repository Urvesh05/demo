package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.zip.GZIPInputStream;

public class SerializeDecompressObject7 implements Serializable
{
	
	
	public static void main(String[] args)
	{
		
		
		SerializeDecompressObject7 deserializer = new SerializeDecompressObject7();//class object 
		SerializeObjectAddress address = deserializer.deserialzeAddress();//address class create object  
		 System.out.println(address);//show data in S.txt file
		 
	   }

	   public SerializeObjectAddress deserialzeAddress()//address class method 
	   {
		   
		   SerializeObjectAddress address;//class variable
		 
		   try{
			    
			   FileInputStream fin = new FileInputStream("/home/urvesh.gayakwad/git/demo/demo/Gzip/S.txt");
			   GZIPInputStream gis = new GZIPInputStream(fin);
			   ObjectInputStream ois = new ObjectInputStream(gis);
			   address = (SerializeObjectAddress) ois.readObject();
			   ois.close();
			   System.out.println("Deserialization  file");
			   return address;
			   
			
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
			   return null;
		   } 
		
	}
}