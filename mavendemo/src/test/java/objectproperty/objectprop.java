package objectproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectprop {

	
	
	public static void main(String args[]) throws IOException {
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	driver.manage().window().maximize();
	Properties obj  =new Properties();
	FileInputStream objfile = new FileInputStream("src/test/resources/configuration/config.property");
	obj.load(objfile);
	
	
	
	driver.findElement(By.id(obj.getProperty("user"))).sendKeys("sanjeev.bl97@gmail.com");
	driver.findElement(By.id(obj.getProperty("pass"))).sendKeys("9003510663");
	driver.findElement(By.xpath(obj.getProperty("button"))).click();
	}
	
}
