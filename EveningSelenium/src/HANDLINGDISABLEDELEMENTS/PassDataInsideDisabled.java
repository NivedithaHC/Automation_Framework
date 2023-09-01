package HANDLINGDISABLEDELEMENTS;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataInsideDisabled 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/manoj/Desktop/disable.html");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('a1').value='world'");
}
}
