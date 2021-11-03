package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

@Test
public void Verification() {
	String expectedTitle = "qspiders";
	String actualTitle = "qspiders";
	
	boolean expectedFlag=false;
	boolean actualFlag=true;
	//hard assertion
	//all methods are static in Assert class
	//assertEquals method  
	
	Assert.assertEquals(actualTitle,expectedTitle );
	Assert.assertEquals(actualFlag,expectedFlag );
	Assert.assertTrue(actualFlag);
}

}
