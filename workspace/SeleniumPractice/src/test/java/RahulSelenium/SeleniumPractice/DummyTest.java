package RahulSelenium.SeleniumPractice;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.Base;

public class DummyTest extends Base {
	@Test
	public void basePageNavigation() 
	{
		driver = initializeDriver();
		driver.get("http://www.facebook.com");
		
		FacebookHomePage fhp = new FacebookHomePage(driver);
		fhp.email.sendKeys("nycLarissa");
	}

}
