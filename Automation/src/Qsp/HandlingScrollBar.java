package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		int y = driver.findElement(By.xpath("//a[text()='Read about our approach to external linking.']")).getLocation().getY();
	System.out.println(y);
	j.executeScript("window.scrollBy(0,6000)");
	Thread.sleep(2000);
	j.executeScript("window.scrollBy(0,-3000)");
	

	}

}
