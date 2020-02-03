package com.slk.task11.ConsoleIO;

import java.io.Console;
import java.util.Arrays;

public class ConsoleClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		 
        if (console == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }
 
        console.printf("Welcome to Java Expert Program!\n");
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
 
        char[] correctPassword = {'n', 'i', 'm', 'd', 'a'};
 
        if (Arrays.equals(password, correctPassword)) {
            console.printf("Thanks %s, you are logged in.\n", name);
        } else {
            console.printf("Sorry, you are denied.\n");
        }
 
        Arrays.fill(password, ' ');
        Arrays.fill(correctPassword, ' ');
	}

}
