package Qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingTabswithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> allwh = driver.getWindowHandles();
        int size =allwh.size();
        System.out.println(size);
        for(String wh:allwh)
        {
       driver.switchTo().window(wh);
        	driver.close();
        }
		

	}

}
