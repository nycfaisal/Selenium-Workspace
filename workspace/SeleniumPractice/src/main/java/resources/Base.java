package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public Properties prop;
	public WebDriver driver;
	
	String browserName;
	public void globalVariable() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/faisalmohammad/Documents/workspace/SeleniumPractice/src/main/java/resources/data.properties");
		
		prop.load(fis);
		browserName = prop.getProperty("browserName");
	}
		public WebDriver initializeDriver(){	
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
			driver = new FirefoxDriver();
		}	
		
		//implictly wait timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//return driver
		return driver;
	}
	
	
}
