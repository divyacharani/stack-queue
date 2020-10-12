package com.bridgelabz.stackqueue;

public class Main {

	public static void main(String[] args) {

		Queue<Integer> myQueue = new Queue<Integer>();

		// To push elements into stack
		myQueue.enqueue(56);
		myQueue.enqueue(30);
		myQueue.enqueue(70);

		// To print stack
		myQueue.printStack();
	}

	public void stackOperations() {
		Stack<Integer> myStack = new Stack<Integer>();

		// To push elements into stack
		myStack.push(70);
		myStack.push(30);
		myStack.push(56);

		// To print stack
		myStack.printStack();

		System.out.println("The top element is " + myStack.peek());

		myStack.pop(); // Pop from the stack

		System.out.println("Stack after pop operation");
		myStack.printStack();
	}

}
