package com.slk.task6.FileIo;

import java.io.File;

public class RenameFile11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File oldfile= new File("/home/urvesh.gayakwad/git/demo/demo/t/old.txt");
		File newFile = new File("/home/urvesh.gayakwad/git/demo/demo/t/new.txt");
		
		
		boolean change=oldfile.renameTo(newFile);
		
		if(change)
		{
			
			System.out.println("Rename Successfully");
		}
		
		else
		{
			System.out.println("Not Change file Name ");
		}
		

	}

}