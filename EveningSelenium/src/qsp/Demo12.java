package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	//driver.findElement(By.name("email")).sendKeys("nivedithaveda9663@gmail.com");
	//Thread.sleep(2000);
	//driver.findElement(By.name("pass")).sendKeys("nive@12345");
	//Thread.sleep(2000);
	//driver.findElement(By.name("login")).click();
	//Thread.sleep(2000);
	driver.findElement(By.linkText("facebook")).click();
}
}


