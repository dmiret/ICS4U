package com.bayviewglen.dayone;

import java.util.Comparator;

public class Contact implements Comparator<Contact>{

	private String Lname;
	private String Fname;
	private String Phone;
	
	public Contact() {
		
	}
	
	public Contact(String Fname,String Lname, String Phone) {
		super();
		this.Lname=Lname;
		this.Fname=Fname;
		this.Phone=Phone;
	}

	
	public String getLname() {
		return Lname;
	}
	public String SetLname(String NewLname) {
		Lname=NewLname;
		return Lname;	
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public int compare(Contact a, Contact b) {
		String c = this.Lname+this.Fname;
		String d = b.Lname+b.Fname;
		return c.compareTo(d);
	}
}
