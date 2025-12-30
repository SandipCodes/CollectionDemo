package com.brainbeast.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//find largest number among 3.

public class LargestNumber {

	// using ternery operator
	private static int findBiggestNum(int num1, int num2, int num3) {

		return num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
	}
    //using normal approach
	private static int findBiggestNum2(int num1, int num2, int num3) {

		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}
	}
	
	//using Collections.max(list)
	private static void findBiggestNum3(int num1, int num2, int num3) {
		
		List<Integer>  list=new ArrayList<>();
		
		list.add(num1);
		list.add(num2);
		list.add(num3);
			
		System.out.println(Collections.max(list));
	}

	//using Math.max()
	private static void findBiggestNum4(int num1, int num2, int num3) {

		 System.out.println("Largest: "+ Math.max(Math.max(num1, num2), num3));
	}

	public static void main(String[] args) {

		int num1 = 0, num2 = 0, num3 = 0, largest = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 nos: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		// largest= findBiggestNum(num1,num2,num3);
		// System.out.println("Largest among 3 nos is :" + largest );

		//largest = findBiggestNum2(num1, num2, num3);
		//System.out.println("Largest among 3 nos is :" + largest);
		
		//findBiggestNum3(num1,num2,num3);
		
		findBiggestNum4(num1,num2,num3);
		
	}
	
}
