package com.brainbeast.dsa.demos;

public class DoublyLinkedListDemo {

	public static void main(String[] args) throws InterruptedException {

		// 1st
		DNode head = new DNode(10);

		// 2nd
		head.next = new DNode(20);
		head.next.prev = head;

		// 3rd
		head.next.next = new DNode(30);
		head.next.next.prev = head.next;

		head.next.next.next = new DNode(40);
		head.next.next.next.prev = head.next.next;

		DNode temp = head;

		while (temp != null) {

			System.out.print(temp.data);

			if (temp.next != null) {
				System.out.print("<-->");
			}
			Thread.sleep(1500);
			temp = temp.next;
		}
		while (temp.prev != null) {

			System.out.print(temp.data);

			if (temp.prev != null) {
				System.out.print("<-->");
			}
			Thread.sleep(1500);
			temp = temp.prev;
		}
	}

}
