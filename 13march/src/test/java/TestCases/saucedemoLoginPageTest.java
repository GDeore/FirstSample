package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import opjectReoitory.saucedemoLoginPage;

public class saucedemoLoginPageTest {
	
	void openWeb (WebDriver driver)
	{
	String url="https://www.saucedemo.com/";
	driver.navigate().to(url);
	driver.manage().window().maximize();
	
	}
	
	void testCaseOne(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	//test case one
		WebElementObj.userName().sendKeys("standard_user");
		Thread.sleep(1000);
		WebElementObj.password().sendKeys("secret_sauce");	
		Thread.sleep(3000);
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);	
	}
	
	void testCaseTwo(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	//test case two
		WebElementObj.userName().sendKeys("ZukegaNhiSala");
		WebElementObj.password().sendKeys("Srivalli");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	void testCaseThree(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	//test case Three
		WebElementObj.userName().sendKeys("locked_out_user");
		WebElementObj.password().sendKeys("secret_sauce");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//WebElementObj.userName().clear();
		//WebElementObj.password().clear();
	}
	
	void testCaseFour(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	// test case four
		WebElementObj.userName().sendKeys("problem_user");
		WebElementObj.password().sendKeys("secret_sauce");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().back();
		//WebElementObj.userName().clear();
		//WebElementObj.password().clear();
	
	}
	
	void testCaseFive(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	// test case five
		WebElementObj.userName().sendKeys("performance_glitch_user");
		WebElementObj.password().sendKeys("secret_sauce");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	void testCaseSix(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	// test case Six
		WebElementObj.userName().sendKeys("");
		WebElementObj.password().sendKeys("");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	void testCaseSeven(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	// test case seven
		WebElementObj.userName().sendKeys("standard_user");
		WebElementObj.password().sendKeys("");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	void testCaseEight(saucedemoLoginPage WebElementObj, WebDriver driver) throws Exception
	{	// test case eight
		WebElementObj.userName().sendKeys("");
		WebElementObj.password().sendKeys("secret_sauce");
		WebElementObj.Login().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}
	
	
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:/Updated chrome/chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		saucedemoLoginPageTest testCaseObj= new saucedemoLoginPageTest();
		
		saucedemoLoginPage WebElementObj = new saucedemoLoginPage(driver);
		
		testCaseObj.openWeb(driver);
		testCaseObj.testCaseOne(WebElementObj, driver);
		testCaseObj.testCaseTwo(WebElementObj, driver);
		testCaseObj.testCaseThree(WebElementObj, driver);
		testCaseObj.testCaseFour(WebElementObj, driver);
		testCaseObj.testCaseFive(WebElementObj, driver);
		testCaseObj.testCaseSix(WebElementObj, driver);
		testCaseObj.testCaseSeven(WebElementObj, driver);
		testCaseObj.testCaseEight(WebElementObj, driver);
		
		
		
		//System.out.println("Ok Run");
		//WebElementObj.userName().clear();
		//WebElementObj.password().clear();
		
	}
}
