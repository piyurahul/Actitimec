package Com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(xpath = "//div[.='Add New']")
private WebElement addnewcust;
@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcust;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2])")
private WebElement custname;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement custdesp;
@FindBy(xpath="//div[.='Create Customer']")
private WebElement custcreate;
@FindBy(xpath="//div[@class='greyButton cancelBtn']")
private WebElement cancelbtn;

//initilization
public TaskPage(WebDriver driver) {
PageFactory.initElements(driver, this);

}
//utilization
public WebElement getAddnewcust() {
	return addnewcust;
}
}