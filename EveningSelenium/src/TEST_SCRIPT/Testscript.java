package TEST_SCRIPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscript 
{
@Test
public void test1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	Generictest g=new  Generictest(driver);
	g.firstName("Niveditha");
	Thread.sleep(2000);
	g.lastName("HC");
	Thread.sleep(2000);
	g.userEmail("nivedithaveda9663@gmail.com");
	Thread.sleep(2000);
	g.Clickradiobtn();
	Thread.sleep(2000);
	g.userNumber("9786543274");
	Thread.sleep(2000);
	g.subjectsInput("selenium");
	Thread.sleep(2000);
	g.Clickradiobtn1();
	Thread.sleep(2000);
	g.uploadPicture("C:\\Users\\manoj\\Pictures\\Screenshots\\Screenshot (82).png");
}
}

