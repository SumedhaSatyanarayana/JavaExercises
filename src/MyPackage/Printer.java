package MyPackage;

public class Printer {
	private int tonerLvl;
	private int pagesPrinted;
	private boolean duplexPrinter;

	public Printer(int tonerLvl, boolean duplexPrinter) {
		//super();
		if (tonerLvl>0 && tonerLvl<=100){
			this.tonerLvl = tonerLvl;
		}else{
			this.tonerLvl = -1;
		}

		this.duplexPrinter = duplexPrinter;
		this.pagesPrinted=0;
	}

	public int addToner(int tonerAmt){
		if (tonerAmt>0 && tonerAmt<=100){
			if (this.tonerLvl + tonerAmt >100){
				return -1;
			}
			this.tonerLvl += tonerAmt;
			System.out.println("Total level of the printer : "+this.tonerLvl);
			return this.tonerLvl;
			
		}else{
			return -1;
		}


	}
	public int printPages(int pages){
		int pagesToPrint = pages;
		if (this.duplexPrinter){
			pagesToPrint = (pagesToPrint/2)+(pagesToPrint%2);
			System.out.println("Printing in duplex mode");
			
		}
		this.pagesPrinted+=pagesToPrint;
		//System.out.println("No of pages printed : "+ this.pagesPrinted);
		return pagesToPrint;
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}


}
