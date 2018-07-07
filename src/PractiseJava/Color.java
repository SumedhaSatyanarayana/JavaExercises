package PractiseJava;

import LearnJava.config;

public class Color {  // declares a class color
	//  Creating a CONSTRUCTOR
	// Constructor is used to initialize a variable
	Color(){     // when an object is created this constructor will be called automatically 
		color1= "green";
		color2="grey";
		color3 = "pink";
	}
	String color1;  // declares a variable
	String color2;
	String color3;
	public void brightness(){  // declares a method
		System.out.println("google has "+ color1 +" "+ color2 +" & not "+color3);
	}		       
	public static void main (String[] args){
		Color obj = new Color(); // create an object named obj, call constructor automatically
		//obj.color1 = "yellow";  // initializing without using constructor
		//obj.color2 = "red";		// obj referencing a variable
		//obj.color3 = "orange";
		// YOU DONT HAVE TO WRITE ABOVE 3 LINES OF CODE IF VARIABLE VALUES REMAINS THE SAME
		// IF WRITTEN IT OVERRIDES VARIABLES VALES WRITTEN IN CONSTRUCTOR
		
		obj.brightness();      // obj references a method
		Color obj1 = new Color();
		obj1.color1 = "blue";
		obj1.color2 = "green";
		obj1.color3 = "violet";
		obj1.brightness();
		
		// BUFFER STRING
		StringBuffer stri = new StringBuffer("wolf and dragon");
		System.out.println(stri.substring(1, 10 ));	
	}

	//  Object is an instance of class
	// constructor is used to initialize variable. Constructor name is same as class name 
	// when an object is created the constructor is called automatically

}


