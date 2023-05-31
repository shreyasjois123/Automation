package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingDoubleClick {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement tgt = driver.findElement(By.id("loginspan"));
		a.doubleClick(tgt).perform();
		String tital = driver.getTitle();
		if(tital.contains("Login"))
		{
		System.out.println("login page is displayed and pass");

	}
		else
			System.out.println("login page is not displayed and fail");

}}
