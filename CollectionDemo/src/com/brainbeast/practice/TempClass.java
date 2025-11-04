package com.brainbeast.practice;

public class TempClass {

	public static void main(String[] args) {
		
		//byteAndchar();
		
		String s1="sandip";
		String s2=null;
		
		System.out.println(s1.concat(s2));
	}

	private static void byteAndchar() {
		byte ascii[]= { 71,70,71};
		char ch[]= {'S','A','N'};
		
		String s1=new String(ascii);
		System.out.println(s1);
		
		String s2=new String(ascii,1,2);
		System.out.println(s2);
		
		String s3=new String(ch);
		System.out.println(s3);
		
		String s4=new String(ch,1,2);
		System.out.println(s4);
	}

}
