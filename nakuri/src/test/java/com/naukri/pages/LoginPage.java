package com.naukri.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.naukri.excel.ExcelUtility;


//Login with two sets of data and logout
//This is the main page where launch and url methods are defined and extended by all other pages
public class LoginPage {

	static WebDriver driver;
	ExcelUtility eu = new ExcelUtility();
	
    //Launch the required browser
	public void launchChrome(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.ie.driver", "src\\test\\resources\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (WebDriverException e) {
			System.out.println("browser cant be launched");
		}
	}
	
    //Launches the naukri url
	public void url() {
		driver.get("https://www.naukri.com/");

		String windowTitle = getCurrentWindowTitle();                                     
		String mainWindow = getMainWindowHandle(driver);                                
		Assert.assertTrue(closeAllOtherWindows(mainWindow));                       //If all windows are closed except main window assert is true
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"));             //Asserts true if window title is Jobs - Recruitment
	}

	public String getMainWindowHandle(WebDriver driver) { 
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}

	// To close all the other  windows except the main window.

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
	
    //Login with data fetched from excel file in TestData folder under test resources
	public void login() throws IOException, InterruptedException {
		for (int i = 1; i <= 2; i++) {

			driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
			driver.findElement(By.id("eLoginNew")).sendKeys(eu.getUsername(i));
			driver.findElement(By.id("pLogin")).sendKeys(eu.getPassword(i));
			driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
			WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"));
			WebElement b = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[5]/a"));

			Actions act = new Actions(driver);
			act.moveToElement(a);
			Thread.sleep(2000);
			act.moveToElement(b).click(b).build().perform();
			Thread.sleep(2000);

			String windowTitle = getCurrentWindowTitle();
			String mainWindow = getMainWindowHandle(driver);
			Assert.assertTrue(closeAllOtherWindows(mainWindow));
			Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"));

		}

	}

	public void closeApp() {

		driver.quit();
	}
}
