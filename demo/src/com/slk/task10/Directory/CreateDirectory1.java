package com.slk.task10.Directory;

import java.io.File;

public class CreateDirectory1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 File file = new File("/home/urvesh.gayakwad/git/demo/demo/dir10");
		 
	        if (!file.exists()) 
	        {
	            if (file.mkdir()) 
	            {
	                System.out.println("Directory is created!");
	            } 
	            else 
	            	
	            {
	                System.out.println("Failed to create directory!");
	            }
	        }
	}
}