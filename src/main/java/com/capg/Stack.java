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
	
}
