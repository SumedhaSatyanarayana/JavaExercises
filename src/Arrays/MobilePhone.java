package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	// optional
	//private String myNumber;
	public  ArrayList<Contact> myContacts = new ArrayList<Contact>();
	// constructor 
	public MobilePhone() {
		//super();
		//this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>() ;
	}	

	public boolean addNewContact(Contact contact){
		if (findContact(contact.getName())>=0){
			System.out.println("Contact already present on file");
			return false;
		}
		myContacts.add(contact);
		return true;
	}



	private int findContact(String name) {
		for (int i=0; i<this.myContacts.size(); i++){
			Contact contact = this.myContacts.get(i);
			if (contact.getName().equals(name)){
				return i;
			}
		}
		return -1;
	}

	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}


	public boolean updateContact(Contact oldContact, Contact newContact){
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0){
			System.out.println(oldContact.getName() + " was not found");
			return false;
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+ " was replaced with "+ newContact.getName());
		return true;
	}
	public Contact queryContact(String name){
		int position = findContact(name);
		if (position >= 0){
			return this.myContacts.get(position);
		}
		return null;
	}
	public boolean removeContact(Contact contact){
		if (findContact(contact) < 0){
			System.out.println(contact.getName() + " was not found");
			return false;
		}
		this.myContacts.remove(contact);
		System.out.println(contact.getName() + "was deleted successfully");
		return true;
	}

	public String queryContact(Contact contact) {
		if (findContact(contact) >= 0){
			return contact.getName();
		}
		return null;
	}

	public void printContacts() {
		// TODO Auto-generated method stub
		System.out.println("Contact List");
		for (int i = 0; i<this.myContacts.size(); i++){
			System.out.println(i+1 +") "+ this.myContacts.get(i).getName() +" --> "+ this.myContacts.get(i).getPhoneNumber());
		}
	
		
	}

}
