package com.brainbeast.practice;

import java.util.Scanner;

//find lcm of two no

public class LCMFinder {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 nos: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		findLCM(num1,num2);
	}

	private static void findLCM(int num1, int num2) {
		
		//find bigger among two
		
		int ans= (num1>num2) ? num1:num2;
		
		//calculate lcm 
		
		while(true) {
			
			if(ans % num1 ==0 &&  ans % num2==0) 
				break;
			ans++;
		}
		
		System.out.println("LCM Of {num1="+ num1 +"&num2:"+ num2 +"} is: " + ans);
	}

}
