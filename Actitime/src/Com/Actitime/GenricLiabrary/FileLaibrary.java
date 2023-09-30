package Com.Actitime.GenricLiabrary;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is genric class which contains nonstatic to  read data from property and excel file
 * @author Priyanka Shigawan
 *
 */
public class FileLaibrary {
/**
 * this method id is a non static method used to read data from property file.
 * @param key
 * @return
 * @throws IOException
 */
	public String readDataFromPropertyFile(String key) {
	FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
	Properties p= new Properties();
	p.load0(fis);
	String value = p.getProperty(key);
	return value;
}
	


	/**
	 * this method isnon static method used to data from excel sheet.
	 * @param sheet
	 * @param row
	 * @param cell
	 *@return
	 * @throws EncryptedDocumentException
	 *@throws IOException
	 */
	public String readDataFromExcel(String sheet,int row,int cell) {
	FileInputStream fis= new FileInputStream();
	   Workbook wb = WorkbookFactory.create(fis);
String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
return value;

}
}