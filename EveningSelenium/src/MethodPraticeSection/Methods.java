package MethodPraticeSection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p = new Point(200,300);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("email"));
	String fsize = ele.getCssValue("font-size");
	System.out.println(fsize);
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//input[@name='email']"));
	String txt = ele.getText();
	System.out.println(txt);
	Thread.sleep(2000);
	WebElement ele3 = driver.findElement(By.xpath("//a[@href='/downloads']"));
	String txt1 = ele3.getText();
	System.out.println(txt1);
	//WebElement ele2 = driver.findElement(By.xpath("//a"));
	//boolean b = ele.isDisplayed();
	//if(b)
	//{
		System.out.println("Element Displayed");
	//}
	//else
	//{
		System.out.println("Element not  Displayed");
	//}
}
}
	