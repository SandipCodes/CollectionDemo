package com.brainbeast.demos;

public class CharSequenceDemo {

	public static void main(String[] args) {
	
		String name="Sandip";
		StringBuilder lname=new StringBuilder("Humbe");

		CharSequence cs1,cs2;
		cs1= name;
		cs2=lname;
		
		System.out.println("Length: "+ cs1.length());
		System.out.println("CharAt index 2: " + cs1.charAt(2));
		System.out.println("Substring: "+ cs1.subSequence(0, 3));
        System.out.println("Char to String: "+ cs1.toString());
	
	
    	System.out.println("Length: "+ cs2.length());
		System.out.println("CharAt index 2: " + cs2.charAt(2));
		System.out.println("Substring: "+ cs2.subSequence(0, 3));
        System.out.println("Char to String: "+ cs2.toString());

	}

}
