package com.Actitime.Testscript;

import java.nio.channels.FileLockInterruptionException;

import org.apache.commons.compress.archivers.Lister;
import org.testng.annotations.Test;

import com.Actitime.Genriclibrary.Filelibrary;
import com.Actitime.Genriclibrary.baseClass;
import com.Actitime.pom.Taskpage;

public class CreateCustomer extends baseClass{

	
	
@Test

public void create() {
	Homepage hp = new Homepage(driver);
	hp.gettaskink().click();
    Taskpage tp = new Taskpage(driver);		
    tp.getAddnewbtn().click();
    tp.getNewCustomer().click();
    Filelibrary f=new Filelibrary();
   String custname = f.readDataPropertyFromExcel("Sheet1", 1, 1);
  String custdesp = f.readDataPropertyFromExcel("Sheet1", 1, 2);
  tp.getCustomername().sendKeys(custname);
  tp.getCustomerdescription().sendKeys(custdesp);
  tp.getCreatecustomer().click();
  String expecteddata = custname;
 driver.find
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
