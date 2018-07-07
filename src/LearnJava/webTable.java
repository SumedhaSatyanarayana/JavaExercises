package LearnJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable {

	public static void main(String[] args) throws Exception {
		File source = new File("J:\\EXCELDATA\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.setProperty("webdriver.gecko.driver", "J:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Flag_Day_(Australia)");
		Thread.sleep(1000);
		String txt = driver.findElement(By.xpath("//*[@id='mw-content-text']/table")).getText();
		System.out.println(txt);
		sheet.getRow(0).createCell(3).setCellValue(txt);
		FileOutputStream fos = new FileOutputStream(source);
		wb.write(fos);
		wb.close();
	}

}
