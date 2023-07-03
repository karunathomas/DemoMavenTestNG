package testNGDemo;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void loginTest() {
		System.out.println("Login");	
	}
	@Test()
	public void homePageTest() {
		System.out.println("homepage");
		}
}
