package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutclear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/manoj/Desktop/clear.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
	}
}

