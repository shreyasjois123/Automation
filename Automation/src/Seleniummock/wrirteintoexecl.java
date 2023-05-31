package Seleniummock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wrirteintoexecl {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/hotel.html");
	WebElement slv = driver.findElement(By.id("mtr"));
	Select s=new Select(slv);
	List<WebElement> opt = s.getOptions();
	HashSet hs=new HashSet();
	int s1=opt.size();
	System.out.println("with duplicates"+s1);
	int h=0;
	for(int i=0;i<s1;i++) {
		System.out.println(opt.get(i).getText());
	}
    for(int i=0;i<s1;i++) {
    	hs.add(opt.get(i).getText());}
    int size=hs.size();
    System.out.println("after removing duplicates  :"+size);
	System.out.println();for(Object opt1:hs) {
		String tex=(String) opt1;
		System.out.println(tex);
		FileInputStream fis=new FileInputStream("./data/Bookselenium.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    FileOutputStream fos=new FileOutputStream("./data/Bookselenium.xlsx");
		wb.getSheet("Sheet1").getRow(h).getCell(0).setCellValue(tex);
		wb.write(fos);
		h++;
	}
	driver.close();
}}