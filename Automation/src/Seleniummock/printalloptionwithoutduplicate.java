package Seleniummock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalloptionwithoutduplicate {static
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
	int size=opt.size();
	 for(int i=0;i<size;i++) {
		hs.add(opt.get(i).getText());
		
	}
	 int row=0;
	 for(Object opt1:hs)
	 {
		 String op = (String)opt1;
		 System.out.println(op);
		FileInputStream fis=new FileInputStream("./data/Bookselenium.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(row).getCell(0).setCellValue(op);
		FileOutputStream fos=new FileOutputStream("./data/Bookselenium.xlsx");
		wb.write(fos);
		row++;
	 }
	
	driver.close();
}
}