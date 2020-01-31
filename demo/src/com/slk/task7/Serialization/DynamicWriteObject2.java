package com.slk.task7.Serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DynamicWriteObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Demo d1 = new Demo("dd",2112);
		Demo d2 = new Demo ("ddzx",232);
		Demo d3 = new Demo ("ttt",343);
		
		ArrayList< Demo> array= new ArrayList<Demo>();
		array.add(d1);
		array.add(d2);
		array.add(d3);
		array.add(new Demo("eee", 121));

		try {
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream writeData = new ObjectOutputStream(out);
			
			writeData.writeObject(array);
			
			writeData.flush();
			writeData.close();
			
			System.out.println("data Write in File ");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}

}
