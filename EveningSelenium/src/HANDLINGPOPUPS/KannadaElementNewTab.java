package HANDLINGPOPUPS;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KannadaElementNewTab 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l=new ArrayList<String>(allwh);
	for(String wh:allwh)
	{
		String rv = l.get(1);
		driver.switchTo().window(rv);
	}
}
}
