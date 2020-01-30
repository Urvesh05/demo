package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHidden17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String s="/home/urvesh.gayakwad/git/demo/demo/rt.txt";
		File file = new File(s);
		
		Path path= Paths.get(s);
		System.out.println(path);
		
		Files.setAttribute(path, "dos:hidden", true);
		
		boolean fileHidden=file.isHidden();
		System.out.println(fileHidden);
		if(fileHidden)
		{
			System.out.println("File Is Hidden ");
		}
		else
		{
			System.out.println("File is Not Hidden");
		}

	}

}
