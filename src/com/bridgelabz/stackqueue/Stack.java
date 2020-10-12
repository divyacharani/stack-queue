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

	// Method to peak stack
	public K peek() {
		return linkedList.getHead().getKey();
	}

	// Method to pop
	public K pop() {
		K element = linkedList.pop();
		return element;
	}
}
