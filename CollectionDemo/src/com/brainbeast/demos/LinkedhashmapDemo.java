package com.brainbeast.demos;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
		
		//1. addd lement to map

		addElements(map);	
		
		//2. print map
		
		printMap(map);
		
		//3. remove element
		
		map.remove(102);
		printMap(map);
	}

	private static void printMap(LinkedHashMap<Integer, String> map) {
		System.out.println("--------------------------");
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
				System.out.println("Key: " +entry.getKey()+ "   Value:"+ entry.getValue() );
		}
		System.out.println("--------------------------");
		
	}

	private static void addElements(LinkedHashMap<Integer, String> map) {
		map.put(101, "Sandip");
		map.put(103, "Vijaya");
		map.put(108, "Sachin");
		map.put(105, "Dj");
		map.put(104, "Sandy");	
		map.put(102, "Suraj");
	}

}
