package com.slk.task6.FileIo;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class FileReadyOnly15 {

	public static void main(String[] args) throws FileAlreadyExistsException, NoSuchFieldException {
		// TODO Auto-generated method stub
	

		File file = new File("/home/urvesh.gayakwad/git/demo/demo/t/readonly.txt");
		
		boolean fileType= file.setReadOnly();
		
		if(fileType==true)
		{
			System.out.println("this file is read only");
		}
		else
		{
			System.out.println("unSuccessful Optaration !");
		}
	}
}
