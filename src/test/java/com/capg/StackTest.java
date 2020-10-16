package com.capg;

import org.junit.Test;

import org.junit.Assert;

public class StackTest {
    @Test 
    public void testPop() {
    	MyNode<Integer> myFirstNode = new MyNode<Integer>(30);
    	MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(65);
    	Stack stack = new Stack();
    	stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
//		INode node = stack.peak();
		INode<Integer> node = stack.pop();
		stack.printStack();
		Assert.assertEquals(myThirdNode, node);
    }
}
