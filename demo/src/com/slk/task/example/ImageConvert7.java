package com.slk.task.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ImageConvert7 
{

	public static void main(String[] args) throws Exception 
	{
		 	String imagePath = "/home/urvesh.gayakwad/git/demo/demo/Abc/p.jpg";
		    System.out.println("=================Encoder Image to Base 64!=================");
		    
		    String base64ImageString = encoder(imagePath);
		    
		    System.out.println("data:image/jpeg;base64," + base64ImageString);//copy path to past url
		 
		   // System.out.println("DONE!");
		    
		    /*
		    System.out.println("=================Decoder Base64ImageString to Image!=================");
		    decoder(base64ImageString, "/home/urvesh.gayakwad/git/demo/demo/Abc/p3.jpg");
		    
		    decoder(base64ImageString, "/home/urvesh.gayakwad/git/demo/demo/Abc/p2.txt");
		   // System.out.println("Base64ImageString = " + base64ImageString);
		    */
		   
		    
	}
		    
		    public static String encoder(String imagePath) //method 
		    {
		        String base64Image = "";
		        File file = new File(imagePath);
		        
		        try (FileInputStream imageInFile = new FileInputStream(file)) 
		        {
		          // Reading a Image file from file system
		          byte imageData[] = new byte[(int) file.length()];
		          imageInFile.read(imageData);
		          base64Image = Base64.getEncoder().encodeToString(imageData);
		          
		        } catch (FileNotFoundException e) 
		        {
		          System.out.println("Image not found" + e);
		          
		        } catch (IOException ioe)
		        
		        {
		          System.out.println("Exception while reading the Image " + ioe);
		        }
		        return base64Image;
		      }
}
		     









		    /*
		      public static void decoder(String base64Image, String pathFile)
		      {
		        try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) 
		        {
		          // Converting a Base64 String into Image byte array
		          byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
		          imageOutFile.write(imageByteArray);
		          
		        } catch (FileNotFoundException e) 
		        {
		          System.out.println("Image not found" + e);
		        } catch (IOException ioe) 
		        {
		          System.out.println("Exception while reading the Image " + ioe);
		          
		        }
		        
		
	}*/
//}






//https://www.youtube.com/watch?v=M1aWWLnygdU
	//https://www.youtube.com/watch?v=bl532AUqzNk
	//https://www.codercrunch.com/codelet/1171935575/convert-a-base64-encoded-image-data-back-to-an-image
