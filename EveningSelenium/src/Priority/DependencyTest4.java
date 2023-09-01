package Priority;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyTest4 
{
@Test
public void Compose()
{
	Reporter.log("compose", true);
}
@Test(dependsOnMethods = "Compose")
public void SentItems()
{
	Reporter.log("sent items", true);
	Assert.fail();
}
@Test(dependsOnMethods = "SentItems")
public void trash()
{
	Reporter.log("trash", true);
}
}
