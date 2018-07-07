package LearnJava;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dateselection {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "J:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='HEAD']/div/div[2]/ul/li[2]/a")).click();
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='rt_1_airportTo']")));
		dropdown.selectByVisibleText("New Delhi, India - Indira Gandhi International Airport (DEL)");
		//driver.findElement(By.xpath(".//*[@value='New Delhi, India - Indira Gandhi International Airport (DEL)']")).sendKeys("New Delhi, India - Indira Gandhi International Airport (DEL)");
		driver.findElement(By.xpath(".//*[@id='date_picker_in_0']")).click();
		String date = "27-April 2017";
		String splitter[] = date.split("-");
		String cmonth_year = splitter[1];
		String cindate = splitter[0];
		System.out.println(cmonth_year);
		System.out.println(cindate);

		selectDate(cmonth_year, cindate);
	}

	private static void selectDate(String month_year, String indate) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = null;
		List<WebElement> elements = driver.findElements(By.xpath(".//div[@class='calendar']/div[@class='month']/table/thead/tr/th[@class='caption']"));
		for (int i=0; i<elements.size(); i++){
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText().equals(month_year)){
				//if equal then select the date
				List<WebElement> days = driver.findElements(By.xpath(".//div[@class='calendar']/div[@class='month']["+(i+1)+"]/table/tbody/tr/td/a"));
				for (WebElement d:days){
					System.out.println(d.getText());
					if (d.getText().equals(indate)){
						d.click();
						return;
					}
				}
			}
		}
		driver.findElement(By.xpath(".//*[@id='overlayInnerDiv']/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='overlayInnerDiv']/div/div[1]/span[2]")).click();
		Thread.sleep(2000);
		selectDate(month_year, indate);
		
	}
}

