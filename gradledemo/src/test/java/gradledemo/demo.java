package gradledemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
@Test

public void tt() {
	
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://in.linkedin.com/");
	
}
}
