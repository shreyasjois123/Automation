package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wiprojobs"+Keys.ENTER);
List<WebElement> allsug = driver.findElements(By.xpath("//h3"));
int count=allsug.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	String text=allsug.get(i).getText();
	System.out.println(text);
}
Thread.sleep(2000);
driver.close();
}

}
