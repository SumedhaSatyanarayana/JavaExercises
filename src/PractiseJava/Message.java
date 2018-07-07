package PractiseJava;

public class Message {   // declares a class
	 String name, email, phone;
	
	// create a constructor and initializes three string variables
	
	Message(String theName, String theEmail, String myPhone){
		name = theName;
		email = theEmail;
		phone = myPhone;
		
	}
	// create a method for each categories
	
	 void displayEmail(){
		System.out.println("Email : "+email);
	}
	 void displayPhone(){
			System.out.println("phone : "+phone);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object obj and automatically calls the constructor to initialize three string variables
		Message obj = new Message("Sumo","sumedhas1993@gmail.com","8762705557");
		System.out.println(obj.name);
		obj.displayEmail();
		obj.displayPhone();
		Message obj2 = new Message("Satyanarayana","smsbsnl@gmail.com","9483396392");
		System.out.println(obj2.name);
		obj2.displayEmail();
		obj2.displayPhone();
		
		
		
	}

}
