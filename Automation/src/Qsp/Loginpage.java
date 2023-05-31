package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage{
	private WebElement u;
	private WebElement p;
	private WebElement lg;
	public Loginpage(WebDriver driver) {
		u=driver.findElement(By.id("username"));
		p=driver.findElement(By.name("pwd"));
		lg=driver.findElement(By.xpath("//div[text()='Login']"));
	}
	public void setLogin(String un, String pw) {
		u.sendKeys(un);
		p.sendKeys(pw);
		lg.click();
	}

}
