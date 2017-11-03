package com.bayviewglen.queensChart;

import java.util.Stack;

public class Board {
	private int n; //size
	private Stack<nQueens> stack = new Stack<nQueens>();  //
	private int filled;
		
	public Board() {
		super();
		this.filled = 0;
		this.stack = null;
		this.n = 0;
	}
	
	public Board(int n) {
		super();
		this.n=n;
		this.filled = 0;
		this.stack = null;
	}
	
	public int getN () {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public void addFirstToStack (nQueens q) {
		stack.push(q);
		filled++;
	}
	
	public void addToStack (nQueens q) {
		if (stack == null) {
			addFirstToStack(q);
		}
	}
	
	public nQueens popFromStack () {
		filled--;
		return stack.pop();	
	}
	
}
