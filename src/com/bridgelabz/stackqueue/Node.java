package com.bridgelabz.stackqueue;

public class Node<K> {
	
	private K key;
	private Node<K> next;

	// Constructor
	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	// Setters and getters
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Node<K> getNext() {
		return next;
	}

	public void setNext(Node<K> next) {
		this.next = next;
	}


}
