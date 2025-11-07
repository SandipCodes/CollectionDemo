package com.brainbeast.dsa.demos;

public class LinkedListDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Node head=new Node(1,"Sandip");
		head.next=new Node(2,"Sachin");
		head.next.next=new Node(3,"Dhnajay");
		head.next.next.next=new Node(5,"shree");
		
		Node temp=head;
		
		// traverseList(temp);
		// printList(temp);
		
		//int x=1;
		//String n="Sanchita";
		
		/*
		 * //insert at front head=insertAtFront(head, 50, "Sanchita"); printList(head);
		 * 
		 * //insert at End insertAtEnd(head,100,"Madhu"); printList(head);
		 */
		
		//insert at middle
		
		/*
		 * head= insertAtMiddle(head,4,4,"Vijaya"); printList(head);
		 * 
		 * head=deleteAtFirst(head); printList(head);
		 * 
		 * head=deleteAtEnd(head); printList(head);
		 */
		printList(head);
		head= deleteAtAnywhere(head,2);
		printList(head);
		
		int key=5;
		if(serachKeyRecursive(head, key)) {  //serachKey(head,key)
			System.out.println("key present in list: "+ key);
		}
		else {
			System.out.println("Key isnot present in the list..");
		}
	}

	private static boolean serachKeyRecursive(Node head, int key) {
		
		if(head==null)
			return false;
		
		if(head.data==key) {
			return true;
			
		}
			
		return serachKey(head.next, key);
	}
	private static boolean serachKey(Node head, int key) {
		
		System.out.println("LinkedListDemo.serachKey()");
		Node temp=head;
		
		 while(temp !=null) {
			 
			  if(temp.data ==key) {
				  return true;
			  }
			  temp=temp.next;
		 }
		return false;
	}

	private static Node deleteAtAnywhere(Node head, int pos) {
		
		System.out.println("LinkedListDemo.deleteAtAnywhere()");
		Node temp=head;
		
		// if head is to be deleted
		if(pos==1) {
			head=temp.next;
			return head;
		}
		
		Node prev=null;
		
		for(int i=1; i< pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		
		// now delete the node at pos
		
		prev.next=temp.next;
		
		return head;
	}

	private static Node deleteAtEnd(Node head) {
		
		System.out.println("LinkedListDemo.deleteAtEnd()");
		//if list is empty
		if(head==null)
			 return null;
		
		//if list has only one element
		if(head.next==null)
			 return null;
		
		Node secondLast=head;
		
		//traverse till second last element of list
		while(secondLast.next.next !=null) {
			secondLast= secondLast.next;
		}
		//now delete the last element 
		
		secondLast.next=null;
		
		return head;
	}

	private static Node deleteAtFirst(Node head) {
		
		System.out.println("LinkedListDemo.deleteAtFirst()");
		if(head ==null)
			 return null;
		
	
		System.out.println("Deleted Item is: "+ head.data +":"+head.name);
		return head.next;
	}

	private static Node insertAtMiddle(Node head, int pos, int data, String name) {
		System.out.println("LinkedListDemo.insertAtMiddle()");
		Node newNode=new Node(data, name);
		
		if(pos < 1)
			return head;
		
		if(pos==1) {
			
			newNode.next=head;
			return newNode;
		}
		
		Node curr= head;
		
		for(int i=1; i < pos-1 && curr != null; i++ ) {
			curr=curr.next;
		}
		
		if(curr==null) {
			return head;
		}
		
		/*
		 * Node temp =curr.next; curr.next=newNode; newNode.next= temp;
		 */
		//Node temp=curr.next;
		//newNode.next=temp;
		//curr.next=newNode;
		
		 newNode.next= curr.next;
		curr.next= newNode;
		
		return head;
	}

	private static void insertAtEnd(Node head, int d, String n) {
		
		Node newNode=new Node(d, n);
		
		 if(head ==null)
			 head=newNode;
			  //return newNode;
		  
		 Node last=head;
		 
	      while(last.next !=null)
	    	  last=last.next;
	      
	      last.next=newNode;
	      
		//return head;
	}

	//traversing the linked list
	private static void printList(Node temp) throws InterruptedException {
		
		while(temp !=null) {
			
			System.out.print(temp.data+ ":"+temp.name);
			    
			   if(temp.next!=null)
				    System.out.print("-> ");
			temp=temp.next;
			Thread.sleep(1500); 
		}
		System.out.println();
	}

	private static void traverseList(Node temp) throws InterruptedException {
		
		 if(temp ==null) {
			 System.out.println();
			 return;
		 }
		 
		 System.out.print(temp.data + ":"+temp.name);
		 Thread.sleep(5000);
		 if(temp.next !=null) {
			 System.out.print("=> ");
		 }
		 
		traverseList(temp.next);
	}
	private static Node insertAtFront(Node head, int x, String n) {
		
		//create new element
		Node newNode=new Node(x, n);
		
		//link it at start
		newNode.next=head;
		return newNode;
	}

}
