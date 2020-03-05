package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class search_page {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	

	public search_page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void movedown(String values)
	{   //Enters mobile keyword in search bar
		driver.findElement(search).sendKeys(values);
		Actions d=new Actions(driver);
		//Moves three place down in suggestions under search bar and clicks the third option
		
		d.sendKeys(Keys.DOWN).build().perform();
		d.sendKeys(Keys.DOWN).build().perform();
		d.sendKeys(Keys.DOWN).build().perform();
		d.sendKeys(Keys.ENTER).build().perform();
	}
}
