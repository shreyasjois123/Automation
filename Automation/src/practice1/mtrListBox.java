package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtrListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
        WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> op = s.getOptions();
		for(WebElement opt:op) {
			String text=opt.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
