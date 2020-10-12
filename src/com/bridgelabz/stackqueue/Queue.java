package com.bridgelabz.stackqueue;

public class Queue<K> {

	private LinkedList<K> linkedList;

	public Queue() {
		linkedList = new LinkedList<K>();
	}

	// To do push operation
	public void enqueue(K key) {
		linkedList.append(key);
	}

	// prints element in stack
	public void printStack() {
		linkedList.printLinkedList();
	}

}
