package Testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import Pages.Linkedinlogin;

public class Logintestcase extends WrapperEx  {
	
	
	@BeforeClass
	public void startUp() {
		
		launchapp("chrome","https://in.linkedin.com/");
		
		
	}
	@Test
	public void login()
	{        Linkedinlogin li = new Linkedinlogin(driver);
	         li.click_signin();
	         li.login_id("sanjeev.bl97@gmail.com");
	         li.login_password("9003510663");
	         li.click_signin1();
	}
	@AfterClass
	public void close() {
		
		quit();
		
	}

}
