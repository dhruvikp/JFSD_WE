package com.linkedlist;




public class LinkedListExample {

	public static void main(String[] args) {
	
//		Node n = new Node(5);
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.printList();
		
		System.out.println("Search 20: "+ list.search(20));
		System.out.println("Search 50: "+ list.search(50));
		
		list.delete(20);
		list.printList();
		
		list.delete(10);
		list.printList();
	}
}
