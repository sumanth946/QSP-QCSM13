package testNG;

import org.testng.annotations.Test;

public class TestCase01 {
	
	@Test(description="this is login page")
	public void login()
	{
		System.out.println("LOGIN IS PASSED");
	}

}
