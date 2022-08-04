package com.bridgelabz.addressbook;

import java.util.Scanner;

/**
 *Program to Read or Write the Address Book with Persons Contact into a File using File IO
 * 
 * @author Shivaji Ghasti
 *
 */
public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("-----------------Welcome to address book  Program --------------------");
		System.out.println();

		// Calling directoryMenu method to perform user choice of operation
		AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
		addressBookDirectory.directoryMenu();
	}
}


