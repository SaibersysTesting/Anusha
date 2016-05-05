package ecommercewebsite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeSuite
	public void testcase()
	{
		System.out.println("Welcome To Jenkins");
	}
	@Test(priority=4)
	public void testcase2()
	{
		System.out.println("Login");
	}
	@Test
	public void testcase3()
	{
		System.out.println("Logout");
	}
	@AfterMethod
	public void testcase4()
	{
		System.out.println("Welcome 4");
	}
}
