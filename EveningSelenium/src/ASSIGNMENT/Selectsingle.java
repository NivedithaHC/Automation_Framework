package ASSIGNMENT;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectsingle 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/manoj/Desktop/Selectsingle.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("Countries"));
	Select s = new Select(ele);
	s.selectByIndex(1);
	Thread.sleep(2000);
	s.selectByValue("k");
	Thread.sleep(2000);
	s.selectByVisibleText("Rusia");
	Thread.sleep(2000);
	//s.deselectAll();
}
}

