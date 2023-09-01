package SYNCHRONIZATION;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Grocery']")).click();
	driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	driver.findElement(By.xpath("//div[text()='Appliances']")).click();
	driver.findElement(By.xpath("//div[text()='Travel']")).click();
	}
}
