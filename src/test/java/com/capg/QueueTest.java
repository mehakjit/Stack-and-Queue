package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	@Test
	public void enQueueTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(30);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(65);
		Queue queue = new Queue();
		queue.addQueue(myFirstNode);
		queue.addQueue(mySecondNode);
		queue.addQueue(myThirdNode);
		queue.deQueue();
		queue.printQueue();
		int size = queue.size();
		Assert.assertEquals(2, size);
	}
}
