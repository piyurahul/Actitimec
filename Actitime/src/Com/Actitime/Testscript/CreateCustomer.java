package Com.Actitime.Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Actitime.GenricLiabrary.BaseClass;
import Com.Actitime.pom.HomePage;

public class CreateCustomer extends BaseClass{
@Test
public void createCustomer(WebDriver driver) {
	HomePage hp=new HomePage(driver);
	hp.getTasktab().click();
}
}
