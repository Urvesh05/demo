package com.slk.task6.FileIo;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileWithExtantion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			File f=new File("/home/urvesh.gayakwad/git/demo/demo/t");
			File[] files=f.listFiles(new FilenameFilter()
			{
				
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					
					if(name.toLowerCase().endsWith(".txt"))
					{
						return true;
					}
					else 
					{
						return false;
					}
				}
			});

			for(File file:files)
			{
				System.out.println(file.getName());
			}
	}

}
