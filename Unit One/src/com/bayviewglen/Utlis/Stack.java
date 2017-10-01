package com.bayviewglen.Utlis;

import java.util.Arrays;

public class Stack {
	Object[] stack;
	int howMany=0;
	boolean isTrue=true;
	
	
	public Stack() {
		stack = new Object[10];
	}
	
	public void push(Object el) {
		if(howMany<stack.length) {
			stack[howMany++]=el;
		}else {
			stack=Arrays.copyOf(stack,stack.length*2);		
			stack[howMany++]=el;
		}		
	}
	public Object peek() {
		return stack[howMany-1];
		
	}
	public Object pop() {
		return stack[--howMany];
	}
	public boolean empty() {
		if(howMany!=0) {
			isTrue=false;
		}
		return isTrue;

		
	}
	
}
