package testingdemo;

import org.testng.annotations.Test;

public class dependsongroup {
	@Test(groups= {"functional testing","retesting"})
	public void login() {
		
		System.out.println("Login1");
		
	}
	@Test(groups= {"functional testing","retesting"})
	public void login2() {
		
		System.out.println("Login2");
		
	}
	@Test(groups= {"functional testing","smoke testing"})
	public void login3() {
		
		System.out.println("Login3");
		
	}
}
