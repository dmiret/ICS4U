package com.bayviewglen.Utlis;

import java.util.Arrays;

public class Queue {
	Object[] Queue;
	int howMany = 0;
	boolean isTrue = true;

	public Queue() {
		Queue = new Object[10];
	}
	public void enqueue(Object el) {
		if(howMany<Queue.length) {
			Queue[howMany++]=el;
		}else {
			Queue=Arrays.copyOf(Queue,Queue.length*2);		
			Queue[howMany++]=el;
		}		
	}
	public Object dequeue() {
		howMany--;
		return Queue[0];
		
		
	}
	public Object peek() {
		return Queue[0];
		
	}
	public Object clear() {
		for(int i=0;i<howMany;i++) {
			Queue=null;
			}
		return Queue;
	}
	public boolean empty() {
		if(howMany!=0) {
			isTrue= false;
		}
		return isTrue;
		
	}
}
