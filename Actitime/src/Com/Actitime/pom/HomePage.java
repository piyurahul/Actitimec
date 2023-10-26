package Com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

//decleration
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reporttab;
   
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	//initilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	
	//utilization

	/**
	 * @return the tasktab
	 */
	public WebElement getTasktab() {
		return tasktab;
	}
	/**
	 * @return the reporttab
	 */
	public WebElement getReporttab() {
		return reporttab;
	}
	/**
	 * @return the logoutlink
	 */
	public WebElement getLogoutlink() {
		return logoutlink;
	}
 }