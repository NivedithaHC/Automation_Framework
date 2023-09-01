package ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    String title=driver.getTitle();
	    System.out.println(title);
	    if(title.equals("You"))
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    	
	   }
}
}

	