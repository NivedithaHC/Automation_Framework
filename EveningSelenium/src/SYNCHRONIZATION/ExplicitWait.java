package SYNCHRONIZATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
      Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("Enter"));
	String title = driver.getTitle();
	System.out.println(title);
	
}

}
