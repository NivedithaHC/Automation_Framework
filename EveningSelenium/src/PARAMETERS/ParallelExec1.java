package PARAMETERS;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec1 
{
	public WebDriver driver;

	@Test
	@Parameters({"browser"})
	public void test1(String browser)
	{
		System.setProperty("webdriver.edge.driver", "./software/edgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
			driver.get("https://www.google.com");
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com"); 
		}
	}
}
		

