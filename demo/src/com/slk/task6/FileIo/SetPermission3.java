package com.slk.task6.FileIo;

import java.io.File;

public class SetPermission3 {
	
	
	public static void allPermissiom()
	{
		File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/abc.txt");
		
		System.out.println("\n========All Set Permosion======");
		
	 	System.out.println("Can Execute? "+file.canExecute());//Default false
        System.out.println("Can Read? "+file.canRead());//Default true
        System.out.println("Can Write? "+file.canWrite());////Default false
        
        
        //Permission Set 
        file.setExecutable(true);
        file.setReadable(true);
        file.setWritable(true);
        //file.setReadOnly();
        
        //After Permission
        
        System.out.println("\n====Now file permissions:=====");
        System.out.println("Can Execute?--> "+file.canExecute());
        System.out.println("Can Read? -->"+file.canRead());
        System.out.println("Can Write? -->"+file.canWrite());
       
	
		
	}
	
	
	public static void setExcecute() 
	{
		System.out.println("\n======== Excecute Permosion======");
		
		
		File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/xyz.txt");
		
		if(file.exists())
		{
			boolean b=file.setExecutable(true);
			System.out.println("set the owner's execute permission: --> "+b);
		}
		else
		{
			System.out.println("file is can`t exists");
		}
		
		
		if(file.exists())
		{
			boolean b=file.setExecutable(true,false);
			System.out.println("set the everybody execute permission: --> "+b);
		}
		else
		{
			System.out.println("\n File cannot exists: ");
		}
		
	}
	
	
	
	public static void setWritebale()
	{
		
		System.out.println("\n======== Writebale Permosion======");
		
		
	File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
		
		if(file.exists())
		{
			boolean b=file.setWritable(true);
			System.out.println("set the owner's write permission: --> "+b);
		}
		else
		{
			System.out.println("file is can`t exists");
		}
		
		
		if(file.exists())
		{
			boolean	b=file.setWritable(true, true);
			System.out.println("set the every user write permission: --> "+b);
			
		}
		else
		{
			System.out.println("file is can`t exists");
		}
		
	}
	
	
	public static void setReadebale()
	{
		
		System.out.println("\n======== Readebale Permosion======");	
		
	File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/a.txt");
		
		if(file.exists())
		{
			boolean b=file.setReadable(true);
			System.out.println("set the Owner Read permission --> "+b);
		}
		else
		{
			System.out.println("file is can`t exists");
		}
		
		
		if(file.exists())
		{
			boolean b= file.setReadable(true, true);
			System.out.println("set the user Read permission "+b);
		}
		else
		{

			System.out.println("file is can`t exists");
		
		}
		
	}
	
	
	public static void setReadyOnly()
	{
		System.out.println("\n======== ReadyOnly Permosion======");	
		
		
	File file= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/g.txt");
		
		if(file.exists())
		{
			boolean b=file.setReadOnly();
			System.out.println("Read opearation is permitted -->"+b);
		}
		else
		{
			System.out.println("file is can`t exists");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetPermission3.allPermissiom();
		SetPermission3.setExcecute();
		SetPermission3.setWritebale();
		SetPermission3.setReadebale();
		SetPermission3.setReadyOnly();
		
		
	}

}
