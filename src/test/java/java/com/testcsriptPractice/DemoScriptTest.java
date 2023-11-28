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
  
		System.out.println("======byeeeee===");
	}
	
	
	

	@Test(groups = "smoke")
	public void demo() {

		System.out.println("====Demo2====");

	}
	@Test(groups = "smoke")
	public void demo3() {
		System.out.println("====Demo3====");

	}
	@Test(groups = "smoke")
	public void demo4() {
		System.out.println("====Demo4====");

	}
	@Test(groups = "smoke")
	public void demo5() {
		System.out.println("====Demo5====");

	}
	
	@Test(groups = "smoke")
	public void demo6() {
		System.out.println("====Demo6====");
		System.out.println("--hello---");
		System.out.println("hi hello");
		
		
		
	}
}
