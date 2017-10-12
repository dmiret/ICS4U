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
	public IntTreeNode findSmallest(IntTreeNode current) {
		
		if(current.getLeft()==null){
			evaluate(current);
			return current;
		}else {
			current.getLeft();
		}
		return current;
	}
	public IntTreeNode findLargest(IntTreeNode current) {
			if(current.getRight()==null) {
				evaluate(current);
				return current;
				
			}else {
				current.getRight();
			}
			return current;
	}
	public void searchBST(IntTreeNode root, int key) {
		if(root.getData()==key) {
			evaluate(root);
		}else if(key<root.getData()){
			searchBST(root.getLeft(),key);
		}else if(key>root.getData()) {
			searchBST(root.getRight(),key);
		}else {
			evaluate(root);
		}
		
	}
	public boolean delete(IntTreeNode root,IntTreeNode Parent, int Target) {
		boolean validResult = false;
		IntTreeNode DeleteNode = root;
		IntTreeNode parent= Parent;
		
		if(root==null) {
			validResult = false;
		}else if(Target<root.getData()) {
			
			delete(root.getLeft(),parent, Target);
			
		}else if(Target>root.getData()) {
			delete(root.getRight(),parent, Target);
			
		}else if(root.getLeft()==null) {
			DeleteNode=(root.getRight());
			delete(DeleteNode,parent,Target);
			validResult=true;
			
		}else if(root.getRight()==null) {
			DeleteNode=(root.getLeft());
			delete(DeleteNode,parent,Target);
			validResult=true;
		}else {
			DeleteNode=findLargest(root.getLeft());
			DeleteNode.setLeft(root.getLeft());
			DeleteNode.setRight(root.getRight());
			validResult = true;
		}
		
		
		return validResult;
	}
}
