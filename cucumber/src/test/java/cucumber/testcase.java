package cucumber;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {

	WebDriver driver;
	@Test
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	driver=new ChromeDriver();
			driver.get("https://www.google.co.in");
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("Hello Welcome");
	System.out.println("The page displays Google Search Button");
	driver.close();
	}
	}
}
