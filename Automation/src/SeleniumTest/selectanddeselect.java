package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectanddeselect {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
WebElement fs = driver.findElement(By.id("mtr"));
Select s=new Select(fs);
List<WebElement> alloptions = s.getOptions();
int count=alloptions.size();
for(int i=0;i<count;i++) {
	s.selectByIndex(i);
}

for(int i=count-1;i>=0;i--) {
	s.deselectByIndex(i);
}
	}
	}