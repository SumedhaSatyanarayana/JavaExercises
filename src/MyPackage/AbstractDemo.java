package MyPackage;


abstract class A    // abstract class
{
	abstract int max (int x, int y); // abstract method
	int min(int x, int y)	
	{
		return x<y?x:y;
	}
}

class B extends A // extend the parent class
{
	int max(int x, int y) // override the abstract method
	{
		return x>y?x:y;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		B b = new B();
		int max = b.max(200, 500);
		int min = b.min(450, 451);
		System.out.println("Max="+max);
		System.out.println("Min=" +min);

	}

}
