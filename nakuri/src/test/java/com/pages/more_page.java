package com.pages;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class more_page extends login_page {
	
	
	
	public void more() throws InterruptedException
	{
		WebElement a =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/a/div"));
		WebElement b =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(a);
		act.moveToElement(b).click(b).build().perform();
		Thread.sleep(5000);
		
		
		Set<String>winHandles=driver.getWindowHandles();
	    
	    for(String winHandle:winHandles)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[5]/a/span")).click();
	    Set<String>winHandles2=driver.getWindowHandles();
	 
	    for(String winHandle:winHandles2)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
	    driver.findElement(By.xpath("//*[@id=\"skill\"]/div[1]/div[2]/input")).sendKeys("Java Developer");
	    driver.findElement(By.xpath("//*[@id=\"skill\"]/div[1]/div[2]/input")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"hvAtvJb\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"qsbFormBtn\"]")).click();
	    Thread.sleep(3000);
		
		driver.quit();
	}
}
