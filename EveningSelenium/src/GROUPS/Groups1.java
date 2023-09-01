package GROUPS;

import org.testng.annotations.Test;

@Test(groups= {"functional"})//within class
public class Groups1 
{
@Test(groups= {"Sanity"})
public void test1()
{
System.out.println("compose");
}
@Test(groups={"Sanity","regression"})
public void test2()
{
	System.out.println("SentItems");
}
@Test(groups={"regression"})
public void test3()
{
	System.out.println("trash");
}
}

