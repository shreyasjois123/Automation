package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiproAutosugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wiprojobs");
List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(text(),'wipro')]"));
int count=allsug.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	String text=allsug.get(i).getText();
	System.out.println(text);
}


}

}
