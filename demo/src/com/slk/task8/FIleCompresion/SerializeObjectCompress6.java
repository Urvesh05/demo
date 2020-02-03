package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import com.slk.task.opps.Address;

public class SerializeObjectCompress6 implements Serializable{

	public static void main(String[] args) throws IOException 
	{
		SerializeObjectCompress6 address = new SerializeObjectCompress6();//class object
		address.serializeAddress("dddf",1);//class object. Method to Address class and pass value in method parameter
		
		
	   }

	   public void serializeAddress(String s, int id)//set value in method 
	   {
		   
		 SerializeObjectAddress address = new SerializeObjectAddress();//address class object and set data 
		 address.setId(id);
		 address.setS(s);
		 
		 
		   try{
			   //write data 
			   FileOutputStream fos = new FileOutputStream("/home/urvesh.gayakwad/git/demo/demo/Gzip/S.txt");//store in s file 
			   GZIPOutputStream gz = new GZIPOutputStream(fos);

			   ObjectOutputStream oos = new ObjectOutputStream(gz);
			   
			   oos.writeObject(address);//address class write data and store to s file
			   oos.close();
			   
			   System.out.println("Done");
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
		   }	 
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		List<SerializeObjectAddress> l = new ArrayList<SerializeObjectAddress>();//multipale Object Store 
		
		l.add(new SerializeObjectAddress("reena", 12));
		l.add(new SerializeObjectAddress("hari", 122));
		l.add(new SerializeObjectAddress("gita", 120));
		
		
		
		SerializeObjectAddress s= new SerializeObjectAddress("gita", 12);
		SerializeObjectAddress s1 = new SerializeObjectAddress("h",23);
		
		
		File file=new File("/home/urvesh.gayakwad/git/demo/demo/Gzip/S.txt");
		
		FileOutputStream out = new FileOutputStream(file);//write file 
		GZIPOutputStream gzi = new GZIPOutputStream(out);
		ObjectOutputStream obj = new ObjectOutputStream(gzi);
		
		
		obj.writeObject(s);
		obj.writeObject(s1);
		
		obj.flush();
		System.out.println("Object is Compress ");
	}
}		











		/*
		
        Mobile m1 = new Mobile("9934566778", "Hari");
        Mobile m2 = new Mobile("7686291729", "Mayank");
        
        
        
       FileOutputStream fos = null;
        GZIPOutputStream gos = null;
        ObjectOutputStream oos = null;
        
        try {
        	FileOutputStream  fos1 = new FileOutputStream("/home/urvesh.gayakwad/git/demo/demo/Gzip/S.txt");
            GZIPOutputStream  gos1 = new GZIPOutputStream(fos1);
            ObjectOutputStream  oos1 = new ObjectOutputStream(gos1);
            
            oos1.writeObject(m1);
            oos1.writeObject(m2);
            
            oos1.flush();
            
            System.out.println("Done... Objects are compressed and stored");
            
        } catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally
        {
            try{
                if(oos != null) oos.close();
                if(fos != null) fos.close();
            } catch(Exception ex)
            {
               ex.printStackTrace();  
            }
        }
    }
}


class Mobile implements Serializable{
    
    private String number;
    private String owner;
     
    public Mobile(String num, String own){
        this.number = num;
        this.owner = own;
    }
     
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
     
}
*/
 