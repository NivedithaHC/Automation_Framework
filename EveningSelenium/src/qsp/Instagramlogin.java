package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramlogin 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nivedithaveda9663@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nive@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}

