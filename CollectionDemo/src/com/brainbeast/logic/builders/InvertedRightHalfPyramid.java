package com.brainbeast.logic.builders;

import java.util.Scanner;

/*

****
***
**
*

*/
public class InvertedRightHalfPyramid {

	public static void main(String[] args) {
	        
		    int rows = 0;
	        Scanner sc = null;
	         
	        sc = new Scanner(System.in);
	        System.out.println("Enter the no of rows to Print pattern: "); 
	        rows= sc.nextInt();
	        
	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    
	}
}










/*
 * public static void main(String[] args) {
 * 
 * int noOfLines = 0; Scanner sc = null;
 * 
 * sc = new Scanner(System.in);
 * System.out.println("Enter the no of lines to Print pattern: "); noOfLines =
 * sc.nextInt();
 * 
 * //outer for loop for (int i = noOfLines; i >= 1; i--) {
 * 
 * for (int j = 1; j <= i; j++) {
 * 
 * //System.out.print(j+ " "); System.out.print("*"+ " "); }//inner for
 * System.out.println(); }//outer for }
 */