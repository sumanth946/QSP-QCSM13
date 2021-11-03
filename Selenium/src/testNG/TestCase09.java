package testNG;

import org.testng.annotations.Test;

public class TestCase09 {
	
	//Creating dependency between test cases
	//failure of one test case will lead to skipping of dependent test cases
	
	@Test()
	public void login() throws Exception
	{
		System.out.println("hi");
		throw new Exception();
	}
	
	@Test(dependsOnMethods="login")
	public void cart()
	{
		System.out.println("cart page");
		
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("logout page");
		
	}

}
