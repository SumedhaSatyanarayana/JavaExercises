package LearnJava;

import java.util.Arrays;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

/*public class config{
	public static void main(String args[ ]){
		myMethod("42421"); } // call “myMethod”
	static void myMethod (String a ) { // declare a method
		System.out.println( "This is a method" );
		System.out.println(a);
	}
}*/
public class config{       // declares a class config
	//      Creating a CONSTRUCTOR
	config(){
		color1= "green";color2="grey";
	}
	String color1;  // declares a variable
	String color2;
	void brightness(){  // declares a method
		System.out.println("google has "+ color1 +" "+ color2);
	}
	public static void main (String[] args){
		config obj = new config(); // create an object , call constructor automatically
		obj.color1 = "yellow";  // initializing without using constructor
		obj.color2 = "red";
		obj.brightness();
		config obj1 = new config();
		obj1.color1 = "blue";
		obj1.color2 = "green";
		obj1.brightness();
		//System.out.println("24 : "+a.split(a,1));
		StringBuffer stri = new StringBuffer("wolf and dragon");
		System.out.println(stri.substring(1, 10 ));	
	}
}
//  Object is an instance of class
// constructor is used to initialize variable. Constructor name is same as class name 
// when an object is created the constructor is called automatically





