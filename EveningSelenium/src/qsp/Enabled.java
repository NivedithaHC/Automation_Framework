package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/manoj/Desktop/Enabled.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input"));
	boolean b = ele.isEnabled();
	if(b)
	{
		System.out.println("Element Enabled");
	}
	else
	{
		System.out.println("Element Disabled");
	}
	//ele.sendKeys("admin");
}
	
}



