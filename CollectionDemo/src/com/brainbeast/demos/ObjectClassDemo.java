package com.brainbeast.demos;

public class ObjectClassDemo {

	public static void main(String[] args) {
		

		MyClass obj1=new MyClass("Alpha");
		MyClass obj2=new MyClass("Alpha");
		MyClass obj3=new MyClass("Beta");
		MyClass obj4=new MyClass("Beta");
		
		System.out.println("obj1.toString() : "+ obj1.toString());
		System.out.println("obj1.toString() : "+ obj2.toString());
		System.out.println("obj1.toString() : "+ obj3.toString());
		
		
		System.out.println(".hashcode() : "+ obj1.hashCode());
		System.out.println(".hashcode() : "+ obj2.hashCode());
		System.out.println(".hashcode() : "+ obj3.hashCode());
		System.out.println(".hashcode() : "+ obj4.hashCode());

	
	    System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // Uses overridden equals()
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));
        System.out.println("obj1.getClass(): " + obj1.getClass()); // Uses getClass() from Object
	}

}
