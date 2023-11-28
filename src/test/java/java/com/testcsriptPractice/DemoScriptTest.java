package java.com.testcsriptPractice;

import org.testng.annotations.Test;

public class DemoScriptTest {

	@Test(groups = "regression")
	public void demo1() {
		System.out.println("====Demo1====");
	}
	
	@Test(groups = "smoke")
	public void demo2() {
		System.out.println("====Demo2====");

	}
	

	@Test(groups = "smoke")
	public void demo4() {
		System.out.println("====Demo2====");

	}
	@Test(groups = "smoke")
	public void demo3() {
		System.out.println("====Demo2====");

	}
}
