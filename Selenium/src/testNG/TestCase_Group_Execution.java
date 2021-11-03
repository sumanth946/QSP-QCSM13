package testNG;

import org.testng.annotations.Test;

public class TestCase_Group_Execution {
	
	@Test(groups={"smoke test case"})
	public void sample() {
	    System.out.println("this is smoke test case 1");
	}
	@Test(groups={"regression test case"})
	public void sample1() {
	    System.out.println("this is regression test case 1");
	}


}
