package Qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicateOptionMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
        WebElement mtrlistbox = driver.findElement(By.id("mtr"));
        Select s=new Select(mtrlistbox);
        List<WebElement> alloptions = s.getOptions();
        int cout=alloptions.size();
        ArrayList v=new ArrayList();
        System.out.println("option before remove duplicate");
        for(WebElement obj:alloptions) {
        	String text=obj.getText();
        	v.add(text);
        	System.out.println(text);
        }System.out.println();
        System.out.println("option after remove duplicate");
driver.close();
}}

