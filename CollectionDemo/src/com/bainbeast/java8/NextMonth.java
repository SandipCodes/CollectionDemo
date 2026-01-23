package com.bainbeast.java8;

import java.time.LocalDate;

public class NextMonth {

	public static void main(String[] args) {
		
		LocalDate today= LocalDate.now();
		
		LocalDate nextMonth= today.plusMonths(2);
		
		System.out.println("Today: " +today);
		System.out.println("Next Month: " + nextMonth);
	}

}
