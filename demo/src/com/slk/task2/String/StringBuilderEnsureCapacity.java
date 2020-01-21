package com.slk.task2.String;

public class StringBuilderEnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.ensureCapacity(50);//Memory Capacity created in string size is 50 character
		stringBuilder.append("After ensureCapaciry to Memory Capacity fix size");//character size 48
		
		System.out.println(stringBuilder.capacity());
		
	}

}