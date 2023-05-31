package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("shreyasnsjois33@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	}
}
