package com.slk.task6.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TotaleNumberOfLine24 {
	
	//1. read Line 
	
	public  static void  totaleLine() throws IOException 
	{
File file = new File("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
		
		FileReader rd = new FileReader(file);
		BufferedReader br = new BufferedReader(rd);
		
		int line =0;
		String s;
		
		while((s=br.readLine())!=null)
		{
			line++;
		}
		br.close();
		System.out.println(line);
		
		
	}
	
	//2.Line readre (LineNumbeReader)
	public  static void lineReadre() throws IOException 
	{
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
		FileReader rd= new FileReader(file);
		LineNumberReader ln= new LineNumberReader(rd);
		
		int i=0;
		while (ln.readLine()!=null) {
			i++;
		}
		System.out.println("Totale Number of Line : "+i);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TotaleNumberOfLine24.totaleLine();
		TotaleNumberOfLine24.lineReadre();
		
	}

}


