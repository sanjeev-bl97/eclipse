package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class skills_page extends login_page {
	
	
	public void update_skills() throws InterruptedException {
		

		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'ADD DETAILS')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"itSkillSugg\"]")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"itSkillSugg\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"version\"]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"lastUsedDroopeFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_lastUsedDroope\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"expYearDroopeFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_expYearDroope\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"expMonthDroopeFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_expMonthDroope\"]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"saveITSkills\"]")).click();
		
		Thread.sleep(2000);
		driver.close();

	
	}
	
	
}
