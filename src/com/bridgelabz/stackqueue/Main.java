package com.bridgelabz.stackqueue;

public class Main {

	public static void main(String[] args) {
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
