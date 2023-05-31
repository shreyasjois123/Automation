package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlingListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
        WebElement slvlistbox = driver.findElement(By.id("slv"));
        Select s=new Select(slvlistbox);
		  List<WebElement> alloption = s.getAllSelectedOptions();
		int size = alloption.size();
		  for(int i=0;i<size;i++) {
			 String text = alloption.get(i).getText();
			 System.out.println(text);
		}

	}

}
