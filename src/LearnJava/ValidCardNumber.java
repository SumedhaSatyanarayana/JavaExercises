package LearnJava;

import java.math.BigInteger;
import java.util.Scanner;

public class ValidCardNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String abc = sc.next();
		//BigInteger card = new BigInteger("4143660558086386");
		String card = "4143660558086386";
		System.out.println("The no entered is "+card);
		StringBuffer h = new StringBuffer(card);
		h.reverse();
		System.out.println(h);
		int result = Integer.parseInt(h.substring(1,2));
		System.out.println(result * 2);
		System.out.println(h);
		int result1 = Integer.parseInt(h.substring(3,4));
		System.out.println(result1 * 2);
		int result2 = Integer.parseInt(h.substring(5,6));
		System.out.println(result2 * 2);
		int result3 = Integer.parseInt(h.substring(7,8));
		System.out.println(result3 * 2);
		int result4 = Integer.parseInt(h.substring(9,10));
		System.out.println(result4 * 2);
		int result5 = Integer.parseInt(h.substring(11,12));
		System.out.println(result5 * 2);
		int result6 = Integer.parseInt(h.substring(13,14));
		System.out.println(result6 * 2);
		int result7 = Integer.parseInt(h.substring(15,16));
		System.out.println(result7 * 2);

	}

}
