package MyPackage;

abstract class books{
	abstract void read();		
}
class ebooks extends books{
	void read(){
		System.out.println("Overrides the abstract method");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ebooks book = new ebooks();
		book.read();
	}
}
// Abstract class works as a parent class, which will be extended by its sub class.
// The method of sub class will override the abstract method of abstract class.
