package slk.src.Prectice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		//create 
		File f=new File("C://temp//testFile1.txt");

		
		if(f.createNewFile())
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}
		
		//write data in this file 
		
		FileWriter writer =new FileWriter(f);
		writer.write("Good  morning");
		writer.close();
		
	}

}
