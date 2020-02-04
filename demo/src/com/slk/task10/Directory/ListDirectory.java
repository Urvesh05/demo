package com.slk.task10.Directory;

import java.io.File;

public class ListDirectory {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		File dir = new File("/home/urvesh.gayakwad/git/demo/demo/dir11");
	      String[] children = dir.list();
	      
	      if (children == null)
	      {
	         System.out.println( "Either dir does not exist or is not a directory");
	      } else
	      { 
	         for (int i = 0; i< children.length; i++)
	         {
	            String filename = children[i];
	            System.out.println(filename);
	         }
	      }

	}
		
}		
		//second type 
		/*

		displayIt(new File("/home/urvesh.gayakwad/git/demo/demo/dir11"));
	}
	
	public static void displayIt(File node){
		
		System.out.println(node.getAbsoluteFile());
		
		if(node.isDirectory()){
			String[] subNote = node.list();
			for(String filename : subNote){
				displayIt(new File(node, filename));
			}
		}
	}

}
*/
