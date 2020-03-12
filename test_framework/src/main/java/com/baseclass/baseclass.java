package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseclass {
	protected WebDriver driver;
	//To launch browser
	 public void launchapp(String browser,String url)
	 {
		 try {  //Launch Firefox browser if browser=firefox
				if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver","src\\test\\resources\\Driver\\geckodriver.exe");
					driver = new FirefoxDriver();
				} 
				
				//Launch Chrome browser if browser=chrome
				else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
					driver=new ChromeDriver();

				}
				else if(browser.equalsIgnoreCase("explorer"))
				{
					
					System.setProperty("webdriver.ie.driver","C://Selenium//IEDriverServer.exe");
				    WebDriver driver1 = new InternetExplorerDriver();
					
				}
 
				//Maximize window and launchs the specified url
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(url);
			
			} 
		 
		    //Executed when browser can't be launched
		    catch (WebDriverException e) {
				System.out.println(" browser could not be launched");
			}
		
		}
	 
	 //Used to take screenshot
	 public void screenshot(String path) throws IOException {
		 
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(SrcFile,new File(path));
		 
		 
		 
	 }
	 
	  //Used to close the browser
	   public void quit(){
			
			driver.close();
			
	   }
}
