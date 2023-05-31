package SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class readpropertyfile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public  String url;
public  String username;
public  String ps;
	public  void pa() throws IOException {
		FileInputStream fis=new FileInputStream("./data/D.property");
		Properties p=new Properties();
		p.load(fis);
	   url = p.getProperty("url");
	   username = p.getProperty("username");
	   ps= p.getProperty("password");
      
	}

}
