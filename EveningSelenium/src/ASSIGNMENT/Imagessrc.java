package ASSIGNMENT;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagessrc 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	List<WebElement> img= driver.findElements(By.xpath("//img"));
	int count = img.size();
	System.out.println(count);
	for(WebElement we:img)
	{
	String src = we.getAttribute("src");
	System.out.println(src);
	}
}
}

