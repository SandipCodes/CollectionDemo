package com.brainbeast.demos;

import java.util.HashSet;
import java.util.Map;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> names=new HashSet<>();
		
		names.add("Sandip");
		names.add("Sachin");
		names.add("Vijaya");
		names.add("Dj");
		names.add(null);
		names.add(null);
		
		
		//print
		
	     for(String name: names) {
	    	 
	    	 System.out.println(name);
	     }
		

	}

}
