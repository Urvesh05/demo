package com.slk.task10.Directory;

import java.io.File;

public class CheckDirectoryEmpty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/empty");
		
		if(file.isDirectory()){
				
			if(file.list().length>0){
					
				System.out.println("Directory is not empty!");
					
			}else{
					
				System.out.println("Directory is empty!");
					
			}
				
		}else{
				
			System.out.println("This is not a directory");
				
		}
	}
}
		
		/*
		File directory = new File("C:\\Users\\Urvesh Gayakwad\\git\\demo\\demo\\empty");
      if (directory.isDirectory()) 
      {
         String[] files = directory.list();
         if (directory.length() > 0) 
         {
            System.out.println("The directory " + directory.getPath() + " is not empty");
         } else 
         {
            System.out.println("The directory " + directory.getPath() + " is empty");
         }
      }
		System.out.println(directory.getAbsolutePath());
	      if (directory.isDirectory()) {
	         String[] files = directory.list();
	         if (directory.length() > 0) {
	            System.out.println("The directory " + directory.getPath() + " is not empty");
	         } else {
	            System.out.println("The directory " + directory.getPath() + " is empty");
	         }
	      }
	       
	}

}
*/