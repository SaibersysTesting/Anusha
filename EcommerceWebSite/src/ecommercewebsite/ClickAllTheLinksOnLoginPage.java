package ecommercewebsite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClickAllTheLinksOnLoginPage {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		@Test(priority=1)
		public void clickAllTheLinksOnLoginPage()
		{
		WebDriver driver = new FirefoxDriver();

		driver.get("https://support.web.com/v3/login.aspx");

		List<WebElement> elements = driver.findElements(By.tagName("a"));

		String[] links = new String[elements.size()];

		for (int i = 0; i < elements.size(); i++) {
			links[i] = elements.get(i).getAttribute("href");
			System.out.println(links[i]);

		}

		for (int i = 0; i < elements.size(); i++) {
			if (links[i] != null) {
				driver.navigate().to(links[i]);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		}
		driver.close();
		}
//	}

}
