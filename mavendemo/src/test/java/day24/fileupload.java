package day24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileupload {

	@Test
	public void fileup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("https://www.ilovepdf.com/pdf_to_word");
	  // driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	    
	    driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	   Runtime.getRuntime().exec("C:\\Users\\BLTuser.BLT0206\\Documents\\Uploadfile.exe");
		
	}
	
	
	
	
	
	
	
	
}
