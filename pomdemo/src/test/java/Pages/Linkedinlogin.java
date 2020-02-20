package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Linkedinlogin {
	
	WebDriver driver;
	By signin =By.linkText("Sign in");
	By username =By.id("username");
	By password =By.id("password");
	By signin1 =By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	public Linkedinlogin(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void click_signin()
	{
		driver.findElement(signin).click();
		
	}
	public void click_signin1()
	{
		driver.findElement(signin1).click();
		
	}
	
	
	public void login_id(String value) {
		
		driver.findElement(username).sendKeys(value);
		
		
	}
   
	public void login_password(String value) {
		
		driver.findElement(password).sendKeys(value);
		
		
	}
	


	

}
