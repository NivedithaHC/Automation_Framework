package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEST_SCRIPT 
{
@Test
public void click1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	POM1 p1=new POM1(driver);
	p1.clicklogin();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	p1.clicklogin();
}
}
