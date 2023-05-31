package Qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTital {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		String wh1 = driver.getWindowHandle();
		System.out.println(wh1);
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			driver.switchTo().window(wh);
		String text=driver.getTitle();
		System.out.println(text);
			

		}
		
	}

}
