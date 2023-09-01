package Priority;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class Test2 
{
@Test(priority =1, invocationCount = 3)
public void data3()
{
	Reporter.log("hello", true);
}
@Test
public void data2()
{
	Reporter.log("world", true);
}
}
