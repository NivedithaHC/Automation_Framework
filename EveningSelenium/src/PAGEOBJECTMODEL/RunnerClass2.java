package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerClass2 
{
	@Test
	public void Click() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	POM2 p2=new POM2(driver);
	p2.username("niveditha");
	Thread.sleep(2000);
	p2.pwd("5678");
	Thread.sleep(2000);
	p2.ClickLogin();
	}
	}

