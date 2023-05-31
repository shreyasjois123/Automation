package Seleniummock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllLinkAmazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int size=alllink.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text = alllink.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
