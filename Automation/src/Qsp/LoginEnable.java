package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
boolean e = driver.findElement(By.id("loginbutton")).isEnabled();
if(e)
{
	System.out.println("enabled");
}
else {System.out.println("not enabled");}
driver.close();}

}
