package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectAndDeselect {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
         WebElement wb = driver.findElement(By.id("slv"));
         Select s=new Select(wb);
         List<WebElement> options = s.getOptions();
         int size=options.size();
         for(int i=0;i<size;i++) {
        	s.selectByIndex(i);
        	String text=options.get(i).getText();
        	System.out.println(text);
         }
         for(int i=size-1;i>=0;i--) {
         	s.deselectByIndex(i);
         	
	}
         driver.close();

}}
