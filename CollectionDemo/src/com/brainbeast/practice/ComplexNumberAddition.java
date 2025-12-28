package com.brainbeast.practice;

public class ComplexNumberAddition {

	int real, imag;

	public ComplexNumberAddition(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	private void showNum() {

		System.out.println(this.real + "+" + this.imag + "i");
	}

	private static ComplexNumberAddition addComplexNumbers(ComplexNumberAddition n1, ComplexNumberAddition n2) {

		ComplexNumberAddition result = new ComplexNumberAddition(0, 0);

		result.real = n1.real + n2.real;
		result.imag = n1.imag + n2.imag;

		return result;

	}

	public static void main(String[] args) {

		ComplexNumberAddition c1=new ComplexNumberAddition(4, 10);
		ComplexNumberAddition c2= new ComplexNumberAddition(5, 8);
		
		c1.showNum();
		c2.showNum();
		
		ComplexNumberAddition res= addComplexNumbers(c1, c2);
		
		System.out.print("c1+c2 =");
		 res.showNum();
		
	}

}
