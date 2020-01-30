package com.slk.task6.FileIo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeModification25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("  Last Modified Date (before) :"+date1.format(file.lastModified()));
		
		file.setLastModified(new Date().getTime());
		
		System.out.println("  Last Modified Date (after) :"+date1.format(file.lastModified()));
		
	}

}
