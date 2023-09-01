package POM_SCRIPT;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAFORM 
{
	@FindBy(id="firstName")
	private WebElement fntbox;
	@FindBy(id="lastName")
	private WebElement lntbox;
	@FindBy(id="userEmail")
	private WebElement uetbox;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement radiobtn;
	@FindBy(id="userNumber")
	private WebElement untbox;
	@FindBy(id="subjectsInput")
	private WebElement sItbox;
	@FindBy(xpath="//label[text()='Reading']")
	private WebElement radiobtn1 ;
	@FindBy(xpath="//input[@id='uploadPicture']")
	private WebElement uptbtn ;
	
	public QAFORM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void firstName(String fN)
	{
		fntbox.sendKeys(fN);
	}
	public void lastName(String lN)
	{
		lntbox.sendKeys(lN);;
	}
	public void userEmail(String uE)
	{
		uetbox.sendKeys(uE);
	}
	public void Clickradiobtn()
	{
		radiobtn.click();
	}
	public void userNumber(String uN)
	{
		untbox.sendKeys(uN);
	}
	public void subjectsInput(String sI)
	{
		sItbox.sendKeys(sI);
	}
	public void Clickradiobtn1()
	{
		radiobtn1.click();
	}
	public void uploadPicture(String uP)
	{
		uptbtn.sendKeys(uP); ;
	}
	}
