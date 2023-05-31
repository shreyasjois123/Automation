package practice1;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getmtrduplicate {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
		WebElement web = driver.findElement(By.id("mtr"));
		Select s=new Select(web);
		List<WebElement> options = s.getOptions();
		int si = options.size();
		System.out.println(si);
		for(int i=0;i<si;i++)
		{
			String text=options.get(i).getText();
			System.out.println(text);
		}
		HashSet hs=new HashSet();
		
for(int i=0;i<si;i++) {

	String text=options.get(i).getText();
	
	hs.add(text);
			
		}
System.out.println();
for(Object opt:hs) {
	
	System.out.println(opt);
	
}
		
	}
}