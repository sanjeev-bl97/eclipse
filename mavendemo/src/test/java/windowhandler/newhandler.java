package windowhandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newhandler {
	@Test
	public void hand() {
	
	
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://www.irctc.co.in/nget/train-search");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("CONTACT US")).click();
    Set<String>winHandles=driver.getWindowHandles();
    System.out.println("Size = "+winHandles.size());
    for(String winHandle:winHandles)
    {
    	driver.switchTo().window(winHandle);
    	
    }
    System.out.println(driver.getTitle());
    
    
	}
}
