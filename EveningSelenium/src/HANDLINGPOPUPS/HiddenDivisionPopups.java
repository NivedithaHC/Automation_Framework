package HANDLINGPOPUPS;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='August']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='4']")).click();
}
}
