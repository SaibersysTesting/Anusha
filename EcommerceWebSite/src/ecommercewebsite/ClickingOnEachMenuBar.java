package ecommercewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickingOnEachMenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.web.com/ecommerce/");
		
		//Click on 'Websites'
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();
		
		//Click on 'Online Marketing'
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[2]")).click();
		
		//Click on 'Other Product'
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[3]")).click();
		
		//Click on 'Premium Services'
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[4]")).click();
		
		//navigate back to the Home page
		
		driver.navigate().back();
		
		driver.close();
				
	}

}
