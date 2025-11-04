package com.brainbeast.demos;

public class StringBuilderDemo {

	public static void main(String[] args) {
	
		System.out.println("StringBuilderDemo.main()");
		
		String sentence="Hi Sandip! how are you and where were you";
		
		//StringBuilder builder=new StringBuilder();
		StringBuffer builder=new StringBuffer();
		
		int i=0;
		
		for(String val: sentence.split(" ")) {
		
			builder.append(val+" ");
			System.out.println("Iteration:"+i+" "+ builder);
			i++;
		}
		
		stringDemo();
		stringBuilderDemo1();
		stringBufferDemo();
		
		
	}

	private static void stringBufferDemo() {
		System.out.println("StringBuilderDemo.stringBufferDemo()");
		
		StringBuffer stringBuffer=new StringBuffer("Sachin");
		
		stringBuffer.append(" "+ "Humbe");
		
		System.out.println("StringBuffer: "+ stringBuffer);
		
	}

	private static void stringBuilderDemo1() {
		System.out.println("StringBuilderDemo.stringBuilderDemo1()");
		
		StringBuilder builder=new StringBuilder("Sachin");
		
		builder.append(" "+ "humbe");
		
		System.out.println("builder : "+ builder);
		
		
	}

	private static void stringDemo() {
		
		System.out.println("StringBuilderDemo.stringDemo()");
		String string1="Sachin";
		//String string2= string1.concat(" "+ "Humbe");
		
		 string1= string1.concat("Humbe");
		System.out.println("string1: "+ string1);
		//System.out.println("string2: "+ string2);
		
		
		
	}

}
