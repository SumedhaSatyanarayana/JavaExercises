package PractiseJava;

public class LearnJava {   // a class is a template for object and creates an object

	public static void main(String[] args) {
		//myName();   // call a method
		myMethod("b", 563); // call a method by passing parameters
		System.out.println("The number is : "+myName());  // myName is caller
	}
	public static int myName(){    // declare a method
		System.out.println("Sumedha");
		int a =2564;
		return a;  // send back the value to caller
		
		// public - can be accessed by any class
		// static - means a class method
		// void - return type
	}
	
	public static void myMethod(String t, int y){
		System.out.println(t);
		System.out.println(y);
	}
	
	

}


