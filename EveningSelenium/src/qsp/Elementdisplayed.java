package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementdisplayed 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/manoj/Desktop/Elementdis.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a"));
	boolean b = ele.isDisplayed();
	if(b)
	{
		System.out.println("Element Displayed");
	}
	else
	{
		System.out.println("Element not  Displayed");
	}
}

}

