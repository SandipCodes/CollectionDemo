package com.brainbeast.practice;

public class BinaryStringAddition {

	public static void main(String[] args) {
		
		String x="1001";
		String y="0110";
		
		System.out.print(add_binary(x,y));
	}

	private static String add_binary(String x, String y) {
		
		//converting binary strings into decimal numbers
		int num1=Integer.parseInt(x,2);
		int num2=Integer.parseInt(y,2);
		
		int sum=num1+num2;
		
		//converting decimal result into binary string
		String result= Integer.toBinaryString(sum);
		
		return result;
	}

	
}
