package qsp;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googlemap 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.google.com/maps/");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).clear();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("Bengaluru, Karnataka");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@data-tooltip='Search']")).sendKeys("Mysuru, Karnataka");
}
}
	