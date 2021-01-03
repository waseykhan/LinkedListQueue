package com.waseykhan.queue;

public class LinkedListQueue {

	Node head;  //create a head node pointer to the first node
	Node tail;	//create a tail node pointer to the last node
	int size;   //track the size of the queue

	public LinkedListQueue() {
		this.head = null;        //initialize head to null
		this.tail = null;		 //initialize tail to null
		this.size = 0;			 //initialize size to 0
	}

	/*
	 * returns the size of the Queue
	 * 
	 * */
	public int getSize() {
		return this.size;
	}

	/*
	 * Add elements to the queue
	 * */
	public void enqueue(int input) {
		Node node = new Node();			//cretae a new Node
		node.data = input;				//add data to the newly created node
		node.next = null;				//initially assign the pointer to null

		if (head == null && tail == null) {			//if head and tail are null list is empty therefore,
			head = node;							//assign the head pointer to the newly created node
			tail = node;							//assign the tail pointer to the newly created node
			size++;									//increment the size 
			return;									//return from the function 
		}
									//if queue already has some items therefore, 
		tail.next = node;			//store the address of the new node in tail.next(tail pointer or node tail is pointing to)
		tail = node;				//Point the tail node to the last node		
		size++;						//increment the size
	}

	
	/*
	 * remove elements from the queue 
	 * 
	 * */
	public int dequeue() {
		int result = 0;						
		try {
			result = head.data;					//store the data of the head pointer in result
		} catch (NullPointerException e) {		//if the list is empty catch the null reference
			System.out.println("no items to deque");		
			return 0;							//return with status code 0
		}
		if (head.next == null) {				//when we access the last element in the queue
			System.out.println("Last element in the queue");
		}
		head = head.next;						//point the head node to the next nod ein the queue
		size--;									//decrement the size
		return result;							//return the result
	}

	/*
	 * Prints all the nodes
	 * */
	public void getNodes() {
		if (head == null) {
			System.out.println("Empty queue!");
			return;
		}
		Node temp = head;
		System.out.println(temp.data);
		while (temp.next != null) {
			temp = temp.next;
			System.out.println(temp.data);
		}
	}
}
