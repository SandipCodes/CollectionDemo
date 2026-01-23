package com.breinbeast.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestSubstring {

	public static void main(String[] args) {
		
		String s="abcabslbas";
		char ch;
		int len=s.length();
		
		Set<Character > set=new  HashSet<>();
		StringBuilder subStr=new StringBuilder();
		Map<String, Integer> map=new HashMap<>();
		
		
		for(int i=0;i<len;i++) {
			ch=s.charAt(i);
			 if(set.add(ch)) {
				 subStr.append(ch);
			 }
			 else {
				 map.put(subStr.toString(), subStr.length());
				 subStr.setLength(0);
				 set.clear();
				 
				 //to store ch for next Sub Strings
				 set.add(ch);
				 subStr.append(ch);
			 }
		}
		
		map.forEach((key, value) -> {
		    System.out.println("Key: " + key + ", Value: " + value);
		});

		   Map.Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), 
		            Map.Entry.comparingByValue());

		        System.out.println("Max Value: " + maxEntry.getValue());
	}

}
