package ecommercewebsite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestOnYatra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method sub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yatra.com/?redirect=no&origin=US");
		
		driver.findElement(By.xpath(".//*[@id='countryPopup']/div[2]/div/div[1]")).click();
		
		Thread.sleep(10000);
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='frescoHeader']/div[1]/div/div/div"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element);
		
		System.out.println("Updates");
		
		WebElement element1 = driver.findElement(By.xpath(".//li[@class='moreNav list-dropdown js_yt_header_top']//a[@class='dropdown-toggle']"));
		
		action.moveToElement(element1).build().perform();
		
		System.out.println("Check");
		
		List<WebElement> dropDownElements = driver.findElements(By.xpath(".//div[@class='header-dropdown category-ddn']//li[@class='simple-dropdown']//a[@class='simple-tab eventTrackable']"));
		
		String[] listOfElements = new String[dropDownElements.size()];
		
		// List of Sub - Menu Items
		for(int i = 0; i<dropDownElements.size() ; i++)
		{
			listOfElements[i] = dropDownElements.get(i).getAttribute("href");
			System.out.println(listOfElements[i]);
		}
		
//		for(int i = 0; i<dropDownElements.size() ; i++)
//		{
//			if(listOfElements[i]!=null)
//			{
//				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//				driver.navigate().to(listOfElements[i]);
//				//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//				
////				if(dropDownElements.get(i).getText().equals("Offers"))
////				{
////					WebElement offersHover = driver.findElement(By.xpath(".//li[@class='list-dropdown relative moreDdnToggle']/a[@class='simple-tab eventTrackable dropdown-toggle']"));
////					
////					action.moveToElement(offersHover).build().perform();
////				}
//				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//			}
//			
//		}
//		
		
//		WebElement element3 = driver.findElement(By.xpath(".//*[@id='frescoHeader']/div[1]/div/div/div"));
//		System.out.println(element3.getText());
//		action.moveToElement(element3);
//		
		
		driver.get("http://www.yatra.com");
		
		driver.findElement(By.xpath(".//*[@id='countryPopup']/div[2]/div/div[1]")).click();
		
		Thread.sleep(5000);
		
		
		WebElement element3 = driver.findElement(By.xpath(".//*[@id='frescoHeader']/div[1]/div/div/div/ul/li/a[@class='dropdown-toggle']"));
		System.out.println(element3.getText());
		action.moveToElement(element3);
		
		WebElement offersHover = driver.findElement(By.xpath(".//li[@class='list-dropdown relative moreDdnToggle']/a[@class='simple-tab eventTrackable dropdown-toggle']"));					
		action.moveToElement(offersHover).build().perform();
	
//		for(int i = 0; i<dropDownElements.size() ; i++)
//		{
//			if(listOfElements[i].equals(""))
//			{	
////				if(dropDownElements.get(i).getText().equals("Offers"))
////				{
//					driver.navigate().to("http://www.yatra.com");
//					
////					WebElement element3 = driver.findElement(By.xpath(".//*[@id='frescoHeader']/div[1]/div/div/div"));
////					action.moveToElement(element3);
////					
//					WebElement offersHover = driver.findElement(By.xpath(".//li[@class='list-dropdown relative moreDdnToggle']/a[@class='simple-tab eventTrackable dropdown-toggle']"));					
//					action.moveToElement(offersHover).build().perform();
////				}
//				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//			}
//			
//		}
		
		driver.close();
	}

}
