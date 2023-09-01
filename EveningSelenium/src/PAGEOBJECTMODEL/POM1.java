package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
//declaration
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginbtn;
	//initialization
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void clicklogin()
	{
		loginbtn.click();
	}
}
