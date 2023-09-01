package ANNOTATIONS;

import org.openqa.selenium.By;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion extends Generic
{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title=driver.getTitle();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title, "hello");
	System.out.println("1");
	sa.assertAll();
}
}