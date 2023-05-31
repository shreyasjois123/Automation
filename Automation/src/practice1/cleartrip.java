package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
 driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
driver.findElement(By.xpath("//input[1]")).click();
driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
driver.findElement(By.xpath("(//p[contains(text(),'Goa')])[1]")).click();
}}