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

	// prints element in queue
	public void printQueue() {
		linkedList.printLinkedList();
	}

	// To do delete operation
	public K dequeue() {
		K element = linkedList.pop();
		return element;
	}

}
