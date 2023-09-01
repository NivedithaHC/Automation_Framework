package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 
{
	@FindBy(name="username")
	private WebElement unTbox;
	@FindBy(name="pwd")
	private WebElement pwdTbox;
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	public POM2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String un)
	{
		unTbox.sendKeys(un);
	}
	public void  pwd(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void  ClickLogin()
	{
	     loginBtn.click();
	}
}

