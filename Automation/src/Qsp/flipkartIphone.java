package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartIphone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("i phone 14pro max"+Keys.ENTER);
	Thread.sleep(2000);
List<WebElement> allsug = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
List<WebElement> allsug1 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
int count=allsug.size();
int count1=allsug1.size();
System.out.println(count);
System.out.println(count1);
for(int i=0;i<count;i++) {
	String text=allsug.get(i).getText()+"========>"+"price :"+allsug1.get(i).getText();
	System.out.println(text);
}
Thread.sleep(2000);
driver.close();
}

}
