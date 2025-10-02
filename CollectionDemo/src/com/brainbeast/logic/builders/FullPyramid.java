package com.brainbeast.logic.builders;

import java.util.Scanner;

/*

        *
       ***
      *****
     *******

*/

public class FullPyramid {

	public static void main(String[] args) {

		int noOfLines = 0;
		Scanner sc = null;

		sc = new Scanner(System.in);
		System.out.println("Enter the no of lines to Print pattern: ");
		noOfLines = sc.nextInt();
		int max_elements = noOfLines + (noOfLines - 1);

		//outer loop for no of rows
		for (int i = 1; i <= noOfLines; i++) {

			 //inner loop for leading spaces
			 // no of spaces decreases with each row
			for (int j = 1; j <= noOfLines - i; j++) {

				System.out.print(" ");
			}
			
			 //inner loop for printing *
			 // no of * increases with each row (2*i-1)
			
			for(int k=1; k<=(2*i-1);k++) {
				System.out.print("*");
			}
			
		    // Move to the next line after each row is complete
			System.out.println();
		} // for

		 
	}// main

}// class
