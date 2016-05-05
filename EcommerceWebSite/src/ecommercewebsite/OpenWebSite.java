package ecommercewebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		// Open the website
		
		driver.get("http://www.web.com/ecommerce/");
		
		driver.close();
		
	}

}
