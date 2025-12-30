package com.brainbeast.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the num: ");
		num=sc.nextInt();
		
		givePrimNos(num);

	}

	private static void givePrimNos(int num) {
		
		int x=0,y=0, flag;
		
		
		for(x=1;x <=num; x++) {
			
			if(x==1)
				continue;
			
			flag=1;
			
			for(y=2; y<= (x/2); ++y) {
				
				if(x%y==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(x + " ");
			}
		}
		
	}

}
