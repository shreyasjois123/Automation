package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	private WebElement un;
	private WebElement pw;
	private WebElement lg;
	login(WebDriver driver){
		un=driver.findElement(By.id("username"));
	pw=driver.findElement(By.name("pwd"));
	lg = driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setuser(String ur, String pr) {
		un.sendKeys(ur);
		pw.sendKeys(pr);
		lg.click();
	}

}
