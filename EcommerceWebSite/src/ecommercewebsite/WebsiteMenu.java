package ecommercewebsite;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteMenu {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.web.com/ecommerce/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();
		

		List<WebElement> element = driver.findElements(By.xpath(".//*[@id='nav-main']/li/div/ul/li/a"));
		System.out.println(element.size());
		
		String[] listElements = new String[element.size()];
		
		for(int i = 0; i<element.size(); i++)
		{
			listElements[i] = element.get(i).getAttribute("href");
			System.out.println(listElements[i]);
		}
		
		for(int i = 0; i<element.size(); i++)
		{
			if(!listElements[i].equals(null))
			{
				driver.navigate().to(listElements[i]);
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			}
		}
		
		driver.close();

	}

}
