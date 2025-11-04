package com.brainbeast.practice;

import java.util.Scanner;

public class Swap2Nos {

	public static void main(String[] args) {
		
		int no1=0,no2=0;
		Scanner sc=null;
		
		sc=new Scanner(System.in);
		
		System.out.println("enter first No:");
		no1=sc.nextInt();
		

		System.out.println("enter second No:");
		no2=sc.nextInt();
		
		
		System.out.println("No1: "+ no1);
		System.out.println("No2: "+ no2);
	
		//swap nos using temp var
		swapUsingTemp(no1, no2);
		//swap Without using temp var
		swapWithoutTemp(no1, no2);
		
		//swap nos using Bitwise XOR
	}//main

	private static void swapUsingTemp(int no1, int no2) {
		int temp=0;
		System.out.println("Swap2Nos.swapUsingTemp()");
		temp=no1;
		no1=no2;
		no2=temp;
		
		
        System.out.println("After Swapping:");
		System.out.println("No1: "+ no1);
		System.out.println("No2: "+ no2);
	}
	private static void swapWithoutTemp(int no1, int no2) {
		System.out.println("Swap2Nos.swapWithoutTemp()");
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		System.out.println("After Swapping:");
		System.out.println("No1: "+ no1);
		System.out.println("No2: "+ no2);
	}
	private static void swapUsingXOR(int no1, int no2) {
		no1=no1 ^ no2;
		no2= no1 ^ no2;
		no1= no1 ^ no2;
		
		System.out.println("After Swapping:");
		System.out.println("No1: "+ no1);
		System.out.println("No2: "+ no2);
	}
}//cllss
