package SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileData {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/credentials.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
	    String url = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    String un = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	    String pw = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	
	    WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	}

}
