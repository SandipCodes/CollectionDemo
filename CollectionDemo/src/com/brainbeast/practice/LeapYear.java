package com.brainbeast.practice;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

	private static void isLeapyear(int year) {

		boolean is_leap_year=false;
		
		
		if(year % 4 ==0) {
			is_leap_year=true;
			
			if(year % 100 ==0) {
				
				if(year % 400 ==0) { 
					is_leap_year=true;
				}
				else {
					is_leap_year=false;
				}
			}
		}
		
		if(is_leap_year) {
			System.out.println(year + " is Leap Year");
		}
		else {
			System.out.println(year + " isnot a Leap Year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int year=0;
		
		do{
		    
			System.out.println("Enter the Year: ");
			 year=sc.nextInt();
			isLeapyear(year);
		}while(year !=0);
		// System.out.println(Year.isLeap(1900));
	}

}
