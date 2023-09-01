package HANDLINGPOPUPS;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AonlyParentBrowser 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String wh = driver.getWindowHandle();
	System.out.println(wh);
}
}
