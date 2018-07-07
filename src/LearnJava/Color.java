package LearnJava;


// Overloading means that there are two or more same-name methods in a class, and their arguments are different.

public class Color {
	String x;
	String y;
	private int num;
	Color(String a, String b){   // overloading
		x=a;
		y=b;
	}
	Color(){      // overloading
		x="yellow";
		y="green";		
	}
	
	public void test (int num){
		this.num = num;    // this represents the object obj3
		// this KEYWORD is used to represent a current object
		System.out.println(num);
	}

	public static void main(String[] args) {
		Color obj = new Color("grey","blue");
		Color obj1 = new Color();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		Color obj3 = new Color();
		obj3.test(145);

	}

}
