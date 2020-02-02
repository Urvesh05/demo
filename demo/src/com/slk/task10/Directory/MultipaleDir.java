package com.slk.task10.Directory;

import java.io.File;

public class MultipaleDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File directory = new File("D:\\kumar\\Blogs\\File Operations\\Directory");  
          if (directory.exists()) {  
               System.out.println("Directory already exists");  
          } else {  
               directory.mkdir();  
               System.out.println("Single Directory is created!");  
          }  
          File directories = new File("D:\\kumar\\Blogs\\File Operations\\Directory\\Directory1\\Directory4");  
          if (directories.exists()) {  
               System.out.println("Directories already exists");  
          } else {  
               directories.mkdirs();  
               System.out.println("Multiple Directories created!");  
          }  
     }  
} 