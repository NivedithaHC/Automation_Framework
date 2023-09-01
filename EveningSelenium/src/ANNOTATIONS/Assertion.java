package ANNOTATIONS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Generic
{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title=driver.getTitle();
	Assert.assertEquals(title, "Facebook – log in or sign up");
	System.out.println(1);
	
	//thread.sleep(2000);
}
}


