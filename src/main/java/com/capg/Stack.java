package com.capg;

public class Stack<K> {
	private final MyLinkedList<K> myLinkedList;

	public Stack() {
		this.myLinkedList = new MyLinkedList<K>();
	}

	public void push(INode<K> node) {
		myLinkedList.add(node);
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public INode<K> pop() {
		return myLinkedList.pop();
	}

	public boolean isEmpty() {
		if (myLinkedList.size() == 0)
			return true;
		else
			return false;
	}

	public int size() {
		return myLinkedList.size();
	}
}
