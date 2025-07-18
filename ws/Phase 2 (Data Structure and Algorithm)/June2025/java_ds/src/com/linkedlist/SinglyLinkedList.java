package com.linkedlist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void delete(int data) {
		if(head == null) return ;
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null && current.next.data != data) {
			current = current.next;
		}
		
		if(current.next != null) {
			current.next = current.next.next;
		}
		
		
	}

	public boolean search(int key) {
		Node current = head;

		while (current != null) {
			if (current.data == key)
				return true;
			current = current.next;
		}

		return false;
	}

	public void printList() {
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
