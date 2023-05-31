package Seleniummock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irtc {static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://irctc.com/contact.html");
	driver.findElement(By.xpath("(//div[@class='card-header'])[1]")).click();
 List<WebElement> all = driver.findElements(By.xpath("//td"));
 for(WebElement we:all) {
	 System.out.println(we.getText());
 }driver.close();
}
}