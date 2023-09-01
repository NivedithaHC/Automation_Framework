package ASSIGNMENT;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmultiple 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/manoj/Desktop/Selectmultiple.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("Countries"));
	Select s = new Select(ele);
	boolean b=s.isMultiple();
	if(b)
	{
		System.out.println("multi select dd");
	}
	else
	{
		System.out.println("Not a multi select");
		
	}
}
}
