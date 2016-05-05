package ecommercewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new FirefoxDriver();
		
		driver.get("http://www.web.com/ecommerce/");
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.close();
	
	}

}
