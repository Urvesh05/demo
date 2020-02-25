package com.slk.task.example;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;

public class EncodeBase64 {

	public static void main(String[] args) throws IOException 
	{
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/p.jpg");

		BufferedImage bufferedImage = ImageIO.read(file);//file read read() method
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();// ByteArrayOutputStream class
		
		ImageIO.write(bufferedImage, "jpg", output);//write() method of ImageIO class
		
		byte[] data = output.toByteArray();//convert image to byte data
		
		String base64 = Base64.getEncoder().encodeToString(data);//convert byte to (image) base64 
		
		System.out.println("data:image/jpeg;base64,"+base64);//copy path and past to url

	}
}








//OR
/*
File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/p.jpg");

FileInputStream imageInFile = new FileInputStream(file);

 byte imageData[] = new byte[(int) file.length()];
 imageInFile.read(imageData);
String  base64Image = Base64.getEncoder().encodeToString(imageData);
System.out.println("data:image/jpeg;base64,"+base64Image);
 
 */




//https://www.codespeedy.com/how-to-convert-image-to-byte-array-in-java/
