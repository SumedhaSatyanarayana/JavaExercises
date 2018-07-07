package Arrays;

import java.util.Scanner;

import LearnJava.GroceryList;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	static MobilePhone mp = new MobilePhone();
	public static void main(String[] args) {
		printInstructions(); 
		boolean quit = false;
		int choice =0;
		while(!quit){
			System.out.println("Enter your choice ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice){
			case 0 :
				System.out.println("Shutting down.....!!!");
				quit = true;
				break;
			case 1 :
				mp.printContacts();
				break;
			case 2 :
				addContact();
				break;
			case 3 :
				updateContact();
				break;
			case 4 :
				removeContact();
				break;
			case 5 :
				printInstructions(); 
				break;
			}
		}	
	}

	private static void printInstructions() {
		System.out.println("\nPress :");
		System.out.println("\t 0 - To shut down.");
		System.out.println("\t 1 - To print contacts.");
		System.out.println("\t 2 - To add a new contact.");
		System.out.println("\t 3 - To update an existing contact.");
		System.out.println("\t 4 - To remove an existing contact.");
		System.out.println("\t 5 - To print a list of available options.");
	}

	private static void addContact() {
		System.out.println("Enter new contact name");
		String name =  scanner.nextLine();
		System.out.println("Enter new contact phone number");
		String ph = scanner.nextLine();
		Contact newContact = Contact.createContact(name, ph);
		boolean flag = mp.addNewContact(newContact);
		if (flag){
			System.out.println("New contact added : name = " + name + " phone number = " + ph);
		}else{
			;
		}	
	}
	private static void updateContact() {
		System.out.println("Enter existing contact name to be updated");
		String old = scanner.nextLine();
		Contact existingContactRecord = mp.queryContact(old);
		if (existingContactRecord == null){
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name ");
		String newname = scanner.nextLine();
		System.out.println("Enter new contact phone number");
		String newPhNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newname, newPhNumber);
		if (mp.updateContact(existingContactRecord, newContact)){
			System.out.println("Update successful");
		}
	}
	private static void removeContact() {
		System.out.println("Enter existing contact name to be removed");
		String rem = scanner.nextLine();

		Contact existingContactRecord = mp.queryContact(rem); 
		if (existingContactRecord == null){
			System.out.println("Contact not found");
			return;
		}
		if(mp.removeContact(existingContactRecord)){
			System.out.println("Successfully deleated");
		}else{
			System.out.println("Error occured");
		}
	}
}
