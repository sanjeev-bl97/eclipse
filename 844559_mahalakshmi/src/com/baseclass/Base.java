package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	 protected WebDriver driver;
	 
	 //To Launch Browser and Website
	 public void launchApp(String browser,String url)
	 {
		 
		 try
		 {
			 if(browser.equalsIgnoreCase("chrome"))  //For Chrome Browser
			 {
				 System.getProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
				 driver=new ChromeDriver();
				}
				
				
				else if(browser.equalsIgnoreCase("firefox"))  //For Firefox Browser
				{
					System.setProperty("webdriver.gecko.driver","Driver\\geckodriver.exe");
					driver=new FirefoxDriver();
				}
				
				
				else if(browser.equalsIgnoreCase("internet explorer"))   //For Internet Explorer
				{
					System.setProperty("webdriver.gecko.driver","Driver\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}
			 
				driver.manage().window().maximize();  //To Maximize Window
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  //Time Wait
				driver.get(url);  //To Get Website URL
				
			}
			catch(WebDriverException e)
			{
				System.out.println("Browser Cannot be Launched");
			}
			
		}
	 
	 //To Close Browser
	 public void closeApp()
	 {
		 driver.close();
	 }
	 
}
		