package ecommercewebsite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShowAllUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.web.com/ecommerce/");
	
		// Store all the <a> tag elements in List of WebElements of variable elements
		List<WebElement> elements= driver.findElements(By.tagName("a"));
		
		String[] links = new String[elements.size()];
		
		//Total Number Of Links on Home page
		System.out.println("Total Number of Links on Home Page: "+elements.size());
		
		
		
		
		//Print Each Link on the Home Page
		System.out.println("The total Links Are:");
		for(int i = 0; i<elements.size(); i++)
		{
			links[i] = elements.get(i).getAttribute("href");
			System.out.println(links[i]);
		}
		
		// Click all the links on the Home Page
		for(int i = 0; i<elements.size() ; i++)
		{
			if(links[i]!=null)
			{
				driver.navigate().to(links[i]);
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			}
		}
		
		driver.close();
	
	}

}
