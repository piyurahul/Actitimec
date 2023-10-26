package com.Actitime.Genriclibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelibrary {
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/commmondata.property");
	Properties p=new Properties();
p.load(fis);
String value = p.getProperty(key);
return value;

}

public String readDataPropertyFromExcel(String Sheet,int row,int cell) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/Customer.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	   String value = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	
	
}
}
