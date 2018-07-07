package OOPS;

class Inheritance{
	public  String name;
	public  int age;

	Inheritance(int Vayassu, String Hesaru){
		this.name  = Hesaru;
		this.age = Vayassu;

	}
	void display(){
		System.out.println("Parent : "+ name );
		System.out.println("Parent : "+ age );
	}
	public static void main(String[]args){
		sub_class obj2 = new sub_class();
		obj2.display();
		Inheritance obj = new Inheritance(24, "Sumedha");
		obj.display();
	}
}
class sub_class extends Inheritance {
	sub_class(){    // constructor
		super(45,"santro");   // call the constructor in parent class
		
	}
/*//	public static void main(String[]args){
//		sub_class obj2 = new sub_class();
//		obj2.display();
//		Inheritance obj = new Inheritance(24, "Sumedha");
//		obj.display();
//	}
*/}
