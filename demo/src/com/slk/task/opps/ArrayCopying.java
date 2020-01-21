package com.slk.task.opps;

public class ArrayCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] copyFrom= {'c','o','m','p','u','t','r'};
		
		char[]copyTo =new char[6];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 3);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println(String.copyValueOf(copyTo));

	}

}
