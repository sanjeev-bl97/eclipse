package day20;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardhandle {

	
	@Test
	public void key() {
		
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.linkedin.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("username")).sendKeys("sanjeev.bl97@gmail.com");
	    //driver.findElement(By.id("password")).sendKeys("23423");
	    
	    Actions act= new Actions(driver);
	  act.sendKeys(Keys.TAB).perform();
	  act.sendKeys("9003510663").perform();  
	    act.sendKeys(Keys.ENTER).perform();
	    act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();;
	    //act.sendKeys(Keys.TAB).perform();
	  //  act.keyUp(Keys.CONTROL).perform();
	   
	    
	    
	    
		
		
	}
	
}
