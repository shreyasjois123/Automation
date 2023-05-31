package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyRadio {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
int y1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
Thread.sleep(2000);
int y2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
int y3=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
if(y1==y2&&y2==y3)
{
	System.out.println("radio button is properly aligned");
}
else
{
	System.out.println("radio button is properly aligned");
}
driver.close();}}
	
