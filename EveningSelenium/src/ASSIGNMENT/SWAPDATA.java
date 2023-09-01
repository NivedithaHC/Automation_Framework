package ASSIGNMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWAPDATA 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/manoj/Desktop/Swapdata.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='a1']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a3']"));
		ele1.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='a1']"));
	    ele3.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.xpath("//input[@value='Manual']"));
	    ele4.sendKeys(Keys.CONTROL+"av");
	    WebElement ele5 = driver.findElement(By.xpath("//input[@type='text3']"));
	    ele5.sendKeys(Keys.CONTROL+"ax");
	     WebElement ele6 = driver.findElement(By.xpath("//input[@type='text2']"));
	    ele6.sendKeys(Keys.CONTROL+"av");
	    WebElement ele7 = driver.findElement(By.xpath("//input[@id='a1']"));
		Thread.sleep(2000);
		ele7.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele8 = driver.findElement(By.xpath("//input[@id='a2']"));
		ele8.sendKeys(Keys.CONTROL+"av");
	    }
	}
		
			
				


