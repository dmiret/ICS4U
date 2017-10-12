package com.bayviewglen.AddressTree;

import com.bayviewglen.dayone.Contact;

public class AddressTreeNode {
	private Contact Data;
	private AddressTreeNode left;
	private AddressTreeNode right;
	
	public AddressTreeNode() {
		Data = null;
		right = null;
		left = null;
	}
	
	public AddressTreeNode(Contact data) {
	super();
	this.Data = data;
	this.left = left;
	this.right = right;
		
	}
	public AddressTreeNode(Contact data, AddressTreeNode left, AddressTreeNode right) {
		super();
		this.Data = data;
		this.left = left;
		this.right = right;
	}

	public Contact getData() {
		return Data;
	}
	
	public void setData(Contact data) {
		Data = data;
	}
	public AddressTreeNode getLeft() {
		return left;
	}
	public void setLeft(AddressTreeNode left) {
		this.left = left;
	}
	public AddressTreeNode getRight() {
		return right;
	}
	public void setRight(AddressTreeNode right) {
		this.right = right;
	}
	
	
}
