package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Base;

public class TestCase extends Base 
{
	
	WebDriver driver;
	
	@BeforeClass
	
	public void toLaunch()
	{
		launchApp("chrome", "");
	}
	
	
	@Test
	
	
	
	@AfterClass
	public void toClose()
	{
		closeApp();
	}

}
