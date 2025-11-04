package com.brainbeast.demos;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		Console console=System.console();
		
		if(console !=null) {
			
			
			String name=console.readLine("Enter user name: ");
			char password[]= console.readPassword("Enter Password: ");
			
			String pass= new String(password);
			console.printf(" %s !%n", name);
			console.printf(" %s !%n", pass);
			
			 // Process password (e.g., for authentication)
            // ...
            // Zero out the password array for security
			java.util.Arrays.fill(password, ' ');
		}
		else {
			System.err.println("\"No console available. Cannot run in this environment.\"");
		}

	}

}
