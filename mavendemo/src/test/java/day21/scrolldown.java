package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class scrolldown {
@Test
public void scroll() {
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    
	
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Launch the application		
    driver.get("https://www.carwale.com/?utm_source=google&utm_medium=cpc&utm_term=carwale&utm_campaign=6038662&gclid=Cj0KCQiA-bjyBRCcARIsAFboWg0fLvyg_MaHh5ru7Pk-5QQdEnARXhL62045eCZfGlqVLqmcMcLPmyUaAlb7EALw_wcB");

    		
    driver.manage().window().maximize();
    

    // This  will scroll down the page by  1000 pixel vertical		
    js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"moreComparison\"]/a")));
	
	
	
}
}
