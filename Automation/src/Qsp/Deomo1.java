package Qsp;

import org.openqa.selenium.WebDriver;

public class Deomo1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
static void testA(WebDriver driver) {
	driver.get("https://www.google.com/");
	String titale=driver.getTitle();
	System.out.println(titale);
	driver.close();
}
}
