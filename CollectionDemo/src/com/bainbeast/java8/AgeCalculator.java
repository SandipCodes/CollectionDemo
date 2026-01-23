package com.bainbeast.java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your DOB ");
		
		System.out.println("Enter Day(XX)");
		int day=sc.nextInt();
		
		System.out.println("Enter Month(XX)");
		int month=sc.nextInt();
		
		System.out.println("Enter Year(XXXX)");
		int year=sc.nextInt();
		
		LocalDate birth= LocalDate.of(year, month, day);
		LocalDate today= LocalDate.now();
		
		
		Period age= Period.between(birth, today);
		
		System.out.println("Age is: "+ age.getYears() + " years "+ age.getMonths() + " months "+ age.getDays() +" days");
		
	}
}
