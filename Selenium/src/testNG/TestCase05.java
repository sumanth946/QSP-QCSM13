package testNG;

import org.testng.annotations.Test;

public class TestCase05 {
	
	//we can given priority for test cases
	//default priority is zero
	//lowest priority wil execute firs, if priority is not given or priorities are same execution is in alphan=betical order
	//we can give negative priority
	
	//same priority
	@Test(priority=0)
	public void a1()
	{
		System.out.println("from a1 method");
	}
	@Test(priority=0)
	public void b1()
	{
		System.out.println("from b1 method");
	}
	@Test(priority=0)
	public void c1()
	{
		System.out.println("from c1 method");
	}
	@Test(priority=0)
	public void d1()
	{
		System.out.println("from d1 method");
	}
	
	//different priority
	@Test(priority=1)
	public void a2()
	{
		System.out.println("from a2 method");
	}
	@Test(priority=2)
	public void b2()
	{
		System.out.println("from b2 method");
	}
	@Test(priority=3)
	public void c2()
	{
		System.out.println("from c2 method");
	}
	@Test(priority=4)
	public void d2()
	{
		System.out.println("from d2 method");
	}
	
	//lowest priority
	@Test(priority=1)
	public void a3()
	{
		System.out.println("from a3 method");
	}
	@Test(priority=-5)
	public void b3()
	{
		System.out.println("from b3 method");
	}
	@Test(priority=3)
	public void c3()
	{
		System.out.println("from c3 method");
	}
	@Test(priority=-1)
	public void d3()
	{
		System.out.println("from d3 method");
	}
}
