package com.bayviewglen.dayone;

import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args) {
		AddressBook contacts = new AddressBook();
		Scanner keyboard = new Scanner(System.in);
		boolean isDone = false;
		
		while(!isDone){		
		contacts.IntroMessage();
		
		String Choice = keyboard.nextLine();
			{if(Choice.length()>1){
			contacts.incorrectAnswer();
			
		}else if(Choice.equals("1")) {
			System.out.println("Please write the first name");
			String Fname=keyboard.nextLine();
			System.out.println("Please write the last name");
			String Lname=keyboard.nextLine();
			System.out.println("Please write the phone number");
			String Phone=keyboard.nextLine();
			contacts.AddContact(Fname, Lname, Phone);
		}else if(Choice.equals("2")) {
			System.out.println("Here is the list of all your contacts:");
			contacts.ShowAllContacts();
		
		}else if(Choice.equals("3")) {
			System.out.println("Please write the last name of the person you are looking for.");
			String SearchedName = keyboard.nextLine();
			contacts.SearchContact(SearchedName);
			
		}else if(Choice.equals("4")) {
			System.out.println("Please write the last name of the person you wish to remove from your contact list.");
			String RemoveName = keyboard.nextLine();
			contacts.RemoveContact(RemoveName);
			
		}else if(Choice.equals("5")) {	
			System.out.println("Closing and Saving");
			isDone=true;
			
		}else {
			contacts.incorrectAnswer();
				}
			}
		}
	}
}


	
