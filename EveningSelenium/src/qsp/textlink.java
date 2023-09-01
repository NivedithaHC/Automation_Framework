package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textlink 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[@href='/downloads']"));
	String txt = ele.getText();
	System.out.println(txt);
}
}
