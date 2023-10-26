package Com.Actitime.Testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.pom.LoginPage;

public class SteleElement {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	LoginPage lp=new LoginPage();
	PageFactory.initElements(driver, lp);
	lp.getUntbx().sendKeys("admin");
	lp.getPwtbx().sendKeys("manager");
	lp.getLgbtn().click();
	Thread.sleep(5000);
	driver.close();
}
}