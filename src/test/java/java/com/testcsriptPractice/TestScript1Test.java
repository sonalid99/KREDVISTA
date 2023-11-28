package java.com.testcsriptPractice;

import org.testng.annotations.Test;

public class TestScript1Test {

	@Test(groups = "smoke")
	public void ts1Test()
	{
		System.out.println("---Test script-1----");
	}
	
	@Test(groups="regression")
	public void ts2Test()
	{
		System.out.println("---Test script-2----");
	}
	
	@Test(groups="regression")
	public void ts3Test()
	{
		System.out.println("---Test script-3----");
	}
}
