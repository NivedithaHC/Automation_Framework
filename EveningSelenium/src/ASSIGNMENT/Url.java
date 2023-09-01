package ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    String url=driver.getCurrentUrl();
    if(url.contains("facebook"))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    	
   }
}
}

