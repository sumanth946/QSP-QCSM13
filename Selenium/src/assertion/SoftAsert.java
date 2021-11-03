package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsert {
	//soft assert
	@Test
	public void soft() {
	String expectedTitle ="qspiders";
	String actualTitle="qspi";
	//all are non static method in softassert class
	//call assertall method to view/fail the test cases
	
	
	
   SoftAssert soft = new SoftAssert();
   soft.assertEquals(actualTitle,expectedTitle);
   soft.assertAll();
}
}
//maven catelog-->>open first link
//scroll down
//romote===catelog file