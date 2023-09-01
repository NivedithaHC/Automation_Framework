package ASSIGNMENT;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assiamaz 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptops");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l=new ArrayList<String>(allwh);
	for(String wh:allwh)
	{
		String b1=l.get(0);
		driver.switchTo().window(b1);
	}
}
}
