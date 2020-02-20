package windowhandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class phptravel {
	
	@Test
	public void tt() {
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://phptravels.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[8]/a/span")).click();
   // System.out.println(driver.getTitle());
    Set<String>winHandles=driver.getWindowHandles();
    for(String winHandle:winHandles)
    {
    	driver.switchTo().window(winHandle);
    	
    }
    //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
    System.out.println(driver.getTitle());
    driver.findElement(By.id("inputEmail")).sendKeys("asas");
    
    
	}
}
