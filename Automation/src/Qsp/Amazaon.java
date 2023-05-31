package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazaon {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.Amazon.com/");
			Thread.sleep(2000);
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count=alllink.size();
		System.out.println(count);
	for(int i=0;i<count;i++) {
		String text=alllink.get(i).getText();
		System.out.println(text);
	}
	
	driver.close();

	}

}
