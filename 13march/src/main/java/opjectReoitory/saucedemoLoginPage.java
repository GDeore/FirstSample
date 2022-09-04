package opjectReoitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saucedemoLoginPage {
	
	WebDriver driver;
	public saucedemoLoginPage(WebDriver driver)     //constructor
	{
		this.driver=driver;
	}
		By userName = By.xpath("//*[@id='user-name']");
	
		By password = By.xpath("//*[@id='password']");
		By Login= By.xpath("//*[@id='login-button']");
		
		
	
	
		//   for 1st
	public WebElement userName()
	{
		return driver.findElement(userName);		
	}
	
	public WebElement password()
	{
		return driver.findElement(password);	
	}
	
	public WebElement Login()
	{
		return driver.findElement(Login);
	}
	
}	
		
	
	

