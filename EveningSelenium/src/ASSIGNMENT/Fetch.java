package ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    String title=driver.getTitle();
    if(title.contains("facebook"))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    }
   }
}
