package cpm.bainbeast.poc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiTest {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Sandip","Sachin","Sunita","Archana","Ashiwini");
		
		List<String> contacts=Arrays.asList("7709595657","9881365999",
				                            "9518386334","9561605305",
				                            "7709595657","9881365999");
       List<Integer> marks= Arrays.asList(65,45,78,96,86,36,81,89);
       
       
				     
				
				          
		
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

	
		List<String> names2= names.stream()
				                  .map(String :: toUpperCase)
				                  .collect(Collectors.toList());
		System.out.println(names2);
		System.out.println("-----------Marks------------------");

		 marks.stream()
		      .forEach(mark -> System.out.print(mark+ ","));
		 
		 System.out.println();
		System.out.println("-----------------------------");

		System.out.println("Marks > 80");
		marks.stream()
		     .filter(m-> m>80)
		     .forEach(System.out:: println);
		
		System.out.println("-----------------------------");

		System.out.println(" even numbers ");
		
		marks.stream()
		     .filter(n -> n%2 ==0)
		     .forEach(System.out :: println);
		
		System.out.println("-----------------------------");

		System.out.println(" First even number ");
		
		marks.stream()
		     .filter(n -> n%2 ==0)
		     .findFirst()
		     .ifPresent(System.out :: println);
		
		System.out.println("-----------------------------");
        System.out.println("Count of students having 80+ marks ");
		
		long count = marks.stream()
		           .filter(n -> n>80)
		           .count();
		          
		System.out.println("Count: "+ count);
		
		//--------------------------------------------
		
		System.out.println("----------Sum of All Marks-------------------");
		
		int total = marks.stream()
		           .reduce(0, Integer :: sum);
		
		System.out.println("Total Of All Marks:"+ total);

		//------------------------------------------------------
		System.out.println("--------Sorting---------------------");
		
		names.stream()
		     .sorted()
		     .forEach(System.out :: println);

		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List of Strings: " + sortedNames);
   
		//now count the occurance of the each string
		
		Map<String, Long> wordCounts= names.stream()
				                           .collect(Collectors.groupingBy(s-> s, Collectors.counting()));
		System.out.println("Count of Strings: " + wordCounts);
	}//main()

}//class
