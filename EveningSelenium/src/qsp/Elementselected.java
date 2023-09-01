package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementselected 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/manoj/Desktop/Selected.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input"));
	boolean b = ele.isSelected();
	if(b)
	{
		System.out.println("Element selected");
	}
	else
	{
		System.out.println("Element not selected");
	}
}
}

