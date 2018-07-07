package OOPS;

public class Bed {
	private String style;
	private int noOfPillows;
	private int height;
	private int sheets;
	private int quilt;
	
	public Bed(String style, int noOfPillows, int height, int sheets, int quilt) {
		super();
		this.style = style;
		this.noOfPillows = noOfPillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}

	public String getStyle() {
		return style;
	}

	public int getNoOfPillows() {
		return noOfPillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuilt() {
		return quilt;
	}
	public void make(){
		System.out.println("Bed making");
	}

}
