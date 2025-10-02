package com.brainbeast.collection.demos;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();
        
		list.add("Java");
		list.add("C++");
		list.add("python");
	
		
		list2.add("Java");
		list2.add("C++");
		
		System.out.println("All The Programming Lang. are :");
		
		for(String lang: list) {
			System.out.println(lang);
		}
		
		System.out.println("----------------------------------");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Java"));
		System.out.println(list.add("go"));
		
		System.out.println(list.indexOf("go"));
		
		System.out.println(list.get(2));
		
		
		System.out.println("-----------------------------------");
		
		System.out.println(list.containsAll(list2));
        
		
		System.out.println(list.addAll(list2));
        
        
		System.out.println("----------------------------------");
		
		
		for(String lang: list) {
			System.out.println(lang);
		}
		
		System.out.println(list.lastIndexOf(list));
		
	}//main()
}//class
