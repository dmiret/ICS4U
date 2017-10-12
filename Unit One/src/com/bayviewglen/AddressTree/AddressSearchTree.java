package com.bayviewglen.AddressTree;

import com.bayviewglen.dayone.Contact;

public class AddressSearchTree {

		AddressTreeNode root;
		
		public AddressSearchTree() {
			super();
			this.root=null;
		}

		public AddressSearchTree(AddressTreeNode root) {
			super();
			this.root = root;
		}

		public AddressTreeNode getRoot() {
			return root;
		}

		public void setRoot(AddressTreeNode root) {
			this.root = root;
		}
		
		public void inorderTraversal(AddressTreeNode current) {
			if(current.getLeft()!=null)
				inorderTraversal(current.getLeft());
			
			evaluate(current);
			
			if(current.getRight()!=null)
				inorderTraversal(current.getRight());
		}
		public void preorderTraversal(AddressTreeNode current) {
			evaluate(current);
			
			if(current.getLeft()!=null)
				inorderTraversal(current.getLeft());
			
			if(current.getRight()!=null)
				inorderTraversal(current.getRight());
		}
		public void postorderTraversal(AddressTreeNode current) {
			if(current.getLeft()!=null)
				inorderTraversal(current.getLeft());
			
			if(current.getRight()!=null)
				inorderTraversal(current.getRight());
			
			evaluate(current);
		}

		private void evaluate(AddressTreeNode current) {
			System.out.println(current.getData());
		}
		
		public void add(AddressTreeNode current,Contact x) {
			AddressTreeNode newContact = new AddressTreeNode(x);
		//TODO	
			if(root==null) {
				root= newContact;
			}else if(x.compare(newContact.getData(),current.getData())<=-1){
				add(current.getLeft(),x);
				
			}else if(x.compare(newContact.getData(),current.getData())>=1) {
				add(current.getRight(),x);
			}
			
		}
		public void add(Contact x) {
			if(root==null) {
				AddressTreeNode temp=new AddressTreeNode(x);
				root=temp;
			}else {
			add(root,x);
			}
		}
		public AddressTreeNode findSmallest(AddressTreeNode current) {
			
			if(current.getLeft()==null){
				evaluate(current);
				return current;
			}else {
				current.getLeft();
			}
			return current;
		}
		public AddressTreeNode findLargest(AddressTreeNode current) {
				if(current.getRight()==null) {
					evaluate(current);
					return current;
					
				}else {
					current.getRight();
				}
				return current;
		}
		//TODO Everything bellow
		public void searchBST(AddressTreeNode root, Contact Name) {
			if(root.getData().equals(Name)) {
				evaluate(root);
			}else if(Name.compare(root.getData(),Name)<=-1){
				searchBST(root.getLeft(),Name);
			}else if(Name.compare(root.getData(),Name)>=1) {
				searchBST(root.getRight(),Name);
			}else {
				evaluate(root);
			}
			
		}
		public boolean delete(AddressTreeNode root,AddressTreeNode Parent, Contact Name) {
			boolean validResult = false;
			AddressTreeNode DeleteNode = root;
			AddressTreeNode parent= Parent;
			
			if(root==null) {
				validResult = false;
			}else if(Name.compare(root.getData(),DeleteNode.getData())<=-1) {
				parent = root;
				delete(root.getLeft(),parent, Name);
				
			}else if(Name.compare(Parent.getData(),DeleteNode.getData())>=1) {
				parent = root;
				delete(root.getRight(),parent, Name);
				
			}else if(root.getLeft()==null) {
				parent=root;
				DeleteNode=(root.getRight());
				delete(DeleteNode,parent,Name);
				validResult=true;
				
			}else if(root.getRight()==null) {
				parent=root;
				DeleteNode=(root.getLeft());
				delete(DeleteNode,parent,Name);
				validResult=true;
			}else {
				parent=root;
				DeleteNode=findLargest(parent.getLeft());
				DeleteNode.setLeft(parent.getLeft());
				DeleteNode.setRight(parent.getRight());
				validResult = true;
			}
			
			
			return validResult;
		}
	}

