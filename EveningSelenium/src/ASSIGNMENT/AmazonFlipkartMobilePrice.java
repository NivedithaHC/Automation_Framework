package ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFlipkartMobilePrice 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}
}
