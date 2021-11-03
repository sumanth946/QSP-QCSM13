package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase08 {
	@Test
	public void login() {
	  System.out.println("test case");
	  Reporter.log("its a reproter class", false);
	  Reporter.log("its a reproter class", true);
	}

}
