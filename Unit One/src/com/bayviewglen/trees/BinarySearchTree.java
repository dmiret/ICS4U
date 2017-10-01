package com.bayviewglen.trees;

public class BinarySearchTree {
	IntTreeNode root;

	//insert in a certain way
	//if smaller than parent go to left, if bigger than parent go to right
	
	public BinarySearchTree() {
		super();
		this.root=null;
	}

	public BinarySearchTree(IntTreeNode root) {
		super();
		this.root = root;
	}

	public IntTreeNode getRoot() {
		return root;
	}

	public void setRoot(IntTreeNode root) {
		this.root = root;
	}
	
	public void inorderTraversal(IntTreeNode current) {
		if(current.getLeft()!=null)
			inorderTraversal(current.getLeft());
		
		evaluate(current);
		
		if(current.getRight()!=null)
			inorderTraversal(current.getRight());
	}
	public void preorderTraversal(IntTreeNode current) {
		evaluate(current);
		
		if(current.getLeft()!=null)
			inorderTraversal(current.getLeft());
		
		if(current.getRight()!=null)
			inorderTraversal(current.getRight());
	}
	public void postorderTraversal(IntTreeNode current) {
		if(current.getLeft()!=null)
			inorderTraversal(current.getLeft());
		
		if(current.getRight()!=null)
			inorderTraversal(current.getRight());
		
		evaluate(current);
	}
	private void evaluate(IntTreeNode current) {
		System.out.println(current.getData());
	}
	
	public void add(IntTreeNode current,int x) {
		IntTreeNode newint = new IntTreeNode(x);
		
		if(root==null) {
			root= newint;
		}else if(current.getData()>x){
			add(current.getLeft(),x);
			
		}else if(current.getData()<=x) {
			add(current.getRight(),x);
		}
		
	}
	public void add(int x) {
		if(root==null) {
			IntTreeNode temp=new IntTreeNode(x);
			root=temp;
		}else {
		add(root,x);
		}
	}
}
