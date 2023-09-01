package FRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqaframe 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	driver.switchTo().frame("frame1");
	WebElement ele1 = driver.findElement(By.id("sampleHeading"));
	System.out.println(ele1.getText());
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	WebElement ele = driver.findElement(By.id("sampleHeading"));
	System.out.println(ele.getText());
}
}
