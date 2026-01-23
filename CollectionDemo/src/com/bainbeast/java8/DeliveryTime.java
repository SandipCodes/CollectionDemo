package com.bainbeast.java8;

import java.time.Duration;
import java.time.LocalTime;

public class DeliveryTime {

	public static void main(String[] args) {
		
		LocalTime order= LocalTime.of(10, 20);
		LocalTime delivery=LocalTime.of(11, 15);
		
		Duration d= Duration.between(order, delivery);
		
		System.out.println("Time Taken: " + d.toMinutes()+ "minutes");
	}

}
