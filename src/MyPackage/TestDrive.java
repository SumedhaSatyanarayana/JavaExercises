package MyPackage;
import MyPackage.Drive;


class our{
	protected int a =100;
	private int b =200;
	
	public void accessVariable(){
		System.out.println("a "+ a);
	}
}


public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive DriveObj = new Drive();
		DriveObj.getDisance(308, 113);
		
		our  o = new our();
		o.accessVariable();
	}
}
