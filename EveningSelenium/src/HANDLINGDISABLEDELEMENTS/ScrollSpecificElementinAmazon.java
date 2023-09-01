package HANDLINGDISABLEDELEMENTS;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollSpecificElementinAmazon 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Instagram']"));
	Point locn = ele.getLocation();
	System.out.println(locn);
	int x = locn.getX();
	System.out.println(x);
	int y = locn.getY();
	System.out.println(y);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy, ('+x+','+y+')");
	Thread.sleep(1000);
	ele.click();
	}
}
