package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedScript {static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
	WebElement slvlist = driver.findElement(By.id("slv"));
   Select s=new Select(slvlist);
   List<WebElement> options = s.getAllSelectedOptions();
   int size=options.size();
   for (int i = 0; i <size; i++) {
	String text = options.get(i).getText();
	System.out.println(text);}
	driver.close();

}

}
