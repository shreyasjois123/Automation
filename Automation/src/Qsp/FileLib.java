package Qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this is a generic class for data driven 
 * @author Shreyas
 * 
 *
 */

public class FileLib {
/**
 * this is a generic method for reading the data from the property file
 * @param key
 * @return string
 * @throws IOException
 */
	public String getpropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/D.property");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
	}
	/**
	 * this is a generic method for reading the data from the Excel file
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/credentials.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	
}
	
}