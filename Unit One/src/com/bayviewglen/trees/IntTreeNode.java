package com.bayviewglen.trees;
//Binary tree (two nodes)
public class IntTreeNode {

	private int Data;
	private IntTreeNode left;
	private IntTreeNode right;
	
	public IntTreeNode() {
		Data = 0;
		right = null;
		left = null;
	}
	
	public IntTreeNode(int data) {
	super();
	this.Data = data;
	this.left = left;
	this.right = right;
		
	}
	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		super();
		this.Data = data;
		this.left = left;
		this.right = right;
	}

	public int getData() {
		return Data;
	}
	
	public void setData(int data) {
		Data = data;
	}
	public IntTreeNode getLeft() {
		return left;
	}
	public void setLeft(IntTreeNode left) {
		this.left = left;
	}
	public IntTreeNode getRight() {
		return right;
	}
	public void setRight(IntTreeNode right) {
		this.right = right;
	}
	
	
	
}
