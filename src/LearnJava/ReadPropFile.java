package LearnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		//create the object of properties class
		Properties prop = new Properties();
		String path = ("J:\\workspace\\Exercise\\src\\Sample1\\config.properties");
		//Create the object of FileInputStream class - which file u want to read - path of the file
		FileInputStream ip = new FileInputStream(path);//inside the FIS u need to tell where exactly the file is available
		//load the file
		prop.load(ip);
		//read
		//System.out.println(prop.getProperty("name"));
		String brow = prop.getProperty("browser");
		//System.out.println(prop.getProperty("url"));

		if (brow.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if (brow.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "J:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else{
			System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		String link = prop.getProperty("url");
		driver.get(link);
		driver.manage().window().fullscreen();
		
		
	}

}
