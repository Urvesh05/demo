package com.slk.task6.FileIo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class FileHidden17_2 {
	
	
	public static void setHiddenFile(Path path)
	{
		System.out.println(path);
		try {
			
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);	
			System.out.println(path.getFileName()+"  File hidden "+dos.isHidden());
			
			Files.setAttribute(path, "dos:hidden", true);
			
			dos=Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(path.getFileName()+" hidden file ok -> "+dos.isHidden());
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path =Paths.get("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
		setHiddenFile(path);

	}

}
