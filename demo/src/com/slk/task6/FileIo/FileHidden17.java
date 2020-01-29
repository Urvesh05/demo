package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHidden17 {
	
	//1. Make Hidden file 
	
	/*
	public static void makeHiddenFile() throws IOException 
	{
		String filepath="/home/urvesh.gayakwad/git/demo/demo/t/old.txt";
		
		File file=new File(filepath);
		
		Path path=Paths.get(filepath);
		
		
		//Hide file
		//Files.setAttribute(path, "dos:hidden",true);
		
		Files.setAttribute(path, "dos:hidden",true);
		boolean fileHidden = file.isHidden();
		if(fileHidden)
		{
			System.out.println("File Is Hidden");
		}
		else
		{
			System.out.println("file not hidden");
		}
		
	}
	*/
	
	//2. file hidden
	
	public static void fileHide() throws IOException {
		
		String filepath="/home/urvesh.gayakwad/git/demo/demo/t/new.txt";
		
		
		File file=new File(filepath);
		if(file.isHidden())
		{
			System.out.println("File Is Hidden !");
		}
		else
		{
			System.out.println("File is Not Hide");
		}
		
		
		
		//Path path=Paths.get("/home/urvesh.gayakwad/git/demo/demo/t/new.txt");
		
		//Files.setAttribute(path,"dos:hidden",true,LinkOption.NOFOLLOW_LINKS);
		
		File file1=new File(filepath);
		
		//Path path=FileSystems.getDefault().getPath(file,"");
		
		
		Path path = FileSystems.getDefault().getPath(file1, "/home/urvesh.gayakwad/git/demo/demo/t/new.txt");
		
		Boolean hidden = path.getAttribute("dos:hidden", LinkOption.NOFOLLOW_LINKS);
		if (hidden != null && !hidden) {
		    path.setAttribute("dos:hidden", Boolean.TRUE, LinkOption.NOFOLLOW_LINKS);
		}
		
		if(file.isHidden())
		{
			System.out.println("File Is Hidden !");
		}
		else
		{
			System.out.println("File is Not Hide");
		}
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileHidden17.makeHiddenFile();
		FileHidden17.fileHide();

	}

}
