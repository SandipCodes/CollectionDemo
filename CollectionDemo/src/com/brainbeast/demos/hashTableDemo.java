package com.brainbeast.demos;

import java.util.Hashtable;
import java.util.Map;

public class hashTableDemo {

	public static void main(String[] args) throws InterruptedException {
	
		
		Hashtable<Integer, String> studentsRecord=new Hashtable<>();
		
		//adding values to hashtable
		
		studentsRecord.put(101, "Sandip");
		studentsRecord.put(102, "Sachin");
		studentsRecord.put(103, "Dhananjay");
		studentsRecord.put(104, "Vijaya");
		//print some value
		
		System.out.println("Student With Id:101--> Name: "+ studentsRecord.get(101));
		
		//iteratingthrough the hashTable
		
		for(Map.Entry<Integer, String> entry: studentsRecord.entrySet()) {
			
			System.out.println("Id: "+ entry.getKey() + "   Name: "+ entry.getValue());
			Thread.sleep(2500);
		}
		
		//checking whether key exits 
		
		System.out.println("101 Key Exits or not : "+ studentsRecord.containsKey(101));
		
		studentsRecord.remove(101);
		System.out.println("After removal 101 Key Exits or not : "+ studentsRecord.containsKey(101));
		
	}

}
