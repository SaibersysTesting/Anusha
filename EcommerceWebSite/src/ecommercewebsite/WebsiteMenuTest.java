package ecommercewebsite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.impl.io.SocketOutputBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteMenuTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.web.com/ecommerce/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();

		List<WebElement> element = driver.findElements(By.xpath(".//*[@id='nav-main']/li[1]/div/ul/li"));
		List<WebElement> nonEmpty = new ArrayList<WebElement>();

		String s = element.get(0).getText();
		/*
		 * int liCount=0; WebElement current; for(WebElement e:element) {
		 * System.out.println(e.getText()); if(e.getText().equals(" "))
		 * System.out.println("manmai"); }
		 * 
		 * //nteger g = Integer.valueOf(element.get(0).getText());
		 * System.out.println(s); System.out.println("manmai");
		 * 
		 * 
		 * 
		 */
		
		for(WebElement e:element)
			System.out.println(e.getText());
//			if(!e.getText().equals(s))
//				nonEmpty.add(e);
		//int i = 1;
		WebElement current;
		int arr[]={1,3,5,6};
		
//		
//		for (WebElement e : element) {
//		
//System.out.println("i value is "+i);
//	if(i!=3)
//if (!e.getText().equals(s)) {
		for(int i:arr)
		{
				current=driver.findElement(By.xpath(".//ul[@id='nav-main']/li[1]/div/ul/li[" + i + "]/a"));
				System.out.println(" 1");
				//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				current.click();
				System.out.println("2");
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				//.get("http://www.web.com/ecommerce/");
				driver.navigate().back();

				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				System.out.println("3");

				driver.findElement(By.xpath(".//*[@id='nav-main']/li[1]")).click();
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	
			
			

		}
		driver.close();
	}

}
