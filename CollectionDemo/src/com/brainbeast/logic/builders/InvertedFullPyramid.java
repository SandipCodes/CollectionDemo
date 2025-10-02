package com.brainbeast.logic.builders;

import java.util.Scanner;

/*

     *******
      *****
       ***
        *

*/

public class InvertedFullPyramid {

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
			for(int k=1; k<i;k++) {
				System.out.print(" ");
			}
			 //inner loop for printing *
			for (int j = 1; j <= max_elements; j++) {

				System.out.print("*");
			}
			
		
		
			max_elements= max_elements-2;
		    // Move to the next line after each row is complete
			System.out.println();
		} // for

		 
	}// main

}// class
