package Arrays;

public class Contact {
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
	//	super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	// create a contact record
	// calling the constructor to create a new contact record
	public static Contact createContact(String name, String ph){
		return new Contact(name,ph);
	}
	

}
