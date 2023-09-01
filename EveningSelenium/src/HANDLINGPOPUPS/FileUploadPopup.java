package HANDLINGPOPUPS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/manoj/Desktop/FileUploadpopup.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("upload file"));
	ele.sendKeys("C:\\Users\\manoj\\Desktop\\Fileuploadpopup.txt");
}
}
