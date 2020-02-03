package com.slk.task11.ConsoleIO;

import java.util.Scanner;

public class StanderIoScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner in = new Scanner(System.in);
        System.out.println("enter name");
		String s = in.nextLine();
		System.out.println("You entered string "+s);
		
		System.out.println("enter id");
		int a = in.nextInt();
		System.out.println("You entered integer "+a);
	
	}

}
