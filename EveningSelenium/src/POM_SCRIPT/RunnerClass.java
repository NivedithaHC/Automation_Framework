package POM_SCRIPT;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PAGEOBJECTMODEL.POM;

public class RunnerClass
{
@Test
public void Click() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	QAFORM q=new QAFORM(driver);
	q.firstName("Niveditha");
	Thread.sleep(2000);
	q.lastName("HC");
	Thread.sleep(2000);
	q.userEmail("nivedithaveda9663@gmail.com");
	Thread.sleep(2000);
	q.Clickradiobtn();
	Thread.sleep(2000);
	q.userNumber("9786543274");
	Thread.sleep(2000);
	q.subjectsInput("selenium");
	Thread.sleep(2000);
	q.Clickradiobtn1();
	Thread.sleep(2000);
	q.uploadPicture("C:\\Users\\manoj\\Pictures\\Screenshots\\Screenshot (82).png");
}
}
