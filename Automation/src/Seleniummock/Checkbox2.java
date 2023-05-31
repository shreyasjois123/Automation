package Seleniummock;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Checkbox2 {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions op= new ChromeOptions();
			op.addArguments("--disable-notifications");
			WebDriver driver= new ChromeDriver(op);
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Actions a= new Actions(driver);
			a.moveToElement(driver.findElement(By.linkText("Men")));
			a.moveToElement(driver.findElement(By.linkText("T-Shirts"))).click().perform();
			
			List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='common-checkboxIndicator']"));

		for(WebElement c:checkbox)
		{
			c.click();
			Thread.sleep(1000);
		}
		driver.close();
		}
		
		}