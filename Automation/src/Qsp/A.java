package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A {
	static
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

	}

}
