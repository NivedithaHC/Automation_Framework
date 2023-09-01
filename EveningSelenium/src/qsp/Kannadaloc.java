package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kannadaloc 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	Point locn = ele.getLocation();
	System.out.println(locn);
	int x = locn.getX();
	System.out.println(x);
	int y = locn.getY();
	System.out.println(y);
}
}

