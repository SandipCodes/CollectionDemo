package com.brainbeast.dsa.demos;

public class LinkedListDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Node head=new Node(10,"Sandip");
		head.next=new Node(20,"Sachin");
		head.next.next=new Node(30,"Dhnajay");
		
		Node temp=head;
		
		//traversing the linked list
		while(temp !=null) {
			
			System.out.println(temp.data+ "  "+temp.name);
			temp=temp.next;
			Thread.sleep(5000); 
		}

	}

}
