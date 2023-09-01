package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/manoj/Desktop/L13.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("admin");
	//driver.findElement(By.id("input")).sendKeys("admin");
	//driver.findElement(By.name("input")).sendKeys("admin");
	//driver.findElement(By.className("input")).sendKeys("admin");
}
}
