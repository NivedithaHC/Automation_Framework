package PAGEOBJECTMODEL;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
@FindBy(name="email")
private WebElement emailTbox;
@FindBy(name="pass")
private WebElement passTbox;
@FindBy(xpath="//button[text()='Log in']")
private WebElement LoginBtn;
public POM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void email(String email)
{
	emailTbox.sendKeys(email);
}
public void pass(String pass)
{
	passTbox.sendKeys(pass);
}
public void  ClickLogin()
{
     LoginBtn.click();
}
}
