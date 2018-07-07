package LearnJava;

public class LearnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a[] = new int [10];
			a[10] = 45;
			System.out.println(a[10]);
		}catch (ArrayIndexOutOfBoundsException s){
			System.out.println(s);
		}finally {
			
			System.out.println("end");
		}
	}
}
