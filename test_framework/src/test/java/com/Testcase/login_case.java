package com.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.baseclass;
import com.exel_utiliti.excel_data;
import com.pages.account_page;
import com.pages.login_page;



public class login_case extends baseclass {
	@BeforeMethod
	public void startUp() {
		
		launchapp("chrome","https://www.amazon.in/");
		
		
	}
	@Test()
	public void login_case1() throws IOException
	{        login_page log  = new login_page(driver);
	          excel_data dat =new excel_data();
	         log.click_signin();
	         log.login(dat.excel_username(1),dat.excel_password(1));
	         screenshot("src\\test\\resources\\Screenshot\\login.png");
	         
	 }
	@Test()
	public void login_case2() throws IOException
	{        login_page log  = new login_page(driver);
	          excel_data dat =new excel_data();
	         log.click_signin();
	         log.login(dat.excel_username(2),dat.excel_password(2));
	        screenshot("src\\test\\resources\\Screenshot\\login2.png");
	         
	 }
	
	
	@AfterMethod
	public void close() {
		
		quit();
}
}
