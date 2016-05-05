package ecommercewebsite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebSitesMenuTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.web.com/ecommerce/");
		
		//Click on 'Websites'
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();
		
		//Store all the links under 'WebSites'
		
		List<WebElement> elements = driver.findElements(By.xpath(".//*[@id='nav-main']/li[1]/div/ul/li"));
		
		System.out.println(elements.size());
		

		
		String[] links = new String[elements.size()];	
		for(int i = 0; i<elements.size(); i++)
		{
			links[i] = elements.get(i).getAttribute("class");
			System.out.println(links[i]);
		}
		int j=1;
		for(int i = 0 ; i < elements.size() ; i++)
		{
			if(links[i].equals("show-us")||links[i].equals(""))
			{
				//driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();
				
//				WebElement element = driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]/div/ul/li["+j+"]/a"));
//				
//				System.out.println("gjhgjhgjhgjhgjhgj");
//				Thread.sleep(1000);
//				element.click();
//				System.out.println("after click");
//				driver.navigate().back();
				
				List<WebElement> element = driver.findElements(By.xpath(".//*[@id='nav-main']/li[1]/div/ul/li[@class='show-us']"));
				
				element.get(1).click();
				
				
					
				//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			}
			j++;
			//Click on 'Websites'
			driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();
			//break;
		}
		//We Build it For You
		driver.close();

	}

}
