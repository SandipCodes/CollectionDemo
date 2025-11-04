package com.brainbeast.demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * System.out.println("Enter int: "); int val=
		 * Integer.parseInt(reader.readLine()); System.out.println("Entered Value: "
		 * +val);
		 */

		int len=args.length;
		int i=0;
		 while(i < len) {
	
			 System.out.println("arg: "+i+ "-"+ args[i] );
			 i++;
			 
		 }
		}

}
