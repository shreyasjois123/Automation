package Seleniummock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodcls {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void testcase() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	loginpage l=new loginpage(driver);
	l.setlogin("admin", "manager");
	
}
}
