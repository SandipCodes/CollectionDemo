package com.brainbeast.practice;

import java.util.Scanner;

public class LowerCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String lowerCaseStr = str.toLowerCase();
		System.out.println("Lower case string: " + lowerCaseStr);
		sc.close();
	}

}
