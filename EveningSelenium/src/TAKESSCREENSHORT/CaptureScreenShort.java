package TAKESSCREENSHORT;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShort 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("C:\\Users\\manoj\\Pictures\\Screenshots\\popup.jpeg");
	FileHandler.copy(src, dst);
}
}
