package java.com.testcsriptPractice;

import org.testng.annotations.Test;

public class TestScriptTest {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("===testScript1===");
	}
	
	@Test
	public void test2() {
		System.out.println("===testScript2===");

	}

}
