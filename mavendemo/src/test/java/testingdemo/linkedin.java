package testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class linkedin {
	
	WebDriver driver;
	@Test
	  public void testcase1() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		 driver.findElement(By.id("username")).sendKeys("sanjeev.bl97@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("9003510663");
		 driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
		 
	  }
	@Test
	  public void testcase2() {
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div/a")).click();
		driver.findElement(By.id("first-name-ember18")).sendKeys("sanjeev");
		driver.findElement(By.id("last-name-ember18")).sendKeys("prasad");
		driver.findElement(By.id("email-address-ember18")).sendKeys("sanjeev.bl97@gmail.com");
		driver.findElement(By.id("password-ember18")).sendKeys("9003510663");
		driver.findElement(By.xpath("//*[@id=\"ember18\"]/form/button")).click();
	  }
	@Test
     public void testcase3() {
		 
		
		driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sanjeev.bl97@gmail.com");
		driver.findElement(By.id("reset-password-submit-button")).click();
     }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.get("https://in.linkedin.com/");
	        driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  
		  driver.close();
	  }
}
