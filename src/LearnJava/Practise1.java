package LearnJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class Practise1 {

	public static void main(String[] args) {
		String date = "27 February 2017";
		String splitter[] = date.split(" "); // splitting the array
		int len = splitter.length;           // getting the length of array
		System.out.println("length of array - splitter : "+len);
		String Value;
	/*	String dateAfterSplit = splitter[0];  // index of array starts from 0
		String Month = splitter[1];
		String Year = splitter[2];
		System.out.println("Date is : "+ date);
		System.out.println("Date After Split 0 : "+dateAfterSplit);
		System.out.println("Month 1 : "+Month);
		System.out.println("Year 2 : " + Year);*/
		for (int i=0; i<=len-1; i++ ){
			Value =splitter[i];
			System.out.println(" "+Value.toUpperCase());
		}
		int k = date.length();
		System.out.println("length of date : "+k);
		System.out.println("SUB :"+date.substring(11, k)); // substring(int beginindex, int endindex-1);
		String date1 = "27February2017";
		String a=date1.replace("2017", "2018");
		System.out.println("dina "+a);
		String Month = splitter[2];
		int num = Integer.parseInt(Month);  // string to integer conversion
		System.out.println("num in int : "+num);
		
		
		
		
		
		/*System.setProperty("webdriver.gecko.driver", "J:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	      driver.get("http://www.ksrtc.in/oprs-web/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys("Gokarna");
	      driver.findElement(By.id("toPlaceName")).sendKeys("Bangalore");
	      driver.findElement(By.id("txtJourneyDate")).click();
	      driver.findElement(By.xpath(".//*[@id='txtJourneyDate']")).click();
	      driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[1]/a")).click();*/
	}
}
