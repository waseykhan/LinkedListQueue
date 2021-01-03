package com.waseykhan.queue;

public class Main {

	public static void main(String[] args) {
		LinkedListQueue llq = new LinkedListQueue();
		llq.getNodes();
		System.out.println("items to dequeue " + llq.dequeue());
		llq.enqueue(2);
		System.out.println("Size " + llq.getSize());
		System.out.println("--------------------------------");
		llq.enqueue(3);
		llq.enqueue(4);
		llq.enqueue(5);
		llq.getNodes();
		System.out.println("--------------------------------");
		System.out.println("There are " + llq.getSize() + " item(s) in the queue");
		System.out.println("Value Dequeued " + llq.dequeue());
		System.out.println("There are " + llq.getSize() + " item(s) in the queue");
		System.out.println("--------------------------------");
		llq.getNodes();

	}

}
