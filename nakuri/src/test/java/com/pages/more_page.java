package com.pages;




import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class more_page extends login_page {
	
	
	
	public void more() throws InterruptedException
	{
		WebElement a =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[6]/a/div"));
		WebElement b =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[6]/div/ul[1]/li[2]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(a);
		act.moveToElement(b).click(b).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
