package RahulSelenium.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookHomePage 
{
   WebDriver driver;
   
   public FacebookHomePage (WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy (xpath ="//input[@id='email']")
	WebElement email;
   
   
   
   public WebElement emailId() {
	   return email;
   }
}
