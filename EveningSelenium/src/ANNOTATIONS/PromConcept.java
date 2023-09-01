package ANNOTATIONS;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PromConcept extends Generic 
{
@Test
public void test1() throws InterruptedException 
{
	WebElement ele = driver.findElement(By.xpath("//button[text()='Log in']"));
	ele.click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	ele.click();//StaleElementReferenceException
}
}
