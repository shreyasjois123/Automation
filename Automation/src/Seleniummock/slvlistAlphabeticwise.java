package Seleniummock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class slvlistAlphabeticwise { 
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
	WebElement slv = driver.findElement(By.id("mtr"));
	Select s=new Select(slv);
	List<WebElement> opt = s.getOptions();
	ArrayList al= new ArrayList();
	int size=opt.size();
	 for(int i=0;i<size;i++) {
		al.add(opt.get(i).getText());
		
	}Collections.sort(al);
	for(Object opt1:al) {
		System.out.println(opt1);
	}
	driver.close();
}

}
