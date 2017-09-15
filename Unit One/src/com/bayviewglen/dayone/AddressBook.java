package com.bayviewglen.dayone;

public class AddressBook {
	private Contact[] contacts;
	private int numContacts;
	public AddressBook() {
		contacts = new Contact[1000];
		numContacts = 0;
	}
	public void AddContact(String Fname, String Lname, String Phone) {
		contacts[numContacts++] = new Contact();
	}
	public void RemoveContact(String LnameToRemove) {
		
	}
	public void SearchContact(String SearchedLname) {
		
	}
	public void ShowAllContacts() {
		if(numContacts==0) {
			System.out.println("........");
			System.out.println("Congrats, you have no friends.....");
			System.out.println("Try adding some...");
			System.out.println("");
		}else{
			for(int x=0; x<numContacts;x++) {
		
			System.out.println(contacts[x]);
			}
		}
	}
	public void IntroMessage() {
		System.out.println("Welcome to the online repository of your contacts");
		System.out.println("Please Choose what you would like to do.");
		System.out.println("1. Add Contact");
		System.out.println("2. Show All Contacts");
		System.out.println("3. Search A Specific Contact");
		System.out.println("4. Delete Contact");
		System.out.println("5. Exit");
		
	}
	void incorrectAnswer() {
		System.out.println("That is not a valid answer");
		System.out.println("Try Again...");
		
	}
	
	
}
