package MOUSEHOVERING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QAFORM 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(("Niveditha"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("H C");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nivedithaveda9663@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9902138815");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	WebElement ele = driver.findElement(By.className("//select[@class='react-datepicker__month-select']"));
	Select mon = new Select(ele);
	mon.selectByIndex(5);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Reading']")).click();
	
}
}
