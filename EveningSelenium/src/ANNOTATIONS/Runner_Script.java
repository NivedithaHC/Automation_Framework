package ANNOTATIONS;

import org.openqa.selenium.By;


import org.testng.annotations.Test;

public class Runner_Script extends Generic 
{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
}
}
