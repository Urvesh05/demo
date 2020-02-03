package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DecompressFileInZip3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String source = "/home/urvesh.gayakwad/git/demo/demo/CompressFile/Abc.zip";
		String output = "/home/urvesh.gayakwad/git/demo/demo/CompressFile/dir10";//create dir to unzip file achive 

		System.out.println("UnZip file Archive ");
	
		System.out.println("Output to: " + output);

		
		//method 
		unzip(source, output);
	    }

	    public static void unzip(String zipFile, String output) {

		byte[] buffer = new byte[1024];

		try {

		    /** create output directory is not exists */
		    File folder = new File(output);//destination file path to create folder 
		    //create  Folder 
		    if (!folder.exists())
		    {
		    	folder.mkdirs();
		    }
		    
		    /** get the zip file content */
		    ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));//read zip file
		    
		    /** get the first zip file entry */
		    ZipEntry ze = zis.getNextEntry();
		    
		    while (ze != null) 
		    {

				File newFile = new File(output + File.separator + ze);//destination file path
	
				System.out.println("File Unzip : " + newFile.getAbsolutePath());
	
				/** create all non exists parent folders */
				//newFile.getParentFile().mkdirs();
	
				FileOutputStream fos = new FileOutputStream(newFile);
	
				int len;
				
				while ((len = zis.read(buffer)) > 0) 
				{
				    fos.write(buffer, 0, len);
				}

					fos.close();
					
					/** get the next zip file entry */
					ze = zis.getNextEntry();
		    }

		    zis.closeEntry();
		    zis.close();
		    System.out.println();
		    System.out.println(" Decompress File Done!");

		} catch (IOException ex) 
		{
		    ex.printStackTrace();
		}
	    }
		
	}
		
		






		
		/*
		File zipFile= new File("/home/urvesh.gayakwad/git/demo/demo/CompressFile/Abc.zip");
	
		File output = new File("/home/urvesh.gayakwad/git/demo/demo/CompressFile/unzip");

		
		try {
			
			
			
			FileInputStream in  = new FileInputStream(zipFile);
			
			ZipInputStream zipInputStream = new ZipInputStream(in);
			
			
			 // Get ZipEntry
			ZipEntry entry= zipInputStream.getNextEntry();
			System.out.println("ok");
			/*
			while(entry!=null)
			{
				if(entry.isDirectory())
				{
					 // Create directory
					File dir= new File(output,entry.getName());
					
					if(!dir.exists())
					{
						dir.mkdirs();
					}
					
				}
				
				else
				{
					*/ // Read zipEntry and write to a file.
			
			/*
					File file1= new File(output,entry.getName());
					FileOutputStream fileOutputStream = new FileOutputStream(file1);
					
					int i;
					byte[] data = new byte[1024];
					
					while((i=zipInputStream.read(data))!=-1)
					{
						
						fileOutputStream.write(data,0,i	);
						
						
					}
					fileOutputStream.close();
				//}
				 // Get next entry
				//entry=zipInputStream.getNextEntry();
				
			//}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
*/
