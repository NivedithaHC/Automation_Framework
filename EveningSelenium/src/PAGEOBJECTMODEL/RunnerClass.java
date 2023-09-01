package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerClass 
{
@Test
public void Click() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
POM p=new POM(driver);
p.email("nivedithaveda9663@gmail.com");
Thread.sleep(2000);
p.pass("12345");
Thread.sleep(2000);
p.ClickLogin();
}
}
