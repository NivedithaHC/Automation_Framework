package ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    String url=driver.getCurrentUrl();
    System.out.println(url);
    if(url.equals("You"))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    	
   }
    driver.quit();
}
}
