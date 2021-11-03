package testNG;

import org.testng.annotations.Test;

public class TestCase02_Group_Execution {
	
	@Test(groups={"regression test case"})
	public void sample() {
	    System.out.println("this is regression test case ");
	}
	@Test(groups={"smoke test case"})
	public void sample1() {
	    System.out.println("this is smoke test case 1");
	}
	
	//in this case it will execute when we include regression or smoke test in xml file
	/*
	 * @Test(groups={"smoke test case","regression test case"}) public void
	 * sample2() { System.out.println("this is smoke test case 1"); }
	 */

}
