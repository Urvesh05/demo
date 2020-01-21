package com.slk.task.opps;

import java.util.Arrays.*;
public class ArrayIndexOutOfBounds {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		
		try {
			int arr[]= {80,90,76,40,67};
			
			for(int i=0;i<10;i++)
			{
				System.out.println(arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		

	}

}
