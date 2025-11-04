package com.brainbeast.practice;

import java.util.Scanner;

public class Decimal2Binary {

	
	static void decToBinary(int n) {
		//array to store binary no
		
		int[] binaryNum= new int[200];
		
		int i=0;
		
		
		while(n> 0) {
			binaryNum[i]= n%2;
			n=n/2;
			i++;
		}//while
		
		//reverse printing of array
		for(int j=i-1;j>=0;j--) {
			System.out.print(binaryNum[j]+ " ");
		}//for
	}//decToBin()
	
	public static void main(String[] args) {
		
		int n=0;
		Scanner sc=null;
		
		sc=new Scanner(System.in);
		System.out.println("Enter the Decimal No: ");
		
		n=sc.nextInt();
		
		System.out.println("Binary : ");  
		decToBinary(n);
		
		
	}

}
