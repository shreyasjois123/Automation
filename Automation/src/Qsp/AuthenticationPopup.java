package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	driver.close();}

}
