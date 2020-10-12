package com.bridgelabz.stackqueue;

public class Stack<K> {
	private LinkedList<K> linkedList;

	public Stack() {
		linkedList = new LinkedList<K>();
	}

	// To do push operation
	public void push(K key) {
		linkedList.addFirst(key);
	}

	// prints element in stack
	public void printStack() {
		linkedList.printLinkedList();
	}
}
