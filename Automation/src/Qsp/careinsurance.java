package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class careinsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(month);
		s.selectByIndex(9);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1=new Select(year);
	s1.selectByVisibleText("1996");
 driver.findElement(By.xpath("(//a[@class='ui-state-default'])[12]")).click();
 driver.findElement(By.id("alternative_number")).sendKeys("985098450");
 driver.findElement(By.id("renew_policy_submit")).click();
 boolean b=driver.findElement(By.id("policynumberError")).isDisplayed();
 if(b) {
	 System.out.println("message is displayed");
 }
 else
 {
	 System.out.println("message is not displayed");
 }
 driver.close();
	}
}
