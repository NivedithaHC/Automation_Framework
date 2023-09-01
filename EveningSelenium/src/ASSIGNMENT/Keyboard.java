package ASSIGNMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/manoj/Desktop/Swapdata.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input[@id='a1']"));
	Thread.sleep(2000);
	ele.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='a3']"));
	ele1.sendKeys(Keys.CONTROL+"av");
	Thread.sleep(2000);
	WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
	ele2.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	WebElement ele3 = driver.findElement(By.xpath("//input[@value='Manual']"));
    ele3.sendKeys(Keys.CONTROL+"av");
    WebElement ele4 = driver.findElement(By.xpath("//input[@type='text3']"));
    ele4.sendKeys(Keys.CONTROL+"ax");
    WebElement ele5 = driver.findElement(By.xpath("//input[@type='text2']"));
    ele5.sendKeys(Keys.CONTROL+"av");
}
}
