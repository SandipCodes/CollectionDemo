package com.brainbeast.demos;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		//1. adding elements 
		
		addElemets(map);
		
		
		
		
		System.out.println("Value at Key 105: "+ map.get(105));
		
		//iterating through hashmap
		printMap(map);
		
		
		map.put(null, "Rahul");
		printMap(map);
		
		//2. remove null key 
		map.remove(null);
		printMap(map);
		
		//3.get value of given key 
		System.out.println("value of key 101 : "+ map.get(101));
		
		//4. checking whether key and value is present or not
		
		System.out.println("Contains key 102: "+ map.containsKey(102));
		System.out.println("Contains Value Vijaya: "+ map.containsValue("Vijaya"));
		
		//5. print size of the map
		System.out.println("Size of map is:  "+ map.size());

		//6. clear the map
		System.out.println("Map before clearing: ");
		printMap(map);
		
		map.clear();
		System.out.println("Map after clearing.");
		printMap(map);
	}

	private static void addElemets(HashMap<Integer, String> map) {
		map.put(101, "Sandip");
		map.put(107,"Sachin");
		map.put(108, "Dhanajay");
		map.put(104, "Vijaya");
		map.put(null, "Shree");
		map.put(105, null);
		map.put(106, null);
	}

	private static void printMap(HashMap<Integer, String> map) {
		
		System.out.println("---------------------------------");
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			
			System.out.println("Key: "+ entry.getKey()+ "  Value: "+  entry.getValue() );
		}
		
		System.out.println("---------------------------------");
		
	}

}
