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
 private WebDriver driver;
@BeforeSuite
	public void databaseConnection() {

Reporter.log("database connected", true);
}
@BeforeClass
public void launchBrowser() {
	setDriver(new ChromeDriver());
	getDriver().manage().window().maximize();
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	getDriver().get("https://www.actitime.com/");
	Reporter.log("browser launch successfully",true);
}
@BeforeMethod
public void LoginToActitime() {
	getDriver().findElement(By.id("username")).sendKeys("admin");
getDriver().findElement(By.name("pwd")).sendKeys("manager");
getDriver().findElement(By.xpath("//div[.='Login ']")).click();
Reporter.log("logged in successfully", true);

}
@AfterMethod
public void logoutFromActitime() {
	getDriver().findElement(By.id("logoutLink")).click();
	Reporter.log("Logged out SUCCESSFULL", true);
}
@AfterClass
public void closebrowser() {
	getDriver().close();
	Reporter.log(" browser close successfull", true);
}
@AfterSuite
public void closedatabaseConnection() {
	Reporter.log("database disconnected", true);
}
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
}