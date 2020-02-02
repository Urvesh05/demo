package com.slk.task8.FIleCompresion;

import java.io.Serializable;

public class DecompressObject2 implements Serializable{


	 Deserializer deserializer = new Deserializer();
	   Address address = deserializer.deserialzeAddress();
	   System.out.println(address);
 }

 public Address deserialzeAddress(){
	   
	   Address address;
	 
	   try{
		    
		   FileInputStream fin = new FileInputStream("c:\\address.gz");
		   GZIPInputStream gis = new GZIPInputStream(fin);
		   ObjectInputStream ois = new ObjectInputStream(gis);
		   address = (Address) ois.readObject();
		   ois.close();
		  
		   return address;
		   
	   }catch(Exception ex){
		   ex.printStackTrace();
		   return null;
	   } 
 } 
}