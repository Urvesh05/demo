package com.slk.task10.Directory;

import java.io.File;

public class DeleteDir3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		File dir = new File("/home/urvesh.gayakwad/git/demo/demo/dir11/");
		
		if(dir.isDirectory() == false) 
		{
			System.out.println("Not a directory. Do nothing");
			return;
		}
		
		File[] listFiles = dir.listFiles();
		
		for(File file : listFiles)
		{
			System.out.println("Deleting "+file.getName());
			file.delete();
		}
		//now directory is empty, so we can delete it
		System.out.println("Deleting Directory. Success = "+dir.delete());
		
	}

}

		
	



		
		//Another example all dir delete 
	
		/*
		
		deleteDir(new File("/home/urvesh.gayakwad/git/demo/demo/dir11"));
		
	}
	
	public static boolean deleteDir(File dir)
	{
		if(dir.isDirectory())
		{
				String[] child = dir.list();
				for(int i=0;i<child.length;i++)
				{
					boolean success= deleteDir(new File(dir,child[i]));
					
					if(!success)
					{
						return false;
					}
				}
				
		}
		System.out.println("Dir is detele"+dir.getAbsolutePath());
		return dir.delete();
		
		
	}
}
		
		*/
		
