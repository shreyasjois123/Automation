package com.actitime.generic1;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Qsp.FileLib;
import SeleniumTest.readpropertyfile;

public class BaseClass {
	WebDriver driver;
	
		@BeforeClass
	public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib f=new FileLib();
		driver.get(f.getpropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getpropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getpropertyData("password"));
		driver.findElement(By.id("loginButton")).click();
		
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		driver.findElement(By.linkText("Logout")).click();
	}
	}
