package com.Actitime.Genriclibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseClass {
WebDriver driver;
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connection",true);
}
@BeforeClass
public void launchbrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com");
	Reporter.log("browser launch successsfully",true);
}
@BeforeMethod
public void login() {
	driver.findElement(By.id("")).sendKeys("admin");
	driver.findElement(By.name("")).sendKeys("manager");
	driver.findElement(By.xpath("")).click();
	Reporter.log("logged in successfully",true);
}
@AfterMethod
public void logout() {
	driver.findElement(By.id("")).click();
	Reporter.log("logout successsfully",true);
}
@AfterClass
public void closebrowser() {
Reporter.log("browser close successfully",true);
}


}
