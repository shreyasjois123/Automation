package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTheurl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.selenium.org/");
				String expectedurl="https://www.selenium.dev/";
				String actualurl=driver.getCurrentUrl();
				if(expectedurl.equals(actualurl))
				{
					System.out.println("url is sucessfully navigating & pass");
				}
				else
				{System.out.println("url is not sucessfully navigating & fail");
				}
				driver.close();

	}

}
