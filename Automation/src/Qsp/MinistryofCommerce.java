package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MinistryofCommerce {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		/*ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");*/
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.findElement(By.partialLinkText("Ministry of Commerce & Industry ")).click();
		

	}

}
