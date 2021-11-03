package testNG;

import org.testng.annotations.Test;

public class TestCase07 {
	
	//disable the test case
	
	//METHOD 1
	@Test(enabled = false)
	public void demo()
	{
		System.out.println("hi");
	}
	//Method 2
	@Test(invocationCount=0)
	public void demo1()
	{
		System.out.println("hello");
	}
	@Test()
	public void demo2()
	{
		System.out.println("hello how are u");
	}
	

}
