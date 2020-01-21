package com.slk.task.opps;

public class ArrayJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring 2-D array with 2 rows 
		int arr[][] = new int[3][];
		
		//first row has 3 columns
		arr[0]= new int[3];
		
		//second row has 4 columns
		arr[1]= new int [4];
		
		//third row has 3 columns
		arr[2]= new int [3];
		
		// Initializing array 
		int count =0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		}
		
		//print 
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
