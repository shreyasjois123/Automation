package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionCloseWindow {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String etital="soogle";
		String atital = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(etital, atital);
		driver.close();
		s.assertAll();
		
	}

}
