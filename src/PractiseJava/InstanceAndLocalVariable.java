package PractiseJava;


// Instance variable is defined in a class. It works in the current class.
// Local variable is defined in a method. It works in the current method.

public class InstanceAndLocalVariable {

	int x = 100;  // instance variable inside a class
	int y = 154;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		
	}
	public static void method(){
		int a = 245;   // defines a local variable inside a method
		int h = 564;
		System.out.println(a + h);
		
	}

}
