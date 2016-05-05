package ecommercewebsite;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GoogleTestNG extends ExplaningStaticClass{
	WebDriver driver;
	ExplaningStaticClass exp = new ExplaningStaticClass();

	@BeforeClass
	public void googleTest()
	{
		driver = new FirefoxDriver();
	}
	
	@Test(enabled=true,priority=0)
	public void openFBURL()
	{
		driver.get("https://www.fb.com/");
	}
	
	@Test(enabled=true,priority=1)
	public void enterCredentials()
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mail2amuluswathi@yahoo.co.in");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("lol");
	}
	
	@Test(priority=2)
	public void testingStatic()
	{
		exp.openFB();
	}
	@AfterClass
	public void tear()
	{
		driver.close();
	}
	@Test(priority=4)
	public void openFB()
	{
		System.out.println("Hello Anusha :P");
	}
	
}
