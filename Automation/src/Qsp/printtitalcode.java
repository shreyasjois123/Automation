package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printtitalcode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				String expectedurl="https://www.selenium.dev/";
				String htmlcode=driver.getPageSource();
				System.out.println(htmlcode);
				driver.quit();

	}

}
