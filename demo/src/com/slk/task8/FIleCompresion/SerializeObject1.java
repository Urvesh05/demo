package com.slk.task8.FIleCompresion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

import com.slk.task.opps.Address;

public class SerializeObject1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeObject1 serializer = new SerializeObject1();
		   serializer.serializeAddress("wall street", "united state");
	   }

	   public void serializeAddress(String street, String country){
		   
		   Address address = new Address();
		   address.setStreet(street);
		   address.setCountry(country);
		   
		   try{
			   
			   FileOutputStream fos = new FileOutputStream("c:\\address.gz");
			   GZIPOutputStream gz = new GZIPOutputStream(fos);

			   ObjectOutputStream oos = new ObjectOutputStream(gz);
			   
			   oos.writeObject(address);
			   oos.close();
			   
			   System.out.println("Done");
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
		   }	 
	   }
	}