package cpm.bainbeast.poc;

import java.util.Arrays;
import java.util.List;

public class StreamApiTest {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Sandip","Sachin","Sunita","Archana","Ashiwini");
		
		
		names.stream()
	    .forEach(System.out :: println);

		names.stream()
		    .map(String :: toUpperCase)
		    .forEach(System.out :: println);

		names.stream()
	    .map(String :: toLowerCase)
	    .forEach(System.out :: println);

	}//main()

}//class
