package Com.Actitime.GenricLiabrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
public WebDriver driver;
@BeforeSuite
	public void databaseConnection() {

Reporter.log("database connected", true);
}
@BeforeClass
public void launchBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.actitime.com/");
	Reporter.log("browser launch successfully",true);
}
@BeforeMethod
public void LoginToActitime() {
	driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[.='Login ']")).click();
Reporter.log("logged in successfully", true);

}
@AfterMethod
public void logoutFromActitime() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("Logged out SUCCESSFULL", true);
}
@AfterClass
public void closebrowser() {
	driver.close();
	Reporter.log(" browser close successfull", true);
}
@AfterSuite
public void closedatabaseConnection() {
	Reporter.log("database disconnected", true);
}
}