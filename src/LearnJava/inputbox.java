package LearnJava;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class inputbox {

	public static void main(String[] args) {
		System.out.println("My Method");
		//return "n1";
		String myarr[]={ "dog", "a", "hu", "t" };
		int a = myarr.length;
		System.out.println(a);
		myarr.clone();
		Arrays.sort(myarr);
		for (int i = 0; i<=3; i++) { 
			//System.out.println(myarr[i]);
		}
		String st = "May the force be with you";
		StringBuffer str = new StringBuffer("Bazinga deva");
		//str.insert(7, "dsa");
		str.reverse();
		System.out.println(str);
		String t = st.substring(1, 12);
		System.out.println(t);
		String i = st.trim();
		System.out.println("trim"+i);
		String u =  st.replace(" ", " % GOD % ");
		System.out.println(u);
		System.out.println(st.charAt(0)	);
		System.out.println(st.indexOf("t"));
	}
}


/*	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("user");
		String pw = JOptionPane.showInputDialog("password");
		if (name.equals("sumedha")){
			JOptionPane.showMessageDialog(null, "k");
			if (pw.equals("sume")){
				JOptionPane.showMessageDialog(null, "ok");
			}else 	JOptionPane.showMessageDialog(null, "failed"); 
		}else 	JOptionPane.showMessageDialog(null, "failed");
		System.out.println(name);
		System.out.println(pw);
	}*/

