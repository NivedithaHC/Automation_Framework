package Priority;

import org.testng.Reporter;


import org.testng.annotations.Test;

public class SkipTest3 
{
@Test(enabled=false)
public void data5()
{
	Reporter.log("hello", true);
}
@Test
public void data6()
{
	Reporter.log("world", true);
}
}

