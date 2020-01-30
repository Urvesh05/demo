package com.slk.task6.FileIo;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConvertStringToInputStream23 
{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String s="Hello Godd Morning";
		
		//Here converting string to input stream(Bytes)
		InputStream in = new ByteArrayInputStream(s.getBytes());
		
		//read file 
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		 String readFile = br.readLine();
		 
		while (readFile !=null)
		{
			System.out.println(readFile);
			break;
			//readFile=br.readLine();
		}
		
	}

}
