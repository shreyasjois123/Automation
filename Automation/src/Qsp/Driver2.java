package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Deomo1.testA(driver);
		WebDriver driver1=new FirefoxDriver();
		Deomo1.testA(driver1);

	}

}
