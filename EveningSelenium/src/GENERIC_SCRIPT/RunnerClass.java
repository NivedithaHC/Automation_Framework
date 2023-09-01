package GENERIC_SCRIPT;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerClass extends Genericpra 
{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("firstName")).sendKeys("Niveditha");
	
	
	Thread.sleep(2000);
	driver.findElement(By.id("lastName")).sendKeys("H C");
	Thread.sleep(2000);
	driver.findElement(By.id("userEmail")).sendKeys("nivedithaveda9663@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("userNumber")).sendKeys("6779943267");
	Thread.sleep(2000);
	driver.findElement(By.id("subjectsInput")).sendKeys("selenium");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Reading']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	}
}
