package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/File-Upload/index.html");
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures//Desert.jpg");
        driver.findElement(By.id("submit-button")).click();
        
	}

}
