package com.brainbeast.demos;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		DataInputStream inputStreamDemo=new DataInputStream(System.in);
		
		System.out.println("Enter the No: ");
        int no=Integer.parseInt(inputStreamDemo.readLine());
		
        System.out.println("Enter the Name: ");
        String name=inputStreamDemo.readLine();
		
        System.out.println("Mono: "+ no);
        System.out.println("name: "+ name);
	}

}
