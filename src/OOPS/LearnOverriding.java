package OOPS;

class Overriding {
	int test(int num){   // method test
		return num;
	}
}

class Over extends Overriding {
	int test(int num){
		return num+100;
	}
}
public class LearnOverriding{
	public static void main(String[]args){
		Overriding obj = new Overriding();
		Over obj1 = new Over();
		System.out.println(obj.test(420));
		System.out.println(obj1.test(420));
	}
}
