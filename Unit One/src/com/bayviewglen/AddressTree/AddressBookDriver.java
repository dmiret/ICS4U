package com.bayviewglen.AddressTree;

import com.bayviewglen.dayone.Contact;

public class AddressBookDriver {

	public static void main(String[] args) {
		AddressTreeNode root = null;
		Contact test1 = new Contact("test","name","1");
		Contact test2 = new Contact("TEST","NAME","2");
		
		AddressSearchTree test = new AddressSearchTree(root);
		
		test.add(test1);
		test.add(test2);
		
		test.delete(root, root, test1);
		}

}
