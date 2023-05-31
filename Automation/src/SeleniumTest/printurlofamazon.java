package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printurlofamazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		 List<WebElement> all = driver.findElements(By.xpath("//a"));
		 
        int size=all.size();
       
        for(WebElement url:all) {
        	String text1 = url.getAttribute("href");
        	System.out.println(text1);
        }
	}

}
