package com.slk.task.opps;

public class ArryMultiDimensional {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Store in Row And Column
		//declaring and initializing 2D array 2 rows &2 Column 
		//int arr[][] = new int[2][2];
		
		
		int arr1[][]= {{1,2,12},{4,5,23},{15,7,8}};
		
		//row
		for(int i=0;i<arr1.length;i++)
		{
			//Column
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
