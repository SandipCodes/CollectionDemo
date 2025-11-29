package cpm.bainbeast.poc;

import java.util.Arrays;
import java.util.List;

public class StreamApiTest {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Sandip","Sachin","Sunita","Archana","Ashiwini");
		
		List<String> contacts=Arrays.asList("7709595657","9881365999",
				                            "9518386334","9561605305",
				                            "7709595657","9881365999");
		
		
				     
				
				          
		
		names.stream()
	    .forEach(System.out :: println);

		System.out.println("-----------------------------");
		names.stream()
		    .map(String :: toUpperCase)
		    .forEach(System.out :: println);

		System.out.println("-----------------------------");
		names.stream()
	    .map(String :: toLowerCase)
	    .forEach(System.out :: println);

		System.out.println("-----------------------------");
		//remove duplicate from contacts.
		contacts.stream()
        .forEach(System.out :: println);
         
		System.out.println("-----------------------------");
		contacts.stream()
		        .distinct()
		        .forEach(System.out :: println);
		System.out.println("-----------------------------");
	}//main()

}//class
