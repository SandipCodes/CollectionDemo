package com.brainbeast.demos;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<>(new CustomComparator());
		
		//1. add element
		
		map.put(101, "Sandip");
		map.put(103, "Vijaya");
		map.put(108, "Sachin");
		map.put(105, "Dj");
		map.put(104, "Sandy");	
		map.put(102, "Suraj");
		map.put(110, "Prashant");
		
		System.out.println("--------------------------");
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
				System.out.println("Key: " +entry.getKey()+ "   Value:"+ entry.getValue() );
		}
	}
}
