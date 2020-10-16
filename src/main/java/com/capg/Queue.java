package com.capg;

public class Queue<K> {
	private final MyLinkedList<K> linkedList;

	public Queue() {
		this.linkedList = new MyLinkedList<K>();
	}

	public void addQueue(INode<K> newNode) {
		linkedList.append(newNode);
	}

	public int size() {
		return linkedList.size();
	}

	public boolean isEmpty() {
		if (linkedList.size() == 0)
			return true;
		else
			return false;
	}

	public void printQueue() {
		linkedList.printMyNode();
	}
}
