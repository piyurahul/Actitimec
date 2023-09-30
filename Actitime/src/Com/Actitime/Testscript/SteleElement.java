package Com.Actitime.Testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.pom.LoginPage;

public class SteleElement {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("");
	 LoginPage Ip=new LoginPage();
	 PageFactory.initElements(driver,Ip);
	 Ip.getUntbx().sendKeys("admin");
	 Ip.getPwtbx().sendKeys("manager");
	 Ip.getLgbtn().click();
Thread.sleep(5000);
driver.close();
}
}
