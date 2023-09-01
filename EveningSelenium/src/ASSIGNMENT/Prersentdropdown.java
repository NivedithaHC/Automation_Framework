package ASSIGNMENT;

import java.util.ArrayList;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Prersentdropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("month"));
	//ArrayList<String> l = new ArrayList<String>();
	Select s = new Select(ele);
	ArrayList<String> l = new ArrayList<String>();
	List<WebElement> opt = s.getOptions();
	int count = opt.size();
	System.out.println(count);
	for(WebElement we:opt)
	{
		String t = we.getText();
		l.add(t);
	}
	if(l.contains("sep"))
	{
		System.out.println("option present");
	}
	else
	{
		System.out.println("option is not present");
	}
}
}
