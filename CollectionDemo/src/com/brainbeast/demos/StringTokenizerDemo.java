package com.brainbeast.demos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		System.out.println("StringTokenizerDemo.main()");
		
		Scanner scanner=new Scanner(System.in);
		String sentence=scanner.nextLine();
		
		StringTokenizer tokenizer=new StringTokenizer(sentence," ");
		String token;
		
		while(tokenizer.hasMoreTokens()) {
		    token=tokenizer.nextToken();
		    System.out.println(token + "------------>Remained: "+tokenizer.countTokens() );
		    //System.out.println(tokenizer.countTokens());
			
		}

	}

}
