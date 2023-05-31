package Qsp;

import org.openqa.selenium.WebDriver;

public class Driver {
	static void testA(WebDriver driver) {
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
