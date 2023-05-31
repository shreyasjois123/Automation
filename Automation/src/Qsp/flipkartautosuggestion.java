package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartautosuggestion {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("(//button[text()='✕'])")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
List<WebElement> allsug = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
		//List<WebElement> allsug = driver.findElements(By.xpath("(//span[contains(.,'iphone')])"));
		
		int size=allsug.size();	
System.out.println(size);
for(WebElement sug:allsug) {
		String text=sug.getText();
	System.out.println(text);
	}
	driver.close();
	}

}
