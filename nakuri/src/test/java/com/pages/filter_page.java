package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.excel_utility;

public class filter_page {
	static WebDriver driver;
	excel_utility eu = new excel_utility();
	
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void url()
	{
		driver.get("https://www.naukri.com/");
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"));
	}
		
	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
	
	public void login_search() throws IOException
	{   
        driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		driver.findElement(By.id("eLoginNew")).sendKeys("swasthikswasthik09876@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("!234567E");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	}
	
	public void search_job() throws InterruptedException {
		
	    driver.findElement(By.xpath("//*[@id=\"qsb-keyskill-sugg\"]")).sendKeys("dbms");
	    driver.findElement(By.xpath("//*[@id=\"qsb-location-sugg\"]")).sendKeys("chennai");
		driver.findElement(By.xpath("//*[@id=\"expDroope-experienceFor\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"ul_expDroope-experience\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"salaryDroope-salaryFor\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"ul_salaryDroope-salary\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"search-jobs\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"acord\"]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"acord\"]/div[2]/a[2]")).click();
		Thread.sleep(4000);
		
		
		
		driver.close();
		
	}
}
