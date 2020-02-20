package training;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;




public class chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://in.linkedin.com/");
	    //xpath partial xpath
	    driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();
	  
	    //xpath partial xpath and
	    driver.findElement(By.xpath("//*[@id='first-name-ember18' and @type='text']")).sendKeys("sanjeev");
	   //xpath partial xpath or
	    driver.findElement(By.xpath("//*[@data-test-form-input='lastName' or @id='last-name-ember18']")).sendKeys("prasad");
	    
	    //xpath contains used for partial id,class name
	    
	    driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("sanjeev.bl97@gmail.com");
	    
	    
	    driver.findElement(By.xpath("//*[starts-with(@id,'password')]")).sendKeys("9003510663");
	    
	   
	    //driver.findElement(By.className("nav__button-secondary")).click();
	    
	  // driver.findElement(By.id("username")).sendKeys("sanjeev.bl97@gmail.com");
	  // driver.findElement(By.id("password")).sendKeys("9003510663");
	  // driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	   
	  // driver.quit();
	    
	    //driver.findElement(By.linkText("Join now")).click();
	    
	    //driver.findElement(By.partialLinkText("Join")).click();
	   
	   
	}

}
