package LearnJava;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {
	//static File source = new File("J:\\EXCELDATA\\TestData.xlsx");

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//FileInputStream fis=new FileInputStream(source);
		//File source = new File("J:\\EXCELDATA\\Hmmmmm1.xls");
		//Workbook wb1 = Workbook.getWorkbook(source);
		//Sheet sh = wb1.getSheet(0);
		//Cell c = sh.getCell(0, 0);
		
		//XSSFWorkbook wb = new XSSFWorkbook(fis);
		//XSSFSheet sheet = wb.getSheetAt(0);
		/*String a = sheet.getRow(0).getCell(0).getStringCellValue();
		String a1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(" "+ a + a1);*/
		/*ReadExcel c1 = new ReadExcel();
		c1.something();
		sh = wb1.getSheet(1);
		c = sh.getCell(0, 0);
		c1.other();
		sh = wb1.getSheet(2);
		c = sh.getCell(0, 0);
		c1.others();*/
		/*int b = sheet.getLastRowNum();
		for (int i=0; i<=b; i++){
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		sheet.getRow(0).createCell(2).setCellValue("set");
		FileOutputStream fos = new FileOutputStream(source);
		wb.write(fos);
		wb.close();*/
	}
	/*private void something() throws Exception{
		//FileInputStream fis=new FileInputStream(source);
		//XSSFWorkbook wb = new XSSFWorkbook(fis);
		//XSSFSheet sheet = wb.getSheetAt(0);
		//Row r = sheet.getRow(0);
		File source = new File("J:\\EXCELDATA\\Hmmmmm.xlsx");
		Workbook wb1 = Workbook.getWorkbook(source);
		Sheet sh = wb1.getSheet(0);
		Cell c = sh.getCell(0, 0);
		System.out.println(c.getContents());
	}
	private void other() throws Exception{
		File source = new File("J:\\EXCELDATA\\Hmmmmm.xlsx");
		Workbook wb1 = Workbook.getWorkbook(source);
		Sheet sh = wb1.getSheet(1);
		Cell c = sh.getCell(0, 0);
		System.out.println(c.getContents());
	}
	private void others() throws Exception{
		File source = new File("J:\\EXCELDATA\\Hmmmmm.xlsx");
		Workbook wb1 = Workbook.getWorkbook(source);
		Sheet sh = wb1.getSheet(2);
		Cell c = sh.getCell(0, 0);
		System.out.println(c.getContents());
	}

}*/
}

