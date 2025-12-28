package com.brainbeast.practice;

import java.util.Scanner;


//using brtforce method /2
public class OddEvenTest {

	public static void main(String[] args) {
		
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		checkNum1(num);
		System.out.println();

		System.out.println("Enter the number:");
		num=sc.nextInt();
		checkNum2(num);
		System.out.println();
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		checkNum3(num);
		System.out.println();
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		checkNum4(num);
		System.out.println();
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		checkNum5(num);
		System.out.println();

	}
    
	//checking LSB(least significant bit) 0-even, 1- odd
	private static void checkNum5(int num) {
		
		if(num !=0) {
			
			if(Integer.toBinaryString(num).endsWith("0")) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd number");
			}
		}
		
	}

	//Using Bitwise XOR
	private static void checkNum4(int num) {
		
		if((num ^ 1) == num+1) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}

	//// Using Bitwise AND
	 private static void checkNum3(int num) {
		
		 
		 if((num & 1) == 1) {
			 System.out.println("Odd Number");
		 }
		 else {
			 System.out.println("Even Number.");
		 }
		 
		
	}

	 //Using Bitwise OR
     private static void checkNum2(int num) {
    	
		System.out.println("OddEvenTest.checkNum2()");
		if((num | 1) > num) {
			System.out.println("number is Even");
		}
		else {
			System.out.println("number is odd");
		}
	}

	 // divide by 2
	private static void checkNum1(int num) {
		
		System.out.println("OddEvenTest.checkNum1()");
		if(num % 2==0) {
			System.out.println("No is Even");
		}
		else {
			System.out.println("No is Odd");
		}
	}

}
