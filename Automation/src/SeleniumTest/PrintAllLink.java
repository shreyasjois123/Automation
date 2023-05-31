package SeleniumTest;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLink {

	static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://google.com");
			driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
List<WebElement> alllink = driver.findElements(By.xpath("//h3"));
	int count=alllink.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text=alllink.get(i).getText();
		System.out.println(text);
	}
	driver.close();
		}

}
